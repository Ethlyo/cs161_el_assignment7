package edu.cgcc.cs161;

import java.sql.Time;
import java.util.Date;

public class MedicalEngagement {

	private Date date;
	private Time time;
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date a) {
		date = a;
	}
	public Time getTime() {
		return time;
	}
	public void setTime(Time b) {
		time = b;
	}
}
