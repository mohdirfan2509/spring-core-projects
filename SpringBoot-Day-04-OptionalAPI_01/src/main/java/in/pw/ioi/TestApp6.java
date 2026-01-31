package in.pw.ioi;

import java.util.Optional;

public class TestApp6 {
	
	public static Optional<String> findCityOfUser(Integer id){
		
		String city=null;
		if(id==10) {
			
			city="Mumbai";
		}
		return Optional.ofNullable(city);
	}
	
	
	public static void main(String[] args) {
		Optional<String> optCity=findCityOfUser(100);
		optCity.ifPresentOrElse(city-> System.out.println(city), ()->{
			 System.out.println("default City !");
		});
	

	}

}




