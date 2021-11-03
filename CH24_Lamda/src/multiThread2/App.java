package multiThread2;

public class App {
	private int value = 0;
	
	private synchronized void increment() { //sysnchronized�� �Ͼ����尡 ����߿� �ٸ������� ��� ���� 
		value++;
	}
	
	public void run() throws InterruptedException {
		
		Runnable runnable = () -> {
			for(int i=0; i< 10000; i++) {
				System.out.println("i : " + i);
				value++;
			}
		};
		
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		Thread t3 = new Thread(runnable);
		
		t1.start(); // ������ ���� 
		t2.start();
		t3.start();
		
	 //	System.out.println(" value : " + value);
		
		t1.join(); //���� �����带 �������� ���� 
		t2.join();
		t3.join();
		
		System.out.println(" value : " + value);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		// �� ��ü�����ؼ� �޼ҵ� run���� 
		new App().run();
	
		}
}
