package in.pw.ioi.dao;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

import in.pw.ioi.model.Student;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "in.pw.ioi.dao")
@EntityScan(basePackages = "in.pw.ioi.model")
public interface IStudentDao extends CrudRepository<Student, Integer> {

}
