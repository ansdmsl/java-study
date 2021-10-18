package application;

public class BooleanOr {

	public static void main(String[] args) {
		// || or 논리 연산자 
		boolean isRaining = false; //비가 온느가?
		boolean mightRain= true; // 비가 올수도 있는가"?
		boolean haveUmbrella = false;// 우산을 가져ㅑ가나 ?
		
		if((isRaining || mightRain ) && haveUmbrella ) {
			System.out.println("우산을 쓴다!");
			
		} else {
			System.out.println("우상을 쓰지 않는다 ");
		}
		boolean rainCheck = isRaining || mightRain; //비가 오거나 올수도 있거나 일떄 참 
		
		if(rainCheck && haveUmbrella) {
			System.out.println("우산을 쓴다 ");
			
		} else {
			System.out.println("우산을 쓰지 않는다 ");
		}
	}

}
