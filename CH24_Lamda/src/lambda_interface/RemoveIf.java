package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		// 특정 타입(제네릭)을 검사해서(test) boolean 참,거짓으로 리턴한다.
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);

			// removeIf 메소드는 리스트의 아이템을 precate의 test 메소드로   
		numbers.removeIf(n -> n < 6); // 정수의 값이 6보다 작으면 참 

		numbers.forEach(t -> System.out.println(t));

	}
	
}
