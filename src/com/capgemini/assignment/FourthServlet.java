package com.capgemini.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/FourthServlet")
public class FourthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FourthServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("mark", request.getParameter("mark"));
		PrintWriter out = response.getWriter();
		out.print("First Name " + session.getAttribute("fname"));
		out.print("<br>");
		out.print("Last Name " + session.getAttribute("lname"));
		out.print("<br>");
		out.print("Qualification " + session.getAttribute("qul"));
		out.print("<br>");
		out.print("Mark " + request.getParameter("mark"));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}