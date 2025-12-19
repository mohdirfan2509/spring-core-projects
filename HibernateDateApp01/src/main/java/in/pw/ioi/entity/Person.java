package in.pw.ioi.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="Person")
public class Person {
	
	@Column(name="pId")
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer pId;
	
	@Column(name="pName")
	private String pName;
	
	@Column(name="dob")
	@Temporal(TemporalType.DATE)
	Date dob;
	
	@Column(name="dom")
	@Temporal(TemporalType.TIMESTAMP)
	Date dom;
	
	@Column(name="doj")
	@Temporal(TemporalType.DATE)
	Date doj;

	public Person( String pName, Date dob, Date dom, Date doj) {
		super();
		
		this.pName = pName;
		this.dob = dob;
		this.dom = dom;
		this.doj = doj;
	}
}
