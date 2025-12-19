package com.app.service;

public class ExcelImportService {
	
	private String fileName;
	private String mode;
	
	static {
		System.out.println("ExcelImportService.class file is loading..");
	}
	public ExcelImportService() {
		System.out.println("ExcelImportService.class object is created");
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public void initLogic() {
		System.out.println("*****Some logic to process before calling the method*******");
	}
	
	public void cleanUpLogic() {
		System.out.println("*****Some logic to process after calling the method*******");
	}
	
	
	
	@Override
	public String toString() {
		return "ExcelImportService [fileName=" + fileName + ", mode=" + mode + "]";
	}
	
	

}
