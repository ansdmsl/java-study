package lambda_return;

interface Joiner {
	String join(String text1, String text2);
}

public class App {

	public static void main(String[] args) {

		Joiner joiner = (s1, s2) -> {
			String text = s1 + " - " + s2;
			return text;
		};
			
		System.out.println(joiner.join("치킨", "맥주"));
		System.out.println(joiner.join("학원", "공부"));
		
		Joiner joiner2 = (s1,s2) -> s1 + " + " + s2; //코드가 하줄일떄 리턴 생략가능 1줄코드가 리터됨 
		
		System.out.println(joiner2.join("치킨", "맥주"));
		System.out.println(joiner2.join("학원", "공부"));
	}
}
