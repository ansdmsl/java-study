package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;


interface Runner{
	void execute();
	
}


public class App2 {
	public static void main(String[] args) {
		//직접 함수형 이터페이스를 만들어람다식 사용 
		//1. 함수형 이터페이스(메소드가`1개일때) 사용간으 
		//2. 추상메소드의 리터값과 매개벼수를 확인하고 생성한다/
		
		Runner run = () -> System.out.println("헬로우!");
		run.execute();
		
		
}
}