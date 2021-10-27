package collection;

import hierarchy.Cat;
import hierarchy.Creature;
import hierarchy.Mammal;

public class App {

	public static void main(String[] args) {
		//제네릭 타입 클래스는 객체 만들떄타입 지정
		Wrapper<Cat>  wrapper = new Wrapper(); // 포장클래스의 객체 만들기 
		Wrapper<Creature> wrapper2 = new Wrapper<>();
		
		
		Cat cat = new Cat("마틸다"); // 고양이 마틸다 객체 생성 
		Creature creature = new Creature("생뭉");
		
		wrapper.set(cat);;
		wrapper2.set(creature);
		
		Cat r1 = wrapper.get();
		Creature r2 = wrapper2.get();
		
		System.out.println(r1);
		System.out.println(r2);
		
		wrapper.set(cat); // 포장 객체의 set메소드에 마틸다 입력 
		
		Object ob = wrapper.get();
		Cat retrieved = (Cat)wrapper.get();
		
		System.out.println(ob);
		System.out.println(retrieved);

		//ob.feed()는 ㄷ안됨다 Object 클래스의 메소드만 상용가능
		retrieved.feed();
		
	}

}
