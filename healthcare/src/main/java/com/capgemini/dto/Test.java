package com.capgemini.dto;

public class Test {
	String testid;
	String testname;
	public Test(){}
	
	public Test(String testid, String testname) {
		super();
		this.testid = testid;
		this.testname = testname;
	}

	public String getTestid() {
		return testid;
	}
	public void setTestid(String testid) {
		this.testid = testid;
	}
	public String getTestname() {
		return testname;
	}
	public void setTestname(String testname) {
		this.testname = testname;
	}

}
