package application;

import java.util.Scanner;

public class IfElseifELse {

	public static void main(String[] args) {
		// if문
		Scanner scanner = new Scanner(System.in); // 스캐너 생성
		
		System.out.println("메뉴");
		System.out.println("=======\n");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕 ?'");
		System.out.println("3. 프로그램 종료");
		
		System.out.println("옵션을 선택 > ");
		int option = scanner.nextInt();
		// 스위치 문으로 똑같이 동작하도록 
		switch (option) {
		case 1:
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕.");
			break;
		case 3:
			System.out.println("프로그램 종료...");
			break;
		case 1000:
			System.out.println("이스터에그를 발견");
			break;
		default:
			System.out.println("잘못된 옵션입니다.");
			break;
	}
		
		/*
		if (option == 1) {
			System.out.println("헬로우");
		}
		else if  (option == 2) {
			System.out.println("안녕" );
		}
		else if  (option == 3) {
			System.out.println("종료합니다." );
		}
		else if (option == 1000) {
			System.out.println("이스터에그를 발견");
		}
		else System.out.println("잘못된 입력");
		*/
	}
}

