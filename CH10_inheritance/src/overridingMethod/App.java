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
		//반복문
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
		
		// 형변화 casting 
		// 기본 타입
		//int a= 1.2345;
		int b = (int)1.2435;
		System.out.println(b);
		}
		// 차조 타입 : 기본을 제외한 클래스타입 등 
	 	cat cat1 = new HouseCat();// 업캣스팅
	 	
	 	//다운 캐스팅 (타입을 다시 하위 클래스로 변환)
		HouseCat cat2 = (HouseCat)cat1;
		
	
}
