package operaotors;

public class XOR_NOT {
	public static void main(String[] args) {

	int value1 = 0b01010011;
	int value2 = 0b11010110;
	
	int result1 = value1 ^ value2; //비트 XOR여산 : 같으면 0 다르면 1
		
	System.out.println(toBinary(value1));
	System.out.println(toBinary(value2));
	System.out.println(toBinary(result1)); //XOR 결과
			
	System.out.println();
	
	// not 여하 ~ : 0->1, 1->0으로 바전 
	System.out.println(toBinary(~result1)); //NOT 결과

}

	public static String toBinary(int value) {
	//8자기 이지수로 보여주기 위하 메소드 
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
}
}
