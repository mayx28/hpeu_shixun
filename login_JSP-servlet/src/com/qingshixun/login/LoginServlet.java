package com.qingshixun.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		// 接收提交的数据
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String remember = request.getParameter("remember");

		// 判断是否为指定的用户名和密码
		if ("admin".equals(name) && "admin".equals(password)) {
			// 将数据存储在request中
			request.setAttribute("name", name);
			request.setAttribute("password", password);
			request.setAttribute("remember", remember);
			// 跳转到welcome.jsp
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);

		} else {
			request.setAttribute("message", "*用户名或密码错误！");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
