package getterSetter;

public class App {

	public static void main(String[] args) {
		// 접근 제어자 private는 같은 클래스 에서만 접근 가능 
		Person p1 = new Person();
	
		p1.setName("펭수");
		p1.setAge(22);
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		
		

	}

}
