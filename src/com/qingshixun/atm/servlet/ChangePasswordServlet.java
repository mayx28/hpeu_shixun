package com.qingshixun.atm.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qingshixun.atm.service.AccountServiceImpI;

/**
 * Servlet implementation class ChangePasswordServlet
 */
@WebServlet("/ChangePasswordServlet")
public class ChangePasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServiceImpI accountServiceImpI = new AccountServiceImpI();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");
		// 获得新密码
		String newpassword = (String) request.getParameter("newPasswordAgain");
		// 获得输入的原密码
		String originalPassword = (String) request.getParameter("originalPassword");

		int index = (int) request.getSession().getAttribute("accountindex");
		// 获得返回值，根据返回值做出处理
		int result = accountServiceImpI.changePassword(index, newpassword, originalPassword);
		if (result != -1) {
			// 修改密码成功，提示需要重新登陆，返回到LogoutServlet销毁session并回到登录界面
			response.getWriter().print(
					"<script language='JavaScript'>alert('修改密码成功，请重新登录~');location.href='LogoutServlet';</script >");
		} else {
			request.setAttribute("message", "*原密码错误！！！");
			request.getRequestDispatcher("/changePassword.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
