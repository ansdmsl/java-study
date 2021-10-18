package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// || or 논리 연산자 
		boolean isRaining = true; //비가 온느가?
		boolean mightRain= false; // 비가 올수도 있는가"?
		boolean takeUmbrella = false;// 우산을 가져ㅑ가나 ?
		
		takeUmbrella = false;// 우상을 가져가나?
		takeUmbrella = isRaining || mightRain; // 비가 오거나 또는 올수동 ㅣㅆ거나 하나라도 참이면 ㅊ마 
		System.out.println(takeUmbrella );
		
	}

}
