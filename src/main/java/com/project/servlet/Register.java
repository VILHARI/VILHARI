package com.project.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.Dao.RegisterDAo;
import com.project.model.PassengerDetails;

/**
 * Servlet implementation class Register
 */
@WebServlet("/RegisterUrl")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("fname");
		String address = request.getParameter("address");
		String age = request.getParameter("age");
		String mobile = request.getParameter("mobile");
		String emailid = request.getParameter("emailid");
		String document = request.getParameter("doc");
		String docId = request.getParameter("docNumber");
		PassengerDetails pd = new PassengerDetails();
		pd.setAddress(address);
		pd.setAge(Integer.parseInt(age));
		pd.setDoc(document);
		pd.setDocNumber(docId);
		pd.setEmailId(emailid);
		pd.setFullname(fname);
		pd.setMobileno(mobile);
		int status = RegisterDAo.savePassengerDetails(pd);
		if(status==1) {
			HttpSession session = request.getSession(true);
			session.setAttribute("personalDetails", pd);
			String flightNo = (String)session.getAttribute("flightNo");
			String price = (String)session.getAttribute("price");
		    session.setAttribute("emailid", emailid);
		    session.setAttribute("fname", fname);
			System.out.println("price.2........"+price);
			System.out.println("flightno2......"+flightNo);
	        response.sendRedirect("payment.jsp"); 

		}
		
		

	}

}
