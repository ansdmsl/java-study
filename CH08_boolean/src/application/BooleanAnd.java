package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// ==, != , &&(and) , ||(or)]
		boolean isRaining = true; //비가 온느가?
		boolean haveUmbrella = false; // 우산을 쓰나?
		boolean takeUmbrella = false;
		
		//1.비가 오고 우산이 있으면 우산을 쓴다 
		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
				
			}
		}
		System.out.println("첫번쨰 경우 : " + takeUmbrella);
		
		// and 연산자 &&
		if(isRaining && haveUmbrella ) {
			takeUmbrella =true;
			
		}System.out.println("AND 사용시 " +takeUmbrella);
		
		//3. 삼항 조건 연산자 
		takeUmbrella = isRaining && haveUmbrella  ? true : false;
		
		
	}

}
