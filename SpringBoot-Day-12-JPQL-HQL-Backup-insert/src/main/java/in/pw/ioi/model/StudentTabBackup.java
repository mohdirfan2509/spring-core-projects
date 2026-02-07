package in.pw.ioi.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentTabBackup")
public class StudentTabBackup {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sId;
	
	private String sName;
	

	private Integer sAge;
	

	private String sAddress;
	
	public StudentTabBackup() {
		
	}

	public StudentTabBackup(String sName, Integer sAge, String sAddress) {
		super();
		this.sName = sName;
		this.sAge = sAge;
		this.sAddress = sAddress;
	}

	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Integer getsAge() {
		return sAge;
	}

	public void setsAge(Integer sAge) {
		this.sAge = sAge;
	}

	public String getsAddress() {
		return sAddress;
	}

	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	@Override
	public String toString() {
		return "StudentTabBackup [sId=" + sId + ", sName=" + sName + ", sAge=" + sAge + ", sAddress=" + sAddress + "]";
	}
	
	
	


}
