package com.project.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.Dao.bookingDetailsDao;
import com.project.model.bookingDetails;

/**
 * Servlet implementation class BookingDetails
 */
@WebServlet("/BookingDetailsurls")
public class BookingDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("changePassword.jsp");       		


	}

}
