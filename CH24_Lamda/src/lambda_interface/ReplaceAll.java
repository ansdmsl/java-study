package lambda_interface;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// replaceAll ������ �������� ���� ����� ��ü�Ѵ�.
				List<Integer> numbers = new ArrayList<>();
				numbers.add(1);
				numbers.add(3);
				numbers.add(4);
				numbers.add(7);
				numbers.add(3);

				numbers.replaceAll(n -> n * n);

				numbers.forEach(t -> System.out.println(t));
				
				System.out.println();

				List<String> friends = new ArrayList<String>();
				friends.add("���");
				friends.add("�浿");
				friends.add("�޸�");
				friends.add("ö��");

				friends.replaceAll(s -> "�ȳ�~ " + s);
				
				friends.forEach(t -> System.out.println(t));
			}


	}


