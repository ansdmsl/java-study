package method;

public class Gamble {
	public static void main(String[] args){
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("획득 금액: $%.0f원)", dollar, won);
		
		
	}

	private static int dice() {
		// math.random() 메소드를 활용하여 1~6사이의 정수 반
		return 0;
	}
	
	private static double exchange(double dollar) {
		// TODO Auto-generated method stub
		return 0;
	}

	
		
	}
}
