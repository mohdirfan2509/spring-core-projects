package in.pw.ioi.entity;

public class StudentDTO {
	private String sname;
	private Integer sage;
	private String saddress;
	public StudentDTO(String sname, Integer sage, String saddress) {
		super();
		this.sname = sname;
		this.sage = sage;
		this.saddress = saddress;
	}
	@Override
	public String toString() {
		return "StudentDTO [sname=" + sname + ", sage=" + sage + ", saddress=" + saddress + "]";
	}
	
	

}
