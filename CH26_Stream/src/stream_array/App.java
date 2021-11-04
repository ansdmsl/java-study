package stream_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// 뭉자열과 배열 스트림
			
			Stream.of("Hello", "bottole", "Africa")
				.sorted()  //정렬:알파벳순
				.findFirst()   //첫번째
				.ifPresent((x) -> System.out.println(x));
			
			System.out.println();
			
			String[] items = {"치킨","원숭이","고릴라","치약","고라니","치과","고양이"};
			Stream.of(items)
				.filter((x) -> x.startsWith("치"))
				.sorted()
				.forEach(x -> System.out.print(x + ","));	
			
			System.out.println();
			System.out.println();
			
			Arrays.stream(new int[] {2,4,6,8,10}) //정수 배열을 new로 생성과 동시에 초기화
			.map( x -> x*x)  //제곱
			.average()		 //평균
			.ifPresent(n -> System.out.print(n)); //출력

	         System.out.println();

	         //배열을 리스트로 바꾸ㅡㄴ 방법 arrays,asLit(배열)
			List<String> listItems = Arrays.asList(items);
			listItems.stream()
				.filter( x -> x.startsWith("고"))
				.sorted()
				.forEach(x -> System.out.print(x + ","));
			
			//배열은 stram.of(배열) ,t스티림생성, 리스트 stream(설정)
			//filter(x->조건_) 조거이 참이면 남기고 아니며 제외
			// map(x -> 리턴값 ) 아이템 값을 리터값으로바꿈 
			
			
		}

}
