package com.project.model;

public class SearchedData {
	public String from ;
	public String to;
	public String airlinename;
	public String price;
	public String arrivaltime;
	public String departuretime;
	public String cabinclass;
	public String journeyDate;
	public String flightNo;
	

	public String getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}
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
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getArrivaltime() {
		return arrivaltime;
	}
	public void setArrivaltime(String arrivaltime) {
		this.arrivaltime = arrivaltime;
	}
	public String getDeparturetime() {
		return departuretime;
	}
	public void setDeparturetime(String departuretime) {
		this.departuretime = departuretime;
	}
	public String getCabinclass() {
		return cabinclass;
	}
	public void setCabinclass(String cabinclass) {
		this.cabinclass = cabinclass;
	}
	@Override
	public String toString() {
		return "SearchedData [from=" + from + ", to=" + to + ", airlinename=" + airlinename + ", price=" + price
				+ ", arrivaltime=" + arrivaltime + ", departuretime=" + departuretime + ", cabinclass=" + cabinclass
				+ ", journeyDate=" + journeyDate + ", flightNo=" + flightNo + "]";
	}
	
}
