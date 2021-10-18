package method;

public class Walking {

	public static void main(String[] args) {
		
		// 1.Ä®·Î¸® °è»êÀ» À§ÇØ ¸Þ¼Òµå È£Ãâ 
		CalculateCalory(5000);
		
		// 3. °á°ú·ê ­ˆ·Â 
		int walk = 5000;
		double result = CalculateCalory(5000);
		System.out.println("Ä®·Î¸® " + result + "kcal");
}	
	
// ¸Þ¼Òµå Á¤ÀÇ 
	private static double CalculateCalory(int walk) {
		return 0.02 * walk;
		
	}



}
