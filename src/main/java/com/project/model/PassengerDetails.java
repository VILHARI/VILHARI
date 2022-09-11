package com.project.model;

public class PassengerDetails {
	public String fullname;
	public String address;
	public int age;
	public String mobileno;
	public String emailId;
	public String doc;
	public String docNumber;
	public String flightNo;

public String getFlightNo() {
	return flightNo;
}
public void setFlightNo(String flightNo) {
	this.flightNo = flightNo;
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
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getMobileno() {
	return mobileno;
}
public void setMobileno(String mobileno) {
	this.mobileno = mobileno;
}
public String getEmailId() {
	return emailId;
}
public void setEmailId(String emailId) {
	this.emailId = emailId;
}
public String getDoc() {
	return doc;
}
public void setDoc(String doc) {
	this.doc = doc;
}
public String getDocNumber() {
	return docNumber;
}
public void setDocNumber(String docNumber) {
	this.docNumber = docNumber;
}
@Override
public String toString() {
	return "PassengerDetails [fullname=" + fullname + ", address=" + address + ", age=" + age + ", mobileno=" + mobileno
			+ ", emailId=" + emailId + ", doc=" + doc + ", docNumber=" + docNumber + ", flightNo=" + flightNo + "]";
}

}
