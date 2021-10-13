package application;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// 스위치 문 
		System.out.print("계속진행하겠습니까? (y/n): ");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		switch (input) {
		case "y":
			System.out.println("진행합니다... ");
			break;
		case "n":
			System.out.println("종료합니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
	}
}
