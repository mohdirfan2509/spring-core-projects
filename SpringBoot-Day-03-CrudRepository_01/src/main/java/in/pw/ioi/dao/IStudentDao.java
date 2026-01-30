package in.pw.ioi.dao;

import org.springframework.data.repository.CrudRepository;

import in.pw.ioi.model.StudentTab;

public interface IStudentDao extends CrudRepository<StudentTab, Integer> {

}
