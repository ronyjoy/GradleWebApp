package com.phonebook;
public class Entry {

private String fname;
private String lname;
private String mname;
private String email;
private String homePhone;
private String mobile;
private String businessPhone;

public Entry (String fname, String lname) {
	this.fname = fname;
	this.lname = lname;
}

public Entry (String fname, String lname, String mname, String email, String homePhone, 
	String mobile, String businessPhone) {
	this.fname = fname;
	this.lname = lname;
	this.mname = mname;
	this.email = email;
	this.homePhone = homePhone;
	this.mobile = mobile;
	this.businessPhone = businessPhone;
}

private void setFname(String fname) {
	this.fname = fname;
}

private String getFname() {
	return this.fname;
}

private void setLname(String fname) {
	this.fname = fname;
}

private String getLname() {
	return this.fname;
}

private void setMname(String fname) {
	this.fname = fname;
}

private String getMname() {
	return this.fname;
}

private void setEmail(String fname) {
	this.fname = fname;
}

private String getEmail() {
	return this.fname;
}

private void setHomePhone(String fname) {
	this.fname = fname;
}

private String getHomePhone() {
	return this.fname;
}

private void setMobile(String fname) {
	this.fname = fname;
}

private String getMobile() {
	return this.fname;
}

private void setBusinessPhone(String fname) {
	this.fname = fname;
}

private String getBusinessPhone() {
	return this.fname;
}

}