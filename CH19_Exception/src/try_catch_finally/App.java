package try_catch_finally;

public class App {

	public static void main(String[] args)  {
	Person p1 = new Person();
	
	try {
		p1.setName("���");
		System.out.println("����� ���ष�ȵ�");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} finally {
		//���� �߻� �ϵ� ���ϵ� ������ �����̵� 
		System.out.println("final ������ ����");
	}
	
	System.out.println("���α׷� ����");
	}
}


