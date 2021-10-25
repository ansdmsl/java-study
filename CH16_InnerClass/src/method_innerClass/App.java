package method_innerClass;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class App {
	private String name= "엘리자베스";
	
	public App() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void run() {
		//System.out.println(name);//이름을 출력
		class Printer implements Runnable {
			@Override
			public void run() { //추상메소드를 완성한다 
			 	System.out.println(name); //타이머로 반복할 코드 
			 	//밑에 오버라이드 코드를 이걸로 ㄱㄱ~
			
//			public void print() {
//			
//				//내부클래스에서 외부클래스의 변수 사용 가능 
			}

//			@Override
//			public void run() {
//			 	System.out.println(name);
				
			}
		
		//printer p = new printer();
		//p.print();
		//위에 두줄을 한줄로 
		// new Printer().print();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Printer(), 0,1 , TimeUnit.SECONDS);
		
	}
	public static void main(String[] args) {
		//메소드 안의 클래스 
		//ystem.out.println(name);
	//	App app = new App();
	//	app.name = "ad";
		
		App app = new App();
		app.run();
		
	}

}
