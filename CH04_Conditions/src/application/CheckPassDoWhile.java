package application;

import java.util.Scanner;

public class CheckPassDoWhile {

	public static void main(String[] args) {
		// �н����� �Է¹޾� do while������ �´��� �˻� ������ �ݺ��� �������� 
		Scanner scanner = new Scanner(System.in);
		final String USER_PASSWORD = "hello";
		String password= "";
		
	do {
		System.out.print("��� �Է� > ");
		password = scanner.nextLine();
		
		} while(!password.equals(USER_PASSWORD)); //!�� �ݴ�
	          scanner.close();
	          System.out.println("���� ����");
	}

}