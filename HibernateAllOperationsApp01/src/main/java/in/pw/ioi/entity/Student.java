package in.pw.ioi.entity;

import java.time.LocalDate;

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

	@Column(name="stdDob")
	private LocalDate sDob;
	
	
