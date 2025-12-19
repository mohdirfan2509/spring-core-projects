package in.pw.ioi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Column(name="empId")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer eId;
	
	@Column(name="empName")
	private String eName;
	
	@Column(name="empAge")
	private Integer eAge;
	
	@Column(name="empSalary")
	private Integer eSalary;
    
	public Employee() {
       //Default Constructor		
	}

	public Employee(String eName, Integer eAge, Integer eSalary) {
		super();
		this.eName = eName;
		this.eAge = eAge;
		this.eSalary = eSalary;
	}
	
	
	

	
	
}
