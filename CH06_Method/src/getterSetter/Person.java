package getterSetter;

public class Person {
	// 클래스 안에 만든 변수를 인스턴스 변수라하고 객체 생서시 사용가능 (쌩성됨)
	private	String name;
	private int age;
	// 클래스 안에 만든 함수를 메소드 -> 객체 생성시 사용가능(생성됨)
	void setName(String name) {
		// get,set 메소드로 변수에 접근 
		this.name = name;
	}
	
	String getName() {
		// get,set 메소드로 변수에 접근 
		return name;
	}
	

	void setAge(int age) {
		// get,set 메소드로 변수에 접근 
		this.age =age ;
	}
	int getAge() {
		// get,set 메소드로 변수에 접근 
		return age;
	}
	
	
}
