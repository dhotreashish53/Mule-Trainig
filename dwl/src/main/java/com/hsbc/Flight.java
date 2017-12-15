package com.hsbc;

//Java Bean rules

public class Flight {
	
	private String abcd;
	private int cost;
	private String takeoffDate;
	private String type;
	private String fromAirport;
	private String code;
	private int emptySeats;
	private String toAirport;
	private Address address;
	
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getAddress() {
		return address;
	}
	
	public Flight() {
		// TODO Auto-generated constructor stub
	}

	public Flight(String operator, int cost, String takeoffDate, String type, String fromAirport, String code,
			int emptySeats, String toAirport) {
		super();
		this.abcd = operator;
		this.cost = cost;
		this.takeoffDate = takeoffDate;
		this.type = type;
		this.fromAirport = fromAirport;
		this.code = code;
		this.emptySeats = emptySeats;
		this.toAirport = toAirport;
	}


	public String getAbcd() {
		return abcd;
	}


	public void setAbcd(String operator) {
		this.abcd = operator;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public String getTakeoffDate() {
		return takeoffDate;
	}


	public void setTakeoffDate(String takeoffDate) {
		this.takeoffDate = takeoffDate;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getFromAirport() {
		return fromAirport;
	}


	public void setFromAirport(String fromAirport) {
		this.fromAirport = fromAirport;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public int getEmptySeats() {
		return emptySeats;
	}


	public void setEmptySeats(int emptySeats) {
		this.emptySeats = emptySeats;
	}


	public String getToAirport() {
		return toAirport;
	}


	public void setToAirport(String toAirport) {
		this.toAirport = toAirport;
	}
	
	
	
}
