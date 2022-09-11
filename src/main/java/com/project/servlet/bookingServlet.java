package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class bookingServlet
 */
@WebServlet("/bookingServletUrl")
public class bookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String flightNo = request.getParameter("flightno");
		String price = request.getParameter("price");
		System.out.println("price........."+price);
		System.out.println("flightno......"+flightNo);
		HttpSession session = request.getSession(true);
		session.setAttribute("flightNo", flightNo);
		
		session.setAttribute("price", price);

        response.sendRedirect("register.jsp");      
	}

}
