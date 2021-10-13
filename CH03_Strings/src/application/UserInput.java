package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// 입력받는 클래스 scanner 이용
		Scanner scanner = new Scanner(System.in);
		System.out.println("온도 입력 :");
		double c = scanner.nextDouble(); // 스캐너 객체인 nextint 메소드로 정수값 입력ㄴ
		double f = (c * 9/5) + 32; //화씨
		System.out.println("섭씨 " + c + "는 화씨" + f+ "이다.");
		
	}

}
