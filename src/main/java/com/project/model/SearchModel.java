package com.project.model;

public class SearchModel {
private String origin;
private String desination;
private String date;
public String getOrigin() {
	return origin;
}
public void setOrigin(String origin) {
	this.origin = origin;
}
public String getDesination() {
	return desination;
}
public void setDesination(String desination) {
	this.desination = desination;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
@Override
public String toString() {
	return "SearchModel [origin=" + origin + ", desination=" + desination + ", date=" + date + "]";
}


}
