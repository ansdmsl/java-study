package application;

import java.util.Scanner;

public class IfElseifELse {

	public static void main(String[] args) {
		// if��
		Scanner scanner = new Scanner(System.in); // ��ĳ�� ����
		
		System.out.println("�޴�");
		System.out.println("=======\n");
		System.out.println("1. ����Ʈ '��ο�'");
		System.out.println("2. ����Ʈ '�ȳ� ?'");
		System.out.println("3. ���α׷� ����");
		
		System.out.println("�ɼ��� ���� > ");
		int option = scanner.nextInt();
		// ����ġ ������ �Ȱ��� �����ϵ��� 
		switch (option) {
		case 1:
			System.out.println("��ο�");
			break;
		case 2:
			System.out.println("�ȳ�.");
			break;
		case 3:
			System.out.println("���α׷� ����...");
			break;
		case 1000:
			System.out.println("�̽��Ϳ��׸� �߰�");
			break;
		default:
			System.out.println("�߸��� �ɼ��Դϴ�.");
			break;
	}
		
		/*
		if (option == 1) {
			System.out.println("��ο�");
		}
		else if  (option == 2) {
			System.out.println("�ȳ�" );
		}
		else if  (option == 3) {
			System.out.println("�����մϴ�." );
		}
		else if (option == 1000) {
			System.out.println("�̽��Ϳ��׸� �߰�");
		}
		else System.out.println("�߸��� �Է�");
		*/
	}
}

