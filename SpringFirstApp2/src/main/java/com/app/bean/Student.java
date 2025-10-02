package com.app.bean;

public class Student {
	
	private Integer sId;
	private String sName;
	private Integer sAge;
	
	static {
		System.out.println("Student.class file is loaded by spring framework..");
	}
	
	

	public Student(Integer sId, String sName, Integer sAge) {
		super();
		System.out.println("Student object is created using constructor by spring framework..");
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
	}



	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + "]";
	}
	

}
