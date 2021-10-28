package application;

import collection.Pair;
import hierarchy.Cat;

public class App2 {

	public static void main(String[] args) {
	//제ㅔ릭 타입 클래스는 객체를 만들떄 타입을 지정한다
		// interger는 숫자 int의 클래스형
		Pair<Integer, Cat> pair = new Pair<>(5, new Cat("마틸다"));
	
	System.out.println(pair);
	
	System.out.println(pair.getOne());
	System.out.println(pair.getTwo());
	
	}
	}



