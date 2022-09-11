package com.project.model;

public class FlightDetails {
private String from ;
private String to;
private int noOfPerson;
private String cabinClass;
private String journeyDate;

public String getJourneyDate() {
	return journeyDate;
}
public void setJourneyDate(String journeyDate) {
	this.journeyDate = journeyDate;
}
public String getFrom() {
	return from;
}
public void setFrom(String from) {
	this.from = from;
}
public String getTo() {
	return to;
}
public void setTo(String to) {
	this.to = to;
}
public int getNoOfPerson() {
	return noOfPerson;
}
public void setNoOfPerson(int noOfPerson) {
	this.noOfPerson = noOfPerson;
}
public String getCabinClass() {
	return cabinClass;
}
public void setCabinClass(String cabinClass) {
	this.cabinClass = cabinClass;
}
@Override
public String toString() {
	return "FlightDetails [from=" + from + ", to=" + to + ", noOfPerson=" + noOfPerson + ", cabinClass=" + cabinClass
			+ ", journeyDate=" + journeyDate + "]";
}

}
