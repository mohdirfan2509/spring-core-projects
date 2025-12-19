package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.app.repo.IStudentRepo;

@Component("service")
public class Service {
	
//	@Autowired(required = false)
	
	@Autowired
	@Qualifier("std2")
	private IStudentRepo repo;

	@Override
	public String toString() {
		return "Service [repo=" + repo + "]";
	}
	
	

}
