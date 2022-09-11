package com.project.Dao;

import java.text.*;
import java.util.*;

import com.project.manager.ConnectionManager;
import com.project.model.City;
import com.project.model.UserBean;

import java.sql.*;

public class UserDAO 	
{
   static Connection currentCon = null;
   static ResultSet rs = null;  
	
	
	
   public static UserBean login(UserBean bean) {
	
      //preparing some objects for connection 
      Statement stmt = null;    
	
      String username = bean.getUsername();    
      String password = bean.getPassword();   
		ArrayList<City> alc = new ArrayList<City>();

      String searchQuery =
            "select * from users where email='"
                     + username
                     + "' AND passward='"
                     + password
                     + "'";
      String isadminquery = "select * from users where email='"
              + username
              + "' AND passward='"
              + password
              + "'";
      
		String cityQuery = "select * from city";

	    
   // "System.out.println" prints in the console; Normally used to trace the process
   System.out.println("Your user name is " + username);          
   System.out.println("Your password is " + password);
   System.out.println("Query: "+searchQuery);
	    
   try 
   {
      //connect to DB 
      currentCon = ConnectionManager.getConnection();
      stmt=currentCon.createStatement();
      rs = stmt.executeQuery(searchQuery);	
      boolean more = rs.next();
      
	       
      // if user does not exist set the isValid variable to false
      if (!more) 
      {
         System.out.println("Sorry, you are not a registered user! Please sign up first");
         bean.setValid(false);
      } 
	        
      //if user exists set the isValid variable to true
      else if (more) 
      {
          ResultSet rs1 = stmt.executeQuery(isadminquery);
          int isadmin;
          while(rs1.next()) {
        	  isadmin = rs1.getInt("isAdmin");
        	  if(isadmin==1) {
            	  bean.setAdmin(true);
        	  }
          }
	     	
         System.out.println("Welcome ");
        
         bean.setValid(true);
         
         
         
         ResultSet rs2 = stmt.executeQuery(cityQuery);

			while (rs2.next()) {
				City c = new City();
				c.setCityid(rs2.getInt("cityid"));
				c.setCityname(rs2.getString("cityName"));
				alc.add(c);

			}
			bean.setAlc(alc);
      }
   } 

   catch (Exception ex) 
   {
      System.out.println("Log In failed: An Exception has occurred! " + ex);
   } 
	    
   //some exception handling
   finally 
   {
      if (rs != null)	{
         try {
            rs.close();
         } catch (Exception e) {}
            rs = null;
         }
	
      if (stmt != null) {
         try {
            stmt.close();
         } catch (Exception e) {}
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

return bean;
	
   }	
}