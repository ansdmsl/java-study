package multi_inheritance;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
	//	Speaker s1 = new Speaker();
		p1.greet();
		p1.speak();
		
		Speaker p2 = new Person();
		p2.speak();
		// p2.greet(); ����Ŀ �������̽����� speak �޼ҵ� ����!
		
		Greeter p3 = new Person();
		p3.greet();
		// P3.speak(); �׸��� �������̽����� speak �޼ҵ� ����
	}

}
