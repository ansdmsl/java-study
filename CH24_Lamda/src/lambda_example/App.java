package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		//리스트의 forEach메소드의 매개변수 Consumer 인터페이스 객체이다
		//이터페이스로ㅡ객체를 마들수 없기 때무에익명클래스를마들고 그아에 추상메소드를 와성하멷 되다.
		list.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				//Consumer 이터페이스의 추상메소드 (구형을 해야한다,)
				System.out.print(t);
				System.out.print(" ");
				
			}
		} );
		//림다식으로 간단하게 
	
		list.forEach(s -> {System.out.print(s);
	
		});
	}

}

