package application;

import collection.Pair;
import hierarchy.Cat;

public class App2 {

	public static void main(String[] args) {
	//���ĸ� Ÿ�� Ŭ������ ��ü�� ���鋚 Ÿ���� �����Ѵ�
		// interger�� ���� int�� Ŭ������
		Pair<Integer, Cat> pair = new Pair<>(5, new Cat("��ƿ��"));
	
	System.out.println(pair);
	
	System.out.println(pair.getOne());
	System.out.println(pair.getTwo());
	
	}
	}



