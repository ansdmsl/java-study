package application;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// if��
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ����
		System.out.println("����� ������ ?");
		
		int apples = scanner.nextInt();
		System.out.println("�ٳ����� ������ ?");
		int bananas = scanner.nextInt();
		scanner.close();
		
		if(apples > bananas) {
			System.out.println("����� �ٳ������� ����");
		 
		}
		if(apples < bananas) {
			System.out.println("�ٳ����� ������� ����");
		}
		System.out.println("���α׷� ����.");		
	}

}