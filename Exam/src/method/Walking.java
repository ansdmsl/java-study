package method;

public class Walking {

	public static void main(String[] args) {
		
		// 1.Į�θ� ����� ���� �޼ҵ� ȣ�� 
		CalculateCalory(5000);
		
		// 3. ����� ���� 
		int walk = 5000;
		double result = CalculateCalory(5000);
		System.out.println("Į�θ� " + result + "kcal");
}	
	
// �޼ҵ� ���� 
	private static double CalculateCalory(int walk) {
		return 0.02 * walk;
		
	}



}
