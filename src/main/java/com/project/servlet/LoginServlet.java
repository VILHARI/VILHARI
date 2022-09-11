package com.project.servlet;

	import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;
	import javax.servlet.http.HttpSession;

import com.project.Dao.UserDAO;
import com.project.Dao.bookingDetailsDao;
import com.project.model.ChangePasswordModel;
import com.project.model.UserBean;
import com.project.model.bookingDetails;

	/**
	 * Servlet implementation class LoginServlet
	 */
@WebServlet("/loginServletUrl")

	public class LoginServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) 
				           throws ServletException, java.io.IOException {

	try
	{	    
		
	     UserBean user = new UserBean();
	     user.setUserName(request.getParameter("un"));
	     user.setPassword(request.getParameter("pw"));

	     user = UserDAO.login(user);
		   		    
	     if (user.isValid())
	     {
		        
	          HttpSession session = request.getSession(true);	    
	          session.setAttribute("currentSessionUser",user);
	          session.setAttribute("cityList",user.getAlc());

	          
	          if(user.isAdmin()) {
	        	  ArrayList<bookingDetails> alldetail = bookingDetailsDao.getBookedData();
	        	  System.out.println(alldetail);
	              session.setAttribute("bookingDetail",alldetail);
	        	  response.sendRedirect("listbookingdataforadmin.jsp");
		         // response.sendRedirect("changePassword.jsp");       		
	          }else
	          {
	        	  response.sendRedirect("SearchPage.jsp");
	          }
	     }
		        
	     else 
	          response.sendRedirect("invalidLogin.jsp"); //error page 
	} 
			
			
	catch (Throwable theException) 	    
	{
	     System.out.println(theException); 
	}
	       }
		}

