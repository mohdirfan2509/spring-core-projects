package com.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("std")
public class Student {
	
	static {
		System.out.println("Student.class file is loading...");
	}
	@Value("456")
	private Integer sid;
	@Value("Kholi")
	private String sname;
	@Value("37")
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
