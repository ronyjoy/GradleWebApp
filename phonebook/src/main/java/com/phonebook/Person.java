package com.phonebook;
public class Person {

private String fname;
private String lname;
private String mname;
private String email;
private String homePhone;
private String mobile;
private String businessPhone;

public Person (String fname, String lname, String mobile) {
	this.fname = fname;
	this.lname = lname;
	this.mobile = mobile;
}

public Person (String fname, String lname, String mname, String email, String homePhone, 
	String mobile, String businessPhone) {
	this.fname = fname;
	this.lname = lname;
	this.mname = mname;
	this.email = email;
	this.homePhone = homePhone;
	this.mobile = mobile;
	this.businessPhone = businessPhone;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public String getMname() {
	return mname;
}

public void setMname(String mname) {
	this.mname = mname;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getHomePhone() {
	return homePhone;
}

public void setHomePhone(String homePhone) {
	this.homePhone = homePhone;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public String getBusinessPhone() {
	return businessPhone;
}

public void setBusinessPhone(String businessPhone) {
	this.businessPhone = businessPhone;
}


}