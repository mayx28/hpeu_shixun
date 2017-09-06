package com.qingshixun.atm.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class SecurityFilter
 */
@WebFilter("/*")
public class SecurityFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public SecurityFilter() {

	}

	public void destroy() {

	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// 处理乱码
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=utf-8");

		HttpServletRequest httpServletRequest = (HttpServletRequest) request;

		Object index = httpServletRequest.getSession().getAttribute("accountindex");
		// 获得地址
		String requestURI = httpServletRequest.getRequestURI();

		if (requestURI.contains("Login") || requestURI.contains("images") || requestURI.contains("css")
				|| index != null) {// 如果地址包括login/images/css，或者存在session则放行
			chain.doFilter(request, response);
		} else {// 其他情况则返回到登陆界面
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
