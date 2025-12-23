package in.pw.ioi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class StudentBackUp {
	
	@Column(name="Id")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stuId;
	
	@Column(name="Name")
	private String stuName;
	
	@Column(name="Age")
	private Integer stuAge;
	
	@Column(name="Address")
	private String stuAddress;
	
	public StudentBackUp() {
		
	}

	public StudentBackUp(String stuName, Integer stuAge, String stuAddress) {
		super();
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuAddress = stuAddress;
	}

	@Override
	public String toString() {
		return "StudentBackUp [stuId=" + stuId + ", stuName=" + stuName + ", stuAge=" + stuAge + ", stuAddress="
				+ stuAddress + "]";
	}

	
	
	
}
