package method;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		System.out.println(p1.name); // �����ڿ��� string�� null���� �ʱⰪ
		System.out.println(p1.age);
		
		p1.sayHello();
		p1.name = "�ؼ�";
		p1.age = 7;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.sayHello();
		
		Person p2 = new Person();
		p2.name = "�浿";
		Person p3 = new Person();
		p3.name = "����";
		
		p2.sayHello();
		p3.sayHello();
		
	}

}
