package com.capgemini.assignment;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.setAttribute("lname", request.getParameter("lname"));
		PrintWriter out = response.getWriter();
		out.print("Frist Name " + session.getAttribute("fname"));
		out.print("<br>");
		out.print("Last Name " + request.getParameter("lname"));
		
		out.print("<html>");
		out.print("<head></head>");
		out.print("<body bgcolor=\"#f0f0f0\">");
		out.print("<form action=\"ThirdServlet\">");
		out.print("Qualification ");
		out.print("<input name=\"qul\" type=\"text\"></input>");
		out.print("<input type=\"submit\"></input>");
		out.print("</form>");
		out.print("</body>");
		out.print("</html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
