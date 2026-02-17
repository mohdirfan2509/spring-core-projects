package in.pw.ioi.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table
public class Course {
	
	@Id
	private Integer courseId;
	
	private String courseName;
	
	private Integer courseFee;
	
	@ManyToMany(mappedBy="courses")
	private List<Student> stds;
	public Course() {
		
	}

	public Course(Integer courseId, String courseName, Integer courseFee) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Integer getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Integer courseFee) {
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	
	

}
