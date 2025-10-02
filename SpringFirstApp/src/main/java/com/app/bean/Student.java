package com.app.bean;

public class Student {
	
	private Integer sId;
	private String sName;
	private Integer sAge;
	
	static {
		System.out.println("Student.class file is loaded by spring framework..");
	}
	
	public Student() {
		System.out.println("Student object is created by spring framework..");
		
		
	}

	public void setsId(Integer sId) {
		System.out.println("StudentId is injected by framework using setter..");
		this.sId = sId;
		
	}

	public void setsName(String sName) {
		System.out.println("StudentName is injected by framework using setter..");
		this.sName = sName;
		
	}

	public void setsAge(Integer sAge) {
		System.out.println("StudentAge is injected by framework using setter..");
		this.sAge = sAge;
		
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
	

}
