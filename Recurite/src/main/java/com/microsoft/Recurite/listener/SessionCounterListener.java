package com.microsoft.Recurite.listener;

import java.util.concurrent.atomic.AtomicInteger;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class SessionCounterListener implements HttpSessionListener{

	private static AtomicInteger sessionCounter=new AtomicInteger(0);

	@Override
	public void sessionCreated(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		sessionCounter.getAndIncrement();
		se.getSession().getServletContext().setAttribute("onlineNumber", sessionCounter.get());
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		// TODO Auto-generated method stub
		sessionCounter.getAndDecrement();
		se.getSession().getServletContext().setAttribute("onlineNumber", sessionCounter.get());
	}
}
