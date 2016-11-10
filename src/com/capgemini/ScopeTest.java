package com.capgemini;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ScopeTest")
public class ScopeTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ScopeTest() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		ServletContext context = getServletContext();
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		
		if(name != null) {
			request.setAttribute("requestName", name);
			session.setAttribute("sessionName", name);
			context.setAttribute("contextName", name);
		}
		
		out.println("request value " + request.getAttribute("requestName"));
		out.println("<br>");
		out.println("session value " + session.getAttribute("sessionName"));
		out.println("<br>");
		out.println("context value " + context.getAttribute("contextName"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
