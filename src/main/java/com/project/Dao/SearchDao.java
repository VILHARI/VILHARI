package com.project.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.project.manager.ConnectionManager;
import com.project.model.City;
import com.project.model.FlightDetails;
import com.project.model.SearchedData;
import com.project.model.UserBean;

public class SearchDao {

	static Connection currentCon = null;
	static ResultSet rs = null;

	public static ArrayList<City> getCity() {
		ArrayList<City> alc = new ArrayList<City>();

		Statement stmt = null;

		String searchQuery = "select * from city";

		System.out.println("Query: " + searchQuery);

		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);

			while (rs.next()) {
				City c = new City();
				c.setCityid(rs.getInt("cityid"));
				c.setCityname(rs.getString("cityName"));
				alc.add(c);

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

		return alc;

	}

	public static ArrayList<SearchedData> getSearchedData(FlightDetails fd) {
		Statement stmt = null;
		ArrayList<SearchedData> alsd = new ArrayList<SearchedData>();

		//String searchQuery = "select * from flightDetails where source_city="+fd.getFrom()+"destination_city="+fd.getTo();
		 String searchQuery = "select * from flightDetails where source_city='"
	              + fd.getFrom()
	              + "' AND destination_city='"
	              + fd.getTo()
	              +"'AND class='"
	              +fd.getCabinClass()
	              + "'";

		System.out.println("Query: " + searchQuery);

		try {
			// connect to DB
			currentCon = ConnectionManager.getConnection();
			stmt = currentCon.createStatement();
			rs = stmt.executeQuery(searchQuery);

			while (rs.next()) {
				SearchedData sd = new SearchedData();
				sd.setAirlinename(rs.getString("airline_name"));
				sd.setArrivaltime(rs.getString("arrivalTime"));
				sd.setCabinclass(rs.getString("class"));
				sd.setDeparturetime(rs.getString("departureTime"));
				sd.setFrom(rs.getString("source_city"));
				sd.setPrice(rs.getString("price"));
				sd.setTo(rs.getString("destination_city"));
				sd.setFlightNo(rs.getString("fligtno"));
				alsd.add(sd);
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
