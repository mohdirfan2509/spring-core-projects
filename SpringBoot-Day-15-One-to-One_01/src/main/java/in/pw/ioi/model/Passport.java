package in.pw.ioi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Passport {
	
	@Id
	private Integer pId;
	
	private String pCountry;
	
	@OneToOne
	@JoinColumn(name="perFk",unique=true)
	private Person person;
	
	
	
	public Passport() {
		
	}



	public Passport(Integer pId, String pCountry, Person person) {
		super();
		this.pId = pId;
		this.pCountry = pCountry;
		this.person = person;
	}



	public Integer getpId() {
		return pId;
	}



	public void setpId(Integer pId) {
		this.pId = pId;
	}



	public String getpCountry() {
		return pCountry;
	}



	public void setpCountry(String pCountry) {
		this.pCountry = pCountry;
	}



	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}



	@Override
	public String toString() {
		return "Passport [pId=" + pId + ", pCountry=" + pCountry + ", person=" + person + "]";
	}
	
	
	
	
	
	
	

}
