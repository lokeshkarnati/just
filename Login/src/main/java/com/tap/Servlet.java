package com.tap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet")
public class Servlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		String userName = req.getParameter("userName");
		String password = req.getParameter("password");
		
		PrintWriter out = resp.getWriter();
		out.print("Welcome "+userName);
		RequestDispatcher rd = req.getRequestDispatcher("Login.html");
		rd.include(req, resp);
	}

}
