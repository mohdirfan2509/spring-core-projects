package in.pw.ioi;

import java.util.Optional;

public class TestApp {
	
	public static Optional<String> findUserById(Integer id){
		
		if(id==10) {
			return Optional.of("Sachin");
		}else {
			return Optional.empty();
		}
	}

	public static void main(String[] args) {
		
		Optional<String> optional= findUserById(10);
		if(optional.isPresent()) {
			String userName= optional.get();
			System.out.println(userName);
		}else {
			String userName= optional.get();
			System.out.println("User Not Found.."+userName);
		}

	}

}
