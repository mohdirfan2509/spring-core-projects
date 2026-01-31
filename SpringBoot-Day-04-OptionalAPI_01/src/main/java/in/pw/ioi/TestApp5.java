package in.pw.ioi;

import java.util.Optional;
import java.util.function.Supplier;

public class TestApp5 {
	
	public static Optional<String> findUserById(Integer id){
		
		if(id==10) {
			return Optional.of("Sachin");
		}else {
			return Optional.empty();
		}
	}
	
	
	public static void main(String[] args) {
		
		Optional<String> optional= findUserById(100);
		
//		Anonymous inner class implementation for an Interface
		String result= optional.orElseThrow(new Supplier<> () {
			
			public RuntimeException get() {
				return new RuntimeException("UserName Not Found for the given Id !!");
			}
		});
		System.out.println(result);
		

	}

}



