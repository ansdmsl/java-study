package application;

import java.util.Scanner;

public class Scope {

	public static void main(String[] args) {
		// 변수의 범위는 코드블록{}으로 결정 
		
			int value = 0;
			System.out.println(value);
			
	//System.out.println(value);코드블록 밖에서 사용 불가
	for(int i=0; i<4;i++) {
		System.out.println(i);
	} //System.out.println(i); 사용 불가 
	Scanner scanner = new Scanner(System.in);
	
	String input ="";
	do {
		System.out.println("종료할려면 'quit'를 입력하세요");
		input = scanner.nextLine();
	} while(!input.equals("q"));
	scanner.close();
	
	}
}
