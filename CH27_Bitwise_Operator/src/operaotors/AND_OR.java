package operaotors;

public class AND_OR {
	public static void main(String[] args) {
		//��Ʈ ���� AND OR 
		//System.out.println(toBinary(15));
		//System.out.println(toBinary(255));
		
		int value1 = 0b01010011;
		int value2 = 0b11010110;
		
		int result1 = value1 & value2; // ��Ʈ AND ����
			
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result1)); //And ���
				
		int result2 = value1 | value2;
		System.out.println(toBinary(value1));
		System.out.println(toBinary(value2));
		System.out.println(toBinary(result2)); //Or ���

	}
	
	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
}
