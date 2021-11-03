package lambda_interface;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// Ư�� Ÿ��(���׸�)�� �˻��ؼ�(test) boolean ��,�������� �����Ѵ�.
		
		Predicate<String> p1 = new Predicate<String>() {
		@Override 
			public boolean test(String t) {
			 //�߻�޼��� �׽�Ʈ ���Ͱ�(��/ ����_), ���ڿ� �Ű����� 1
				return t.length() < 4; //���ڿ� ���̰� 4���� ������ �� �ƤӸ� ���� 
			}
};
	System.out.println(p1.test("abcd"));
	System.out.println(p1.test("�ϳ���"));

	Predicate<String> p2 = s -> s.length() < 4;

	System.out.println(p2.test("one"));
	System.out.println(p2.test("three"));
	}

}
