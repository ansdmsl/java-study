package getterSetter;

public class Person {
	// Ŭ���� �ȿ� ���� ������ �ν��Ͻ� �������ϰ� ��ü ������ ��밡�� (�߼���)
	private	String name;
	private int age;
	// Ŭ���� �ȿ� ���� �Լ��� �޼ҵ� -> ��ü ������ ��밡��(������)
	void setName(String name) {
		// get,set �޼ҵ�� ������ ���� 
		this.name = name;
	}
	
	String getName() {
		// get,set �޼ҵ�� ������ ���� 
		return name;
	}
	

	void setAge(int age) {
		// get,set �޼ҵ�� ������ ���� 
		this.age =age ;
	}
	int getAge() {
		// get,set �޼ҵ�� ������ ���� 
		return age;
	}
	
	
}
