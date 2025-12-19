package com.pw.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CheckApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the date (dd-MM-yyyy): ");
		Scanner scan=new Scanner(System.in);
		String sdate= scan.next();
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
		Date date= null;
		
		try {
			date=sdf.parse(sdate);
			
			java.sql.Date sqlDate= new java.sql.Date(date.getTime());
			System.out.println(sqlDate); // yyyy-MM-dd	
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		scan.close();
		
	}

}
