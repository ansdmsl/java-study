package numbering;

public class App {
	public static void main(String[] args) {
		/*
		 *  10진수 ::  0 - 9  decimal    
		 * 2진 :: 0 - 1 수 (컴퓨터) binary       
		 * 16진수 :: 0 -9 ABCDEF 이지수를 보기좋게 표시  hexadecimal 
		 * 
		 * 6213, 01001, 1B2F
		 * 
		 */
		
		int value = 123;
		
		System.out.println(Integer.toBinaryString(value)); //이지수로 벼환
		System.out.println(Integer.toHexString(123));
		
		int value255 = 0xFF;//0X는 16지수를 의미, 0b는 이지수
		
		System.out.println(value255);
		System.out.println(Integer.toBinaryString(value255)); // 이지수로변환 
		System.out.printf("%s", Integer.toHexString(value255)); // 16지수로 변환

	}

}
