package overridingMethod;

public class App {
	public static void main(String[] args) {
//		HouseCat cat1 = new HouseCat();
//		cat1.vocal();
//		cat1.hunt();
//		
//		RoadCat cat2 = new RoadCat();
//		cat2.vocal();
//		cat2.hunt();
//		
//		RoadCat cat3 = new RoadCat();
//		cat2.vocal();
//		cat2.hunt();
		//�ݺ���
		cat[] cats = { new HouseCat(), new RoadCat(), new tiger() };
		
		//for
		for(int i=0; i<cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		//for each
		for(cat cat : cats) {
			cat.vocal();
			cat.hunt();
		}
		
		// ����ȭ casting 
		// �⺻ Ÿ��
		//int a= 1.2345;
		int b = (int)1.2435;
		System.out.println(b);
		}
		// ���� Ÿ�� : �⺻�� ������ Ŭ����Ÿ�� �� 
	 	cat cat1 = new HouseCat();// ��Ĺ����
	 	
	 	//�ٿ� ĳ���� (Ÿ���� �ٽ� ���� Ŭ������ ��ȯ)
		HouseCat cat2 = (HouseCat)cat1;
		
	
}
