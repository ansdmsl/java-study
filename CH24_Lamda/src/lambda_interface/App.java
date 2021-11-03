package lambda_interface;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// 특정 타입(제네릭)을 검사해서(test) boolean 참,거짓으로 리턴한다.
		
		Predicate<String> p1 = new Predicate<String>() {
		@Override 
			public boolean test(String t) {
			 //추상메서드 테스트 리터값(참/ 거짓_), 무자열 매개변수 1
				return t.length() < 4; //무자열 길이가 4보다 작으며 참 아ㅣ며 거짓 
			}
};
	System.out.println(p1.test("abcd"));
	System.out.println(p1.test("하나둘"));

	Predicate<String> p2 = s -> s.length() < 4;

	System.out.println(p2.test("one"));
	System.out.println(p2.test("three"));
	}

}
