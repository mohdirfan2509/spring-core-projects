package in.pw.ioi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Column(name="stdId")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sId;
	
	@Column(name="stdName")
	private String sName;
	
	@Column(name="stdAge")
	private Integer sAge;
	
	@Column(name="stdAddress")
	private String sAddress;
	
	

	public Integer getsId() {
		return sId;
	}



	public void setsId(Integer sId) {
		this.sId = sId;
	}



	public String getsName() {
		return sName;
	}

	public String getsAddress() {
		return sAddress;
	}



	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

  
	public Student() {
		System.out.println("default constructor is executed !!");
	}

	public Student(String sName, Integer sAge, String sAddress) {
		super();
		this.sName = sName;
		this.sAge = sAge;
		this.sAddress = sAddress;
	}



	@Override
	public String toString() {
		return "Student [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sAddress=" + sAddress + "]";
	}
	
	
}
