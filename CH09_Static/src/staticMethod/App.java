package staticMethod;



public class App {

	public static void main(String[] args) {
	// ����ƽ �޼ҵ� getCount ���
		// String.format�� printf�� ���ڿ��� ���� 
		String catCount = String.format("����� ���� : %d\n",Cat.getCount());
		System.out.println(catCount);
		Cat cat1 = new Cat("��ƿ��");
		Cat cat2 = new Cat("���̾�");
		Cat cat3 = new Cat("�����");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
	
		 catCount = String.format("����� ���� : %d\n",Cat.getCount());
		System.out.println(catCount);
		
		//add(1,1);
		int x = add(1,1);
		

	}

	private static int add(int i, int j) {
		// TODO Auto-generated method stub
		return 0;
	}

}
