package castiing;

public class HouseCat extends cat {
	// 같은 vocaL() 메소드를 오버라이딩(같은 메소드에 다른 내용을 작성)
	@Override
	public void vocal() {
		System.out.println("미야우!");
	}
	
	//집고양ㅇ이의 메소드 
	public void call() {
		System.out.println("집사를 부릅니다~");}
	
	}
}
