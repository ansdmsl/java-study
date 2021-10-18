package application;

public class App {
	public static void main(String[] args) {
		// 고양이 클래스 불러오기 
		Cat cat1 = new Cat("마틸다"); // count ++
		Cat cat2 = new Cat("라이언"); // count++
		
		System.out.println(cat1);
		System.out.println(cat2);
		
		// 스테틱 변수는 객체와 상관없이 클래승명.변수로 사용한다 개체 생성할 필요없음 
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println(cat1.getCount());
		System.out.println(cat1.getCount());
		
		Cat cat3 = new Cat("라이언"); // count ++ 
		System.out.println(cat1.getCount());
	}

}
