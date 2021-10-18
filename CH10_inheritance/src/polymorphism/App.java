package polymorphism;

public class App {
	public static void main(String[] args) {
		// 객체를상속받은 cat타입으로 선언ㅁ
		cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		cat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		tiger cat3 = new tiger();
		cat3.vocal();
		cat3.hunt();
		
		cat[] cats = { new HouseCat(), new RoadCat(), new tiger() };
		// cat[0] = new HouseCat
		// cat[1] = new HouseCat
		// cat[2] = new HouseCat
		
	}
		
	
}
