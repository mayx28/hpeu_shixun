package com.qingshixun.atm.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qingshixun.atm.service.AccountServiceImpI;

/**
 * Servlet implementation class TransferServlet
 */
@WebServlet("/TransferServlet")
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	AccountServiceImpI accountServiceImpI = new AccountServiceImpI();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		int index = (int) request.getSession().getAttribute("accountindex");

		String targetAccountName = request.getParameter("targetAccountName");
		double transferAmount = Double.parseDouble(request.getParameter("transferAmount"));

		double balance = accountServiceImpI.transfer(index, targetAccountName, transferAmount);
		//根据返回值提示不同的信息
		if (balance == -1) {
			request.setAttribute("message", "*不能给自己转账哦~~");
			request.getRequestDispatcher("/transfer.jsp").forward(request, response);
		} else if (balance == -2) {
			request.setAttribute("message", "*余额不足~~");
			request.getRequestDispatcher("/transfer.jsp").forward(request, response);
		} else if (balance == -3) {
			request.setAttribute("message", "*请输入正确的用户名~~");
			request.getRequestDispatcher("/transfer.jsp").forward(request, response);
		} else {
			request.setAttribute("balance", balance);
			request.getRequestDispatcher("/transferResult.jsp").forward(request, response);
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
