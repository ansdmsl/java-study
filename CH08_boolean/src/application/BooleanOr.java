package application;

public class BooleanOr {

	public static void main(String[] args) {
		// || or �� ������ 
		boolean isRaining = false; //�� �´���?
		boolean mightRain= true; // �� �ü��� �ִ°�"?
		boolean haveUmbrella = false;// ����� ���������� ?
		
		if((isRaining || mightRain ) && haveUmbrella ) {
			System.out.println("����� ����!");
			
		} else {
			System.out.println("����� ���� �ʴ´� ");
		}
		boolean rainCheck = isRaining || mightRain; //�� ���ų� �ü��� �ְų� �ϋ� �� 
		
		if(rainCheck && haveUmbrella) {
			System.out.println("����� ���� ");
			
		} else {
			System.out.println("����� ���� �ʴ´� ");
		}
	}

}
