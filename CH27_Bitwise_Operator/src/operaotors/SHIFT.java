package operaotors;

public class SHIFT {

	public static void main(String[] args) {
		// ,��Ʈ �����v ����
		int value = 0b00010001;

		System.out.println(toBinary(value));

		int result1 = value << 3;

		System.out.println(toBinary(result1));

		int result2 = result1 >> 3;

		System.out.println(toBinary(result2));
		
		System.out.println(100 << 2); // ���ϱ� 4
		System.out.println(100 >> 1); // ������ 2

	}
	
	public static String toBinary(int value) {
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}
	}


