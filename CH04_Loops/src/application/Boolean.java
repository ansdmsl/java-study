package application;

public class Boolean {

	public static void main(String[] args) {
		// �Ҹ� Ÿ���� ��,����(true, false) 
		boolean bool1 = false;
		
		System.out.println("����1: " + bool1 );
		
		// �� ����� �� or ���� (true, false) 
		boolean bool2 = 4 < 5;
		System.out.println("����2: " + bool2);
		
		// �� ����� �� or ����
		boolean bool3 = 14 < 5;
		System.out.println("����3: " + bool3);

		// �� == ����, != �����ʴ�, >= , <= 
		boolean bool4 = 14 != 5;
		System.out.println("����4: " + bool4);
        System.out.printf("����4: %b", bool4);
	}


	}
