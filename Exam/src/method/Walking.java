package method;

public class Walking {

	public static void main(String[] args) {
		
		// 1.칼로리 계산을 위해 메소드 호출 
		CalculateCalory(5000);
		
		// 3. 결과룰 춫력 
		int walk = 5000;
		double result = CalculateCalory(5000);
		System.out.println("칼로리 " + result + "kcal");
}	
	
// 메소드 정의 
	private static double CalculateCalory(int walk) {
		return 0.02 * walk;
		
	}



}
