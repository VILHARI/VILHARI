package com.project.Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.project.manager.ConnectionManager;
import com.project.model.ChangePasswordModel;

public class ChangePasswordDao {
	static Connection currentCon = null;
	   static ResultSet rs = null;  
	   public  static  int changepass(ChangePasswordModel cp) {

			
		      Statement stmt = null;    
			
		      String oldpass = cp.getOldpass();    
		      String newpass = cp.getNewpass();  
		      String confirm = cp.getConfirmpass();
			    
		      String searchQuery =
		            "select * from users where passward='"+oldpass+"'";
			    
		   System.out.println("Your password is " + oldpass);
		   System.out.println("Query: "+searchQuery);
		   int id = 0 ;
		   String pass = null;
		   try 
		   {
		      //connect to DB 
		      currentCon = ConnectionManager.getConnection();
		      stmt=currentCon.createStatement();
		      rs = stmt.executeQuery(searchQuery);	        
		      
		      while(rs.next()){
		    	  id=rs.getInt("id");
		    	   pass=rs.getString("passward");
		      }
			      if(pass!=null && id!=0) {
			    	  
			      
		    	  if(pass.equals(oldpass)){
		    		  Statement st1=currentCon.createStatement();
		    		  int i=st1.executeUpdate("update users set passward='"+newpass+"' where id='"+id+"'");
		    		  if(i==1) {
			    		  System.out.println("Password changed successfully");
			    		  String msg = "Password changed successfully";
			    		  return 1;
		    		  }
		    		  else {
			    		  System.out.println("fail to update");
			    		  String msg = "fail to update";

			    		  return 2;

		    		  }
		    		  }
		    		  else{
		    		  System.out.println("Invalid Current Password");
		    		  String msg = "Invalid Current Password";
		    		  return 3;

		    		  }
			      }
		   
		   }
		   catch (Exception ex) 
		   {
		      System.out.println("An Exception has occurred! " + ex);
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
		return 0;

			
		   
	   }
}
