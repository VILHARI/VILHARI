package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.Dao.thankyoudao;

/**
 * Servlet implementation class thankyou
 */
@WebServlet("/thankyouurl")
public class thankyou extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String emailid = (String)session.getAttribute("emailid");
		String flightNo = (String)session.getAttribute("flightNo");
		String date = (String) session.getAttribute("journeydate");
		
		System.out.println("emailid.3........"+emailid);
		System.out.println("flightno3......"+flightNo);
		System.out.println("date.............."+date);
		int t = thankyoudao.savebookingDetails(emailid,flightNo,date);
		if(t==1) {
	        response.sendRedirect("thankyou.jsp");      

		}

	}


	

}
