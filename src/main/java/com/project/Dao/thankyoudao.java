package com.project.Dao;

import java.sql.Connection;
import java.sql.Statement;

import com.project.manager.ConnectionManager;
import com.project.model.PassengerDetails;

public class thankyoudao {
	


	static Connection currentCon = null;
	static int rs = 0;

	public static int savebookingDetails(String emailid, String flightNo, String date) {

		Statement stmt = null;

		String searchQuery = "insert into booking(flight_no,email_id,traveldate) values("
				+"'"+ flightNo+"'" + "," +"'"+ emailid +"'"+ "," +"'" +date+"'"+");";

		System.out.println("Query: " + searchQuery);
		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeUpdate(searchQuery);

			return rs;
		} catch (Exception ex) {
			System.out.println("An Exception has occurred! " + ex);
		}

		// some exception handling
		finally {

			if (stmt != null) {
				try {
					stmt.close();
				} catch (Exception e) {
				}
				stmt = null;
			}

			if (currentCon != null) {
				try {
					currentCon.close();
				} catch (Exception e) {
				}

				currentCon = null;
			}
		}
		return 0;

	}


}
