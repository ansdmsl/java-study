package application;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// �Է¹޴� Ŭ���� scanner �̿�
		Scanner scanner = new Scanner(System.in);
		System.out.println("�µ� �Է� :");
		double c = scanner.nextDouble(); // ��ĳ�� ��ü�� nextint �޼ҵ�� ������ �Է¤�
		double f = (c * 9/5) + 32; //ȭ��
		System.out.println("���� " + c + "�� ȭ��" + f+ "�̴�.");
		
	}

}
