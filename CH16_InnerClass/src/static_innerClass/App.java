package static_innerClass;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.print();
		//�̳�Ŭ���� (��ü�� ���鋚�� ���� �ܺ�Ŭ���� ��ü�� ����� ������ֵ�)
		Person.Head head = p1.new Head();
		head.print();
		//������ �̳� Ŭ���� �ܺΰ�ü���� �ٷ� .Body()
		Person.Body body = new Person.Body();
		body.print();
		}
		
		
		
	}


