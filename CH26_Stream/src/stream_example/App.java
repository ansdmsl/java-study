package stream_example;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		//��Ʈ�� ������ ����Ʈ�� ��Ʈ�� ����� 
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(3);
		numbers.add(6);
		numbers.add(2);
		numbers.add(4);

		numbers.stream().forEach(System.out::println);

		System.out.println();
		//�÷��� Ÿ���� �޼ҵ� stream()�� �Ἥ ��Ʈ�� ����
		numbers.stream().forEach(n -> System.out.println(n));

	}

}