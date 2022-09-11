package com.project.model;

import java.util.ArrayList;

public class UserBean {
		
	      private String username;
	      private String password;
	      private String firstName;
	      private String lastName;
	      public boolean valid;
	      public boolean admin;
	      public ArrayList<City> alc; 
	      
		
		
	    

		@Override
		public String toString() {
			return "UserBean [username=" + username + ", password=" + password + ", firstName=" + firstName
					+ ", lastName=" + lastName + ", valid=" + valid + ", admin=" + admin + ", alc=" + alc + "]";
		}

		public ArrayList<City> getAlc() {
			return alc;
		}

		public void setAlc(ArrayList<City> alc) {
			this.alc = alc;
		}

		public boolean isAdmin() {
			return admin;
		}

		public void setAdmin(boolean admin) {
			this.admin = admin;
		}

		public String getFirstName() {
	         return firstName;
		}

	      public void setFirstName(String newFirstName) {
	         firstName = newFirstName;
		}

		
	      public String getLastName() {
	         return lastName;
				}

	      public void setLastName(String newLastName) {
	         lastName = newLastName;
				}
				

	      public String getPassword() {
	         return password;
		}

	      public void setPassword(String newPassword) {
	         password = newPassword;
		}
		
				
	      public String getUsername() {
	         return username;
				}

	      public void setUserName(String newUsername) {
	         username = newUsername;
				}

					
	      public boolean isValid() {
	         return valid;
		}

	      public void setValid(boolean newValid) {
	         valid = newValid;
		}	
	
}
