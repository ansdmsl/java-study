package application;

public class Break {

	public static void main(String[] args) {
		// �ݺ��� �ȿ��� ���������� ��ɤ��� break
		int count = 0;

		while (true) {
			System.out.println("��ο�. " + count);

			if (count == 5) { //count�� 5�� �Ǹ� 
				break;        //�ݺ����� ���� ���´�.
			}

			System.out.println("How are you.");

			count++;
		}

		System.out.println("Program finished.");	
	}

}
