package com.example.demo.entity;


public class StudentDetails {
   private int Id;
   private String name;
   private String Address;
   private int phoneNumber;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
public int getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(int phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public StudentDetails(int id, String name, String address, int phoneNumber) {
	super();
	Id = id;
	this.name = name;
	Address = address;
	this.phoneNumber = phoneNumber;
}
public StudentDetails() {
	super();
	// TODO Auto-generated constructor stub
}
   
   
}
