package staticMethod;

public class Cat {
	private String name; //고양ㅇ이이름 
	private int id; //고양이 아이디
	public static final String FOOD = "고양이 사료";
	// 스테틱변수는 객체에서 공유가능
	public static int count = 0; // 생선한 고양이 숫자 
	
	public Cat(String name) { // 생성자는 리턴 타입이 없음 (일반 메소드랑 다름 )
		this.name = name;
		// 코드 추가 
		
		count++; //고양이 객체 생성시 count가  +1 됨다 
		id = count;
		
	}

	@Override
	public String toString() { // toString 메소드 자동생성
		return "고양이 [아이디= " + id + " 이름 =" + name + "]";
	}

	public static int getCount() { 
		// 스테틱 메소드 
		// String n = name; 스테틱 메소드에서 인스턴스 (객체)변수를 
		return count;
	}
	
	
}
