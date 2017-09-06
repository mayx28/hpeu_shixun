package com.qingshixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qingshixun.atm.service.AccountServiceImpI;

/**
 * Servlet implementation class WithdrawServlet
 */
@WebServlet("/WithdrawServlet")
public class WithdrawServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	AccountServiceImpI accountServiceImpI = new AccountServiceImpI();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		// 获取取款的金额
		double withdrawAmount = Double.parseDouble(request.getParameter("withdrawAmount"));
		//
		int index = (int) request.getSession().getAttribute("accountindex");
		double nowbalance = accountServiceImpI.queryBlance(index);

		if (withdrawAmount < nowbalance) {
			double balance = accountServiceImpI.withdraw(index, withdrawAmount);
			request.setAttribute("balance", balance);
			request.getRequestDispatcher("/withdrawResult.jsp").forward(request, response);
		} else {
			request.setAttribute("message", "*余额不足啦!!!");
			request.getRequestDispatcher("/withdraw.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
