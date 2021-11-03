package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
@FunctionalInterface 
interface Greeter{
	void greet();//추상메소드
	
}
public class App2 {
	public static void main(String[] args) {
	//	Greeter g = () -> System.out.println("헬로우!");
	//	g.greet();
		
		// 메소드 레퍼런스로 람다식 대체
				Greeter g = App2::sayHello;
				
				g.greet();
}
	private static void sayHello() {
		System.out.println("헬로우~~");
	}
	
	}