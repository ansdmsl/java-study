package try_catch_finally;

public class App {

	public static void main(String[] args)  {
	Person p1 = new Person();
	
	try {
		p1.setName("펭수");
		System.out.println("여기는 실행ㅇ안됨");
	} catch (Exception e) {
		System.out.println(e.getMessage());
	} finally {
		//예외 발생 하든 안하든 무조건 실행이됨 
		System.out.println("final 무조건 실행");
	}
	
	System.out.println("프로그램 종료");
	}
}


