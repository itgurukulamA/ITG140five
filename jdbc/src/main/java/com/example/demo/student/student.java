package com.example.demo.student;

public class student {


private int id;
private String name;
public student(int id, String name, String mail, int phno) {
	super();
	this.id = id;
	this.name = name;
	this.mail = mail;
	this.phno = phno;
}
private String mail;
private int phno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public int getPhno() {
	return phno;
}
public void setPhno(int phno) {
	this.phno = phno;
}
}