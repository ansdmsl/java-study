package method;

public class Person {
	// 클래스 안에 만든 변수를 인스턴스 변수라하고 객체 생서시 사용가능 (쌩성됨)

	String name;
	int age;
	// 클래스 안에 만든 함수를 메소드 -> 객체 생성시 사용가능(생성됨)
	void sayHello(){
		System.out.println("Hello" + name);
	}
}
