package application;

public class Printf {

	public static void main(String[] args) {
		// print("��¼���(%d,%f,%c,%s), ����Ұ�)
		int age =25;
		String addr = "�λ�";
		
		System.out.printf("�� ���̴� %d�� �Դϴ�.\n",age);
		System.out.printf("�� ���̴� %d�� �̰� %s�� ��� �ֵ�.\n",age, addr);
		
		double pi = 3.14593;
		System.out.printf("������ ���� : %.2f", pi);
	}

}
