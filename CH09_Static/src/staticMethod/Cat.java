package staticMethod;

public class Cat {
	private String name; //��礷���̸� 
	private int id; //����� ���̵�
	public static final String FOOD = "����� ���";
	// ����ƽ������ ��ü���� ��������
	public static int count = 0; // ������ ����� ���� 
	
	public Cat(String name) { // �����ڴ� ���� Ÿ���� ���� (�Ϲ� �޼ҵ�� �ٸ� )
		this.name = name;
		// �ڵ� �߰� 
		
		count++; //����� ��ü ������ count��  +1 �ʴ� 
		id = count;
		
	}

	@Override
	public String toString() { // toString �޼ҵ� �ڵ�����
		return "����� [���̵�= " + id + " �̸� =" + name + "]";
	}

	public static int getCount() { 
		// ����ƽ �޼ҵ� 
		// String n = name; ����ƽ �޼ҵ忡�� �ν��Ͻ� (��ü)������ 
		return count;
	}
	
	
}
