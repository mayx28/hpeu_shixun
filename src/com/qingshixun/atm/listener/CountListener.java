package com.qingshixun.atm.listener;

import javax.servlet.ServletContext;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class CountListener
 *
 */
@WebListener
public class CountListener implements HttpSessionListener {
	//定义一个变量用来记录在线的人数
	private int count = 0;

	public void sessionCreated(HttpSessionEvent se) {
		//每次创建session时count自加
		count++;
		
		HttpSession sesssion = se.getSession();
		ServletContext sct = sesssion.getServletContext();
		
		sct.setAttribute("count", count);
	}

	public void sessionDestroyed(HttpSessionEvent se) {
		//session销毁时count自减
		count--;
		
		HttpSession session = se.getSession();
		ServletContext sct = session.getServletContext();
		
		sct.setAttribute("count", count);
	}

}
