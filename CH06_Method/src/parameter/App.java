package parameter;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		int number= 5;
		int result = calc.square(number);

		System.out.printf("%d의 제곱은 %d 이다. ",number,result);
		result = calc.plus(10, 10);
		System.out.printf("두수의 제곱은 %d 이다. ",result);
		
		result = calc.minus(10, 10);
		System.out.printf("두수의 차는 %d 이다. ",result);
		
	}

}
