package application;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// ����ġ �� 
		System.out.print("��������ϰڽ��ϱ�? (y/n): ");

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();

		switch (input) {
		case "y":
			System.out.println("�����մϴ�... ");
			break;
		case "n":
			System.out.println("�����մϴ�.");
			break;
		default:
			System.out.println("�߸��� �Է��Դϴ�.");
			break;
		}
	}
}
