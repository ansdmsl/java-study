package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		
		
		
		 //0~10 값이 아닌 값들은 모두 제거
		list.removeIf(n -> n > 10 ||  n < 0);
	
		//  그다음, 각 아이템들에 + 100 을 한다.
		list.replaceAll( n -> 100 + n);
		
		list.forEach(t -> System.out.println(t));
		
	}

}
