package in.pw.ioi.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Customer{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer cId;
	private String cName;
	private LocalDateTime cDob;
	private LocalDate cDop;
	private LocalTime cTop;
	
	public Customer() {
		
	}

	public Customer(String cName, LocalDateTime cDob, LocalDate cDop, LocalTime cTop) {
		super();
		this.cName = cName;
		this.cDob = cDob;
		this.cDop = cDop;
		this.cTop = cTop;
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public LocalDateTime getcDob() {
		return cDob;
	}

	public void setcDob(LocalDateTime cDob) {
		this.cDob = cDob;
	}

	public LocalDate getcDop() {
		return cDop;
	}

	public void setcDop(LocalDate cDop) {
		this.cDop = cDop;
	}

	public LocalTime getcTop() {
		return cTop;
	}

	public void setcTop(LocalTime cTop) {
		this.cTop = cTop;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", cName=" + cName + ", cDob=" + cDob + ", cDop=" + cDop + ", cTop=" + cTop
				+ "]";
	}
	
	
	
	
}