package multiThread;

public class App {

	public static void main(String[] args) {
		
		Runnable runnable = () -> {
			for(int i=0; i< 100; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		//runnable.run();
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start();
		t2.start();
		
		System.out.println("��ο�!");
		
	}

}