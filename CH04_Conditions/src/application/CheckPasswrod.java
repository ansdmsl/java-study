package application;

import java.util.Scanner;

public class CheckPasswrod {

	public static void main(String[] args) {
		// �Է��� �н����尡 ������ �н������ ������ �� 
final String USER_PASSWORD = "hello";
		
		System.out.print("��� �Է� > ");
		
		Scanner scanner = new Scanner(System.in);
		String password = scanner.nextLine();
		scanner.close();
		
		if(password.equals(USER_PASSWORD)) {
			System.out.println("���� ����.");
		}
		else {
			System.out.println("���� �Ұ�.");
		}		

	}

}
