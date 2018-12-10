package com.example.demo;

public class HelloWorldDto {

	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	private String greeting;
	private long id;
	private double trm;
	public double getTrm() {
		return trm;
	}
	public void setTrm(double trm) {
		this.trm = trm;
	}
	public HelloWorldDto(String greeting, long id, double trm) {
		super();
		this.greeting = greeting;
		this.id = id;
		this.trm = trm;
	}
	






}



