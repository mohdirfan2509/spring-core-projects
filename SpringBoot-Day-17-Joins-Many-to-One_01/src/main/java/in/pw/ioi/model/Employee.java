package in.pw.ioi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {
	
	@Id
	private Integer empId;
	
	private String empName;
	
	private String empAddress;
	
	
	@ManyToOne
	@JoinColumn(name="deptIdFk")
	private Department department;


	public Employee() {
		
	}
	public Employee(Integer empId, String empName, String empAddress, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAddress = empAddress;
		this.department = department;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empAddress=" + empAddress + ", department="
				+ department + "]";
	}
	
	
	
}
