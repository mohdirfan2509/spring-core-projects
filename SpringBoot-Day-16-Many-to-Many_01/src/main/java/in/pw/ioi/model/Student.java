package in.pw.ioi.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Student {
	
	@Id
	private Integer sid;
	
	private String smail;
	
	private String sname;
	
	@ManyToMany(cascade=CascadeType.MERGE)
	@JoinTable(
			    name="std_courseTab",
			    	joinColumns=@JoinColumn(name="sidFk"),
			    	inverseJoinColumns=@JoinColumn(name="cidFk")
			)
	private List<Course> courses;
	
	public Student() {
		
	}

	public Student(Integer sid, String smail, String sname, List<Course> courses) {
		super();
		this.sid = sid;
		this.smail = smail;
		this.sname = sname;
		this.courses = courses;
	}

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSmail() {
		return smail;
	}

	public void setSmail(String smail) {
		this.smail = smail;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", smail=" + smail + ", sname=" + sname + ", courses=" + courses + "]";
	}
	
	

	
	
}
