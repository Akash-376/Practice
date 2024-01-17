package com.example.AutowiringDemo;

public class Address {
	private int hno;
	private String city;
	private String pincode;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
	
}
