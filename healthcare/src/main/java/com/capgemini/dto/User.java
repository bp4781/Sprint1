package com.capgemini.dto;

import java.util.List;

public class User {
	private String userId;
	//List<DiagnoisticCenter>centerList;
	String userPassword;
	String userName ;
	long contactNumber;
	String userRole;
	String emailId;
	public User() {}
	public User(String userId, String userPassword, String userName,
			long contactNumber, String userRole, String emailId) {
		super();
		this.userId = userId;
//		this.centerList = centerList;
		this.userPassword = userPassword;
		this.userName = userName;
		this.contactNumber = contactNumber;
		this.userRole = userRole;
		this.emailId = emailId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	/*
	 * public List<DiagnoisticCenter> getCenterList() { return centerList; } public
	 * void setCenterList(List<DiagnoisticCenter> centerList) { this.centerList =
	 * centerList;}
	 */
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getUserRole() {
		return userRole;
	}
	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ",  userPassword=" + userPassword
				+ ", userName=" + userName + ", contactNumber=" + contactNumber + ", userRole=" + userRole
				+ ", emailId=" + emailId + "]";
	}
	

}
