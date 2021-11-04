package arrays_asList;

import java.util.Arrays;
import java.util.List;

public class App {
	public static void main(String[] args) {
		//배열을 리스트로ㅓ 
		// Arrays.asList(배열) => 리스트로
		List<String> names = Arrays.asList("Eric", "Elena", "Java");
			
		names.stream()
			 .filter(name -> name.contains("a")) //문자열에 a가 있으며 참 아니며 거짓
			 .map(String::toUpperCase) // 대문자
			 .forEach(System.out::println); //출력
			
		List<Integer> numbers = Arrays.asList(9,4,6,3,1,2,7);
		
		numbers.stream()				
			   .filter(n -> n>3) // 946만 남는다 
			   .sorted() // 4 6 9 
			   .map(s->s*10)  //40 60 90 
			   .forEach(System.out::println);
	}
	}
