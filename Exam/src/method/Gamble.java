package method;

public class Gamble {
	public static void main(String[] args){
		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("ȹ�� �ݾ�: $%.0f��)", dollar, won);
		
		
	}

	private static int dice() {
		// math.random() �޼ҵ带 Ȱ���Ͽ� 1~6������ ���� ��
		return 0;
	}
	
	private static double exchange(double dollar) {
		// TODO Auto-generated method stub
		return 0;
	}

	
		
	}
}
