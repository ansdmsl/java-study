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
			
		System.out.println(joiner.join("ġŲ", "����"));
		System.out.println(joiner.join("�п�", "����"));
		
		Joiner joiner2 = (s1,s2) -> s1 + " + " + s2; //�ڵ尡 �����ϋ� ���� �������� 1���ڵ尡 ���͵� 
		
		System.out.println(joiner2.join("ġŲ", "����"));
		System.out.println(joiner2.join("�п�", "����"));
	}
}
