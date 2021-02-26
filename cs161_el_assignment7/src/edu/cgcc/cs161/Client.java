package edu.cgcc.cs161;

import java.util.List;

public class Client {
	private String firstName;
	private String lastName;
	private String street;
	private String city;
	private String state;
	private String country;
	private ZipCode zipCode;
	private PhoneNumber phone;
	private EmailAddress email;
	private String insuranceCarrier;
	
	
	public String getFirstName() { 				//first name
		return firstName;
	}
	public void setFirstName(String a) {
		firstName = a;
	}
	public String getLastName() { 				//last name
		return lastName;
	}
	public void setLastName(String b) {
		lastName = b;
	}
	public String getStreet() { 				//street
		return street;
	}
	public void setStreet(String c) {
		street = c;
	}
	public String getCity() { 					//city
		return city;
	}
	public void setCity(String d) {
		city = d;
	}
	public String getState() { 					//state
		return state;
	}
	public void setState(String e) {
		state = e;
	}
	public String getCountry() { 				//country
		return country;
	}
	public void setCountry(String f) {
		country = f;
	}
	public ZipCode getZipCode() { 				//zip code
		return zipCode;
	}
	public void setZipCode(ZipCode g) {
		zipCode = g;
	}
	public PhoneNumber getPhone() { 			//phone
		return phone;
	}
	public void setPhone(PhoneNumber h) {
		phone = h;
	}
	public EmailAddress getEmail() { 			//email
		return email;
	}
	public void setEmail(EmailAddress i) {
		email = i;
	}
	public String getInsuranceCarrier() { 		//insurance carrier
		return insuranceCarrier;
	}
	public void setInsuranceCarrier(String j) {
		insuranceCarrier = j;
	}
	
	public boolean availServicesWork(List<ClinicService> list) {
		
		return false;
	}
	public void fillOutSurvey(Survey survey) {
		
	}
}
