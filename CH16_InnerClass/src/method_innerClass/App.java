package method_innerClass;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class App {
	private String name= "�����ں���";
	
	public App() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}
	public void run() {
		//System.out.println(name);//�̸��� ���
		class Printer implements Runnable {
			@Override
			public void run() { //�߻�޼ҵ带 �ϼ��Ѵ� 
			 	System.out.println(name); //Ÿ�̸ӷ� �ݺ��� �ڵ� 
			 	//�ؿ� �������̵� �ڵ带 �̰ɷ� ����~
			
//			public void print() {
//			
//				//����Ŭ�������� �ܺ�Ŭ������ ���� ��� ���� 
			}

//			@Override
//			public void run() {
//			 	System.out.println(name);
				
			}
		
		//printer p = new printer();
		//p.print();
		//���� ������ ���ٷ� 
		// new Printer().print();
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Printer(), 0,1 , TimeUnit.SECONDS);
		
	}
	public static void main(String[] args) {
		//�޼ҵ� ���� Ŭ���� 
		//ystem.out.println(name);
	//	App app = new App();
	//	app.name = "ad";
		
		App app = new App();
		app.run();
		
	}

}
