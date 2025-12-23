package in.pw.ioi.entity;

import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
@NamedQueries(
		value= {
				@NamedQuery(name="Student.insertIntoStudentBackUp",query="INSERT INTO StudentBackUp(stuName,stuAge,stuAddress) SELECT s.sName, s.sAge, s.sAddress FROM Student s WHERE s.sAge> :age")
		}
		
		)
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
	
	public Student() {
		
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
