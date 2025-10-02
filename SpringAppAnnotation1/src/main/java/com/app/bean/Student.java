package com.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	
	static {
		System.out.println("Student.class file is loading...");
	}
	@Value("123")
	private Integer sid;
	@Value("Dhoni")
	private String sname;
	@Value("45")
	private Integer sage;
	
	public Student() {
		System.out.println("STUDENT OBJECT IS CREATED BY SPRING F/W");
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}
	
	
	

}
