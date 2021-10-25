package method_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class App {
	private String name;
	
	public App() {
		name= "엘리자베스";
	}
	
	public String getName() {
		return name;
	
}
	public void run() {
//		//System.out.println(name);//이름을 출력
//		class Printer implements Runnable {
//			@Override
//			public void run() { //추상메소드를 완성한다 
//		//new printer().print(); 	
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		}, 0, 1, TimeUnit.SECONDS);
	}
	
	public static void main(String[] args) {
		//메소드 안의 클래스 

		App app = new App();
		app.run();
		
	}

}
