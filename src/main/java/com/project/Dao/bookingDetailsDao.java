package com.project.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.project.manager.ConnectionManager;
import com.project.model.City;
import com.project.model.FlightDetails;
import com.project.model.SearchedData;
import com.project.model.bookingDetails;

public class bookingDetailsDao {

	static Connection currentCon = null;
	static ResultSet rs = null;


	public static ArrayList<bookingDetails> getBookedData() {
		Statement stmt = null;
		ArrayList<bookingDetails> alsd = new ArrayList<bookingDetails>();

		 String searchQuery = "SELECT b.* ,fd.*,pd.* FROM booking b, flightdetails fd,passengerdetailsv2 pd WHERE b.flight_no =fd.fligtno and b.email_id=pd.emailid;";

		System.out.println("Query: " + searchQuery);

		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);

			while (rs.next()) {
				bookingDetails bd = new bookingDetails();
				bd.setAddress(rs.getString("address"));
				bd.setAge(rs.getString("age"));
				bd.setAirline_name(rs.getString("airline_name"));
				bd.setArrivalTime(rs.getString("arrivalTime"));
				bd.setClasstype(rs.getString("class"));
				bd.setDepartureTime(rs.getString("departureTime"));
				bd.setDestination_city(rs.getString("destination_city"));
				bd.setDocId(rs.getString("docId"));
				bd.setDocumentname(rs.getString("documentname"));
				bd.setEmail_id(rs.getString("emailid"));
				bd.setFlight_no(rs.getString("flight_no"));
				bd.setFullname(rs.getString("fullname"));
				bd.setMobile(rs.getString("mobile"));
				bd.setPrice(rs.getString("price"));
				bd.setSource_city(rs.getString("source_city"));
				bd.setTraveldate(rs.getString("travelDate"));
				
				alsd.add(bd);
			}

		}

		catch (Exception ex) {
			System.out.println(ex);
		}

		// some exception handling
		finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (Exception e) {
				}
				rs = null;
			}

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
return alsd;
	}

}
