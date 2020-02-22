package com.capgemini.dto;

import java.time.LocalDate;

public class Appointment {
	long appointmentid;
	LocalDate date;
	boolean approved;
	Test test;
	public Appointment() {}
	public Appointment( long appointmentid, LocalDate date, boolean approved, Test test) {
		super();
	
		this.appointmentid = appointmentid;
		this.date = date;
		this.approved = approved;
		this.test = test;
	}
	
	/*
	 * public User getUser() { return user; } public void setUser(User user) {
	 * this.user = user; }
	 */
	public long getAppointmentid() {
		return appointmentid;
	}
	public void setAppointmentid(long appointmentid) {
		this.appointmentid = appointmentid;
	}
	public Test getTest() {
		return test;
	}
	public void setTest(Test test) {
		this.test = test;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public boolean isApproved() {
		return approved;
	}
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	@Override
	public String toString() {
		return "Your appointment for appointmentid" + appointmentid + " On date=" + date + "is  approved="
				+ approved + "";
	}
	

}
