package com.example.demo.Maildemonstration;

public class Mail { 
	String subject;
	String to;
	String body;
	
	public Mail(String subject, String to, String body) {
		super();
		this.subject = subject;
		this.to = to;
		this.body = body;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	

}
