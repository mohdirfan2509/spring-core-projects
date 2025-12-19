package com.app.service;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("service")
public class ExcelImportService implements InitializingBean, DisposableBean {
	
	@Value("${my.data.fileName}")
	private String fileName;
	@Value("${my.data.mode}")
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
	
	private void initLogic() {
		System.out.println("*****Some logic to process before calling the method*******");
	}
	
	private void cleanUpLogic() {
		System.out.println("*****Some logic to process after calling the method*******");
	}
	
	
	
	@Override
	public String toString() {
		return "ExcelImportService [fileName=" + fileName + ", mode=" + mode + "]";
	}
	@Override
	public void destroy() throws Exception {
		cleanUpLogic();
		
	}
	@Override
	public void afterPropertiesSet() throws Exception {
		initLogic();
		
	}
	
	

}
