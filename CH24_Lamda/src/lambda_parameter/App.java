package lambda_parameter;


interface Runner {
	void execute(String s);
}

public class App {

	public static void main(String[] args) {
		//�Ķ����(�Ťİ�����) �ִ� �߻�޼ҵ� 

		Runner run1 = (t) -> System.out.println(t);
		run1.execute("���");
		
		Runner run2 = s -> System.out.println(s);
		run2.execute("�浿");
	}
	
	}
