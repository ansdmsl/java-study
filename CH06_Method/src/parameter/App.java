package parameter;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		
		int number= 5;
		int result = calc.square(number);

		System.out.printf("%d�� ������ %d �̴�. ",number,result);
		result = calc.plus(10, 10);
		System.out.printf("�μ��� ������ %d �̴�. ",result);
		
		result = calc.minus(10, 10);
		System.out.printf("�μ��� ���� %d �̴�. ",result);
		
	}

}
