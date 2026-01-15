package in.pw.ioi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProgrammerProjId {
	
	@Column(name="personId")
	private Integer pid;
	
	@Column(name="projectId")
	private Integer projid;

	public ProgrammerProjId() {} 
	
	public ProgrammerProjId(Integer pid, Integer projid) {
		super();
		this.pid = pid;
		this.projid = projid;
	}

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Integer getProjid() {
		return projid;
	}

	public void setProjid(Integer projid) {
		this.projid = projid;
	}
	
	

	
	
	
	
	

}




