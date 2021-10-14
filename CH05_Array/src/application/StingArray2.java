package application;

public class StingArray2 {

	public static void main(String[] args) {
		// String은 참조 자료현, 참조 변수형은 주소값을 갖는다
		 String text = null;// 넣은 참조 변수에 주소값이 없음 
		
	 // text = new String("헬로우!");
		text = "헬로우!";
		System.out.println(text);

		String[] texts = null;
		System.out.println(texts);
		
		texts = new String[3]; // 3개의 문자열 배열 공간 생성
		System.out.println(texts);
		
		texts[0]= new String("하이");
		texts[1]= "안녕?";
		texts[2]= "굿바이";
	for (String word :texts ) {
		System.out.println(word);
	}
	}

}
