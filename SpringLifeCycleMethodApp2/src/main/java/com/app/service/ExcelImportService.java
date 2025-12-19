package com.app.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ExcelImportService {
	
	private String fileName;
	private String mode;
	
	static {
		System.out.println("*******************CLASS LOADING*********************");
	}
	public ExcelImportService() {
		System.out.println("*******************CLASS INSTANTIATION*********************");
	}
	public void setFileName(String fileName) {
		System.out.println("*******************CLASS INITIALIZATION*********************");
		this.fileName = fileName;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	@PostConstruct
	public void initLogic() {
		System.out.println("*****Some logic to process before calling the method*******");
	}
	@PreDestroy
	public void cleanUpLogic() {
		System.out.println("*****Some logic to process after calling the method*******");
	}
	
	
	
	@Override
	public String toString() {
		return "ExcelImportService [fileName=" + fileName + ", mode=" + mode + "]";
	}
	
	

}
