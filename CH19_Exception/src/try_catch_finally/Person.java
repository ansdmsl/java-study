package try_catch_finally;

public class Person {

	void setName(String name) throws Exception {
		if(name == null) {
			throw new Exception("�̸��� �ΰ��� �Է��Ҽ� �����ϴ�.");
		}
		System.out.println("�̸��� "+name);
	}
}