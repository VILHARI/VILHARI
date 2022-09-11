package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.Dao.ChangePasswordDao;
import com.project.Dao.UserDAO;
import com.project.model.ChangePasswordModel;
import com.project.model.UserBean;

/**
 * Servlet implementation class ChangePassword
 */
@WebServlet("/ChangePasswordAdmin")
public class ChangePassword extends HttpServlet {
       
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 ChangePasswordModel cp = new ChangePasswordModel();
	     cp.setOldpass(request.getParameter("current"));
	     cp.setNewpass(request.getParameter("new"));
	     cp.setConfirmpass(request.getParameter("confirm"));

	     int msg = ChangePasswordDao.changepass(cp);	
	     if (msg ==1)
	     {
		        
	          HttpSession session = request.getSession(true);	    
	          session.setAttribute("currentSessionUser",msg); 
	          response.sendRedirect("changePassSuccess.jsp"); //logged-in page      		
	     }
		        
	     else 
	    	 
	          response.sendRedirect("ChangePassFail.jsp"); //error page 
	} 
			
	     }


	


