package polymorphism;

public class App {
	public static void main(String[] args) {
		// 객체를상속받은 cat타입으로 선언ㅁ
		Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		Cat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		
		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger() };
		// cat[0] = new HouseCat
		// cat[1] = new HouseCat
		// cat[2] = new HouseCat
		
	}
		
	
}
