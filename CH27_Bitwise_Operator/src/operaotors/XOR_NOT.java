package operaotors;

public class XOR_NOT {
	public static void main(String[] args) {

	int value1 = 0b01010011;
	int value2 = 0b11010110;
	
	int result1 = value1 ^ value2; //��Ʈ XOR���� : ������ 0 �ٸ��� 1
		
	System.out.println(toBinary(value1));
	System.out.println(toBinary(value2));
	System.out.println(toBinary(result1)); //XOR ���
			
	System.out.println();
	
	// not ���� ~ : 0->1, 1->0���� ���� 
	System.out.println(toBinary(~result1)); //NOT ���

}

	public static String toBinary(int value) {
	//8�ڱ� �������� �����ֱ� ���� �޼ҵ� 
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
}
}
