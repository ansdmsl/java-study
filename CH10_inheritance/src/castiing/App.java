package castiing;

public class App {
	public static void main(String[] args) {
		 cat cat1 = new HouseCat();
		 cat1.vocal();
		 cat1.hunt();
		 // cat1.call()
		 // cat Ÿ���̱� ������ ������ �޼ҵ常 ��밡��(�������̵� ��);
		 HouseCat cat2 = (HouseCat)cat1;
		 cat2.call(); // ������ ����� �������� ��ü�� call �޼ҵ� ����
		 
	}
	
}