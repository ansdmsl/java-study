package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// ==, != , &&(and) , ||(or)]
		boolean isRaining = true; //�� �´���?
		boolean haveUmbrella = false; // ����� ����?
		boolean takeUmbrella = false;
		
		//1.�� ���� ����� ������ ����� ���� 
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
				
			}
		}
		System.out.println("ù���� ��� : " + takeUmbrella);
		
		// and ������ &&
		if(isRaining && haveUmbrella ) {
			takeUmbrella =true;
			
		}System.out.println("AND ���� " +takeUmbrella);
		
		//3. ���� ���� ������ 
		takeUmbrella = isRaining && haveUmbrella  ? true : false;
		
		
	}

}
