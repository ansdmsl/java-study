package numbering;

public class App {
	public static void main(String[] args) {
		/*
		 *  10���� ::  0 - 9  decimal    
		 * 2�� :: 0 - 1 �� (��ǻ��) binary       
		 * 16���� :: 0 -9 ABCDEF �������� �������� ǥ��  hexadecimal 
		 * 
		 * 6213, 01001, 1B2F
		 * 
		 */
		
		int value = 123;
		
		System.out.println(Integer.toBinaryString(value)); //�������� ��ȯ
		System.out.println(Integer.toHexString(123));
		
		int value255 = 0xFF;//0X�� 16������ �ǹ�, 0b�� ������
		
		System.out.println(value255);
		System.out.println(Integer.toBinaryString(value255)); // �������κ�ȯ 
		System.out.printf("%s", Integer.toHexString(value255)); // 16������ ��ȯ

	}

}
