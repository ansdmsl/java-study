package exercise;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(9);
		list.add(1000);
		list.add(3);
		list.add(6);
		list.add(-20);
		list.add(4);
		
		
		
		 //0~10 ���� �ƴ� ������ ��� ����
		list.removeIf(n -> n > 10 ||  n < 0);
	
		//  �״���, �� �����۵鿡 + 100 �� �Ѵ�.
		list.replaceAll( n -> 100 + n);
		
		list.forEach(t -> System.out.println(t));
		
	}

}
