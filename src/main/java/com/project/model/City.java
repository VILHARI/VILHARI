package com.project.model;

public class City {
private int cityid;
private String cityname;
public int getCityid() {
	return cityid;
}
public void setCityid(int cityid) {
	this.cityid = cityid;
}
public String getCityname() {
	return cityname;
}
public void setCityname(String cityname) {
	this.cityname = cityname;
}
@Override
public String toString() {
	return "City [cityid=" + cityid + ", cityname=" + cityname + "]";
}

}
