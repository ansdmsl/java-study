package application;

	import entities.Apple;
	import entities.Banana;
	import entities.Fruit;

	public class App {

		public static void main(String[] args) {
			// 다른 패키지의 클래스들은 import로 불러온다.
			Fruit fruit1 = new Apple();
			//fruit1.id = 다름 패키지에서 proteted 접근 불가 
			System.out.println(fruit1);
			
			Fruit fruit2 = new Banana();
			System.out.println(fruit2);

		}

	
}
