package in.pw.ioi;
import java.util.Optional;

public class TestApp4 {
	
	public static Optional<String> findUserById(Integer id){
		
		if(id==10) {
			return Optional.of("Sachin");
		}else {
			return Optional.empty();
		}
	}
	
	
	public static void main(String[] args) {
		
		Optional<String> optional= findUserById(10);
		
		String result= optional.orElseThrow(()->new RuntimeException("UserName Not Found for the given Id !!"));
		System.out.println(result);
		

	}

}


