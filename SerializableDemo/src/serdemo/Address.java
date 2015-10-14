package serdemo;

import java.io.Serializable;

public class Address implements Serializable{

	private static final long SerialVersionID=2L;
	private String city;
	private String street;
	private String country;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString(){
		return new StringBuffer(" Street ").append(this.street).append(" country ")
				.append(this.country).append(" city ").append(this.city).toString();
	}

}
