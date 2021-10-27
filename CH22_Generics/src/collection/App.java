package collection;

import hierarchy.Cat;
import hierarchy.Creature;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {
		//���׸� Ÿ�� Ŭ������ ��ü ���鋚Ÿ�� ����
		Wrapper<Cat>  wrapper = new Wrapper(); // ����Ŭ������ ��ü ����� 
		Wrapper<Creature> wrapper2 = new Wrapper<>();
		
		
		Cat cat = new Cat("��ƿ��"); // ����� ��ƿ�� ��ü ���� 
		Creature creature = new Creature("����");
		
		wrapper.set(cat);;
		wrapper2.set(creature);
		
		Cat r1 = wrapper.get();
		Creature r2 = wrapper2.get();
		
		System.out.println(r1);
		System.out.println(r2);
		
		wrapper.set(cat); // ���� ��ü�� set�޼ҵ忡 ��ƿ�� �Է� 
		
		Object ob = wrapper.get();
		Cat retrieved = (Cat)wrapper.get();
		
		System.out.println(ob);
		System.out.println(retrieved);

		//ob.feed()�� ���ȵʴ� Object Ŭ������ �޼ҵ常 ��밡��
		retrieved.feed();
		
	}

}
