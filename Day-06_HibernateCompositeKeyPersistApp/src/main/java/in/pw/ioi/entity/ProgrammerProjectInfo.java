package in.pw.ioi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table
public class ProgrammerProjectInfo {
	
	@EmbeddedId
	ProgrammerProjId id;
	
	@Column(name="presonName")
	String pname;
	
	@Column(name="deptName")
	String deptName;
	
	@Column(name="projName")
	String projName;

	public ProgrammerProjectInfo(){} 
	
	public ProgrammerProjectInfo(ProgrammerProjId id, String pname, String deptName, String projName) {
		super();
		this.id = id;
		this.pname = pname;
		this.deptName = deptName;
		this.projName = projName;
	}
	
	

}
