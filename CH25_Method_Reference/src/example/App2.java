package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
@FunctionalInterface 
interface Greeter{
	void greet();//�߻�޼ҵ�
	
}
public class App2 {
	public static void main(String[] args) {
	//	Greeter g = () -> System.out.println("��ο�!");
	//	g.greet();
		
		// �޼ҵ� ���۷����� ���ٽ� ��ü
				Greeter g = App2::sayHello;
				
				g.greet();
}
	private static void sayHello() {
		System.out.println("��ο�~~");
	}
	
	}