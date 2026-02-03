package in.pw.ioi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTab")
public class StudentTab {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer stdId;
	
	private String stdName;
	

	private Integer stdAge;
	

	private String stdAddress;
	
	public StudentTab() {
		
	}
	
	
	

	public Integer getStdId() {
		return stdId;
	}




	public void setStdId(Integer stdId) {
		this.stdId = stdId;
	}




	public String getStdName() {
		return stdName;
	}




	public void setStdName(String stdName) {
		this.stdName = stdName;
	}




	public Integer getStdAge() {
		return stdAge;
	}




	public void setStdAge(Integer stdAge) {
		this.stdAge = stdAge;
	}




	public String getStdAddress() {
		return stdAddress;
	}




	public void setStdAddress(String stdAddress) {
		this.stdAddress = stdAddress;
	}




	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdAge=" + stdAge + ", stdAddress=" + stdAddress
				+ "]";
	}
	
	
	

}
