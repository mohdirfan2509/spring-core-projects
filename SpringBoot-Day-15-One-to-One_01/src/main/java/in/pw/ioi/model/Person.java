package in.pw.ioi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Person {
	
	@Id
	private Integer persId;
	
	private String persIdName;
	
	private String persIdAddress;
	
	public Person() {
		
	}

	public Person(Integer persId, String persIdName, String persIdAddress) {
		super();
		this.persId = persId;
		this.persIdName = persIdName;
		this.persIdAddress = persIdAddress;
	}

	public Integer getPersId() {
		return persId;
	}

	public void setPersId(Integer persId) {
		this.persId = persId;
	}

	public String getPersIdName() {
		return persIdName;
	}

	public void setPersIdName(String persIdName) {
		this.persIdName = persIdName;
	}

	public String getPersIdAddress() {
		return persIdAddress;
	}

	public void setPersIdAddress(String persIdAddress) {
		this.persIdAddress = persIdAddress;
	}

	@Override
	public String toString() {
		return "Person [persId=" + persId + ", persIdName=" + persIdName + ", persIdAddress=" + persIdAddress + "]";
	}
	
	
	
	

	
	
}
