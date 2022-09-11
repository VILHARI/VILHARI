package com.project.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.project.Dao.SearchDao;
import com.project.Dao.UserDAO;
import com.project.model.City;
import com.project.model.FlightDetails;
import com.project.model.SearchModel;
import com.project.model.SearchedData;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServletUrl")
public class SearchServlet extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String from = request.getParameter("fromcity");
			String to = request.getParameter("tocity");
			String date = request.getParameter("journeyDate");
			String personNo = request.getParameter("personNo");
			String cabinclass = request.getParameter("busiclass");
			FlightDetails fd = new FlightDetails();
			fd.setCabinClass(cabinclass);
			fd.setFrom(from);
			fd.setTo(to);
			fd.setNoOfPerson(Integer.parseInt(personNo));
			fd.setJourneyDate(date);
			System.out.println(from);
			List<SearchedData> searcheddata = SearchDao.getSearchedData(fd);
			if (searcheddata != null) {

				HttpSession session = request.getSession(true);
				session.setAttribute("searched", searcheddata);
				session.setAttribute("journeydate", date);
				session.setAttribute("destination", to);

		        response.sendRedirect("booking.jsp");       		

			}

		}

		catch (Throwable theException) {
			System.out.println(theException);
		}
	}

}
