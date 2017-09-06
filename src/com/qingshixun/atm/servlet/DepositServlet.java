package com.qingshixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qingshixun.atm.service.AccountServiceImpI;

/**
 * Servlet implementation class DepositServlet
 */
@WebServlet("/DepositServlet")
public class DepositServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AccountServiceImpI accountServiceImpI = new AccountServiceImpI();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		// 获取存款的金额
		double depositAmount = Double.parseDouble(request.getParameter("depositAmount"));

		// 获取处理后的余额
		int index = (int) request.getSession().getAttribute("accountindex");
		double balance = accountServiceImpI.deposit(index, depositAmount);
 
		request.setAttribute("balance", balance);
		// 跳转到查询余额的界面
		request.getRequestDispatcher("/depositResult.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
