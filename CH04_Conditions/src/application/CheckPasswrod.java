package application;

import java.util.Scanner;

public class CheckPasswrod {

	public static void main(String[] args) {
		// 입력한 패스워드가 지정된 패스워드와 같은지 비교 
final String USER_PASSWORD = "hello";
		
		System.out.print("비번 입력 > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("접속 승인.");
		}
		else {
			System.out.println("접속 불가.");
		}		

	}

}
