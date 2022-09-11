package com.project.model;

public class bookingDetails {
public String flight_no ;
public String email_id  ;
public String traveldate;
public String airline_name ;
public String price  ;
public String source_city  ;
public String destination_city  ;
public String departureTime  ;
public String arrivalTime  ;
public String classtype ;
public String fullname  ;
public String address;
public String age ;
public String mobile ;
public String documentname ;
public String docId;
public String getFlight_no() {
	return flight_no;
}
public void setFlight_no(String flight_no) {
	this.flight_no = flight_no;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public String getTraveldate() {
	return traveldate;
}
public void setTraveldate(String traveldate) {
	this.traveldate = traveldate;
}
public String getAirline_name() {
	return airline_name;
}
public void setAirline_name(String airline_name) {
	this.airline_name = airline_name;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public String getSource_city() {
	return source_city;
}
public void setSource_city(String source_city) {
	this.source_city = source_city;
}
public String getDestination_city() {
	return destination_city;
}
public void setDestination_city(String destination_city) {
	this.destination_city = destination_city;
}
public String getDepartureTime() {
	return departureTime;
}
public void setDepartureTime(String departureTime) {
	this.departureTime = departureTime;
}
public String getArrivalTime() {
	return arrivalTime;
}
public void setArrivalTime(String arrivalTime) {
	this.arrivalTime = arrivalTime;
}
public String getClasstype() {
	return classtype;
}
public void setClasstype(String classtype) {
	this.classtype = classtype;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getAge() {
	return age;
}
public void setAge(String age) {
	this.age = age;
}
public String getMobile() {
	return mobile;
}
public void setMobile(String mobile) {
	this.mobile = mobile;
}
public String getDocumentname() {
	return documentname;
}
public void setDocumentname(String documentname) {
	this.documentname = documentname;
}
public String getDocId() {
	return docId;
}
public void setDocId(String docId) {
	this.docId = docId;
}
@Override
public String toString() {
	return "bookingDetails [flight_no=" + flight_no + ", email_id=" + email_id + ", traveldate=" + traveldate
			+ ", airline_name=" + airline_name + ", price=" + price + ", source_city=" + source_city
			+ ", destination_city=" + destination_city + ", departureTime=" + departureTime + ", arrivalTime="
			+ arrivalTime + ", classtype=" + classtype + ", fullname=" + fullname + ", address=" + address + ", age="
			+ age + ", mobile=" + mobile + ", documentname=" + documentname + ", docId=" + docId + "]";
}


}
