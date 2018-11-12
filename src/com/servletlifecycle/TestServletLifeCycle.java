package com.servletlifecycle;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestServletLifeCycle
 */
@WebServlet("/TestServletLifeCycle")
public class TestServletLifeCycle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("-- doGet() --");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("-- doPost() --");
	}

    @PostConstruct
	private void funPc() {
		// TODO Auto-generated method stub
		System.out.println("-- @PostConstruct --");
	}
	
    @Override
	public void init() throws ServletException {
		System.out.println("-- init() --");
	}

    @Override
	public void destroy() {
		System.out.println("-- destory() --");
	}
	
	@PreDestroy
	private void funPd() {
		// TODO Auto-generated method stub
		System.out.println("-- @PreDestroy --");
	}

}
