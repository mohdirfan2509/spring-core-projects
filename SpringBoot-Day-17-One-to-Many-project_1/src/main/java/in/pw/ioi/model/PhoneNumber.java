package in.pw.ioi.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class PhoneNumber {
	
	@Id
	private Integer regNo;
	
	private String phoneNumber;
	
	private String provider;
	
	private String type;
	
	@ManyToOne(cascade=CascadeType.MERGE,fetch=FetchType.EAGER)
	@JoinColumn(name="pidFk")
	private Person person;
	
	public PhoneNumber() {
		
	}

	public PhoneNumber(Integer regNo, String phoneNumber, String provider, String type, Person person) {
		super();
		this.regNo = regNo;
		this.phoneNumber = phoneNumber;
		this.provider = provider;
		this.type = type;
		this.person = person;
	}

	public Integer getRegNo() {
		return regNo;
	}

	public void setRegNo(Integer regNo) {
		this.regNo = regNo;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", phoneNumber=" + phoneNumber + ", provider=" + provider + ", type="
				+ type + ", person=" + person + "]";
	}
	
}
