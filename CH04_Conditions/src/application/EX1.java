package application;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		// if문
		Scanner scanner = new Scanner(System.in); // 스캐너 생성
		System.out.println("사과의 갯수는 ?");
		
		int apples = scanner.nextInt();
		System.out.println("바나나의 갯수는 ?");
		int bananas = scanner.nextInt();
		scanner.close();
		
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		 
		}
		else if(apples < bananas){//if문의 조건이 false일때 실행
			System.out.println("바나나가 사과보다 많음");
		}
		else { // 같은 경우
		System.out.println("갯수가 같음");		
	}
	
	}
}

