package application;

import java.util.Scanner;

public class EX1 {

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
		else if(apples < bananas){//if���� ������ false�϶� ����
			System.out.println("�ٳ����� ������� ����");
		}
		else { // ���� ���
		System.out.println("������ ����");		
	}
	
	}
}

