package in.pw.ioi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.pw.ioi.model.Course;

public interface ICourseRepository extends JpaRepository<Course, Integer> {

	

}
