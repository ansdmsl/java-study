package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감){ 명령문; }
		
//		for(int i=0; i < 10; i++) {
//			System.out.println("i: " + i);
//		}
//		
		
		// for 무한반복		
		/*
		for(;;) {
			System.out.println("헬로우");
		}
		*/
		int total = 0;
		for(int j=1; j<101; j++) {
				total += j;
			}
			
			System.out.println(total);
			

	
	}

}
