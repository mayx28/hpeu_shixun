package com.qingshixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qingshixun.atm.service.AccountServiceImpI;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AccountServiceImpI accountServiceImpI = new AccountServiceImpI();

	public LoginServlet() {
		accountServiceImpI.initAccounts();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		// 接收提交数据
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// 获取登陆时返回的索引
		int result = accountServiceImpI.login(username, password);
		// 判断登陆是否成功，返回指定界面
		if (result != -1) {
			// 将用户的索引信息保存在session里面，以便后面使用
			HttpSession session = request.getSession();
			session.setAttribute("accountindex", result);
			request.getRequestDispatcher("/index.jsp").forward(request, response);

		} else {
			request.setAttribute("message", "*用户名或密码错误！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
