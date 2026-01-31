package in.pw.ioi;

import java.util.Optional;

public class TestApp2 {
	
	public static Optional<String> findUserById(Integer id){
		
		if(id==10) {
			return Optional.of("Sachin");
		}else {
			return Optional.empty();
		}
	}
	
	public static String defaultData() {
		System.out.println("defaultData() is getting called");
		return "Kholi";
	}

	public static void main(String[] args) {
		
		Optional<String> optional= findUserById(100);
		
		String result= optional.orElse(defaultData());
		System.out.println(result);
		

	}

}
