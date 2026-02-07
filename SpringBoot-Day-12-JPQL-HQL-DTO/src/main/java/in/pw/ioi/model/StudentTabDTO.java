package in.pw.ioi.model;

public class StudentTabDTO {
	
    private String stdName;
	

	private Integer stdAge;


	public StudentTabDTO(String stdName, Integer stdAge) {
		super();
		this.stdName = stdName;
		this.stdAge = stdAge;
	}

	@Override
	public String toString() {
		return "StudentTabDTO [stdName=" + stdName + ", stdAge=" + stdAge + "]";
	}
	
	
	
	
	
	
	

}
