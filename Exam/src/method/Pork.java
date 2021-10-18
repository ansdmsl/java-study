package method;

public class Pork {
	public static void main(String[] args) {
	int pweigh = 180;
	double pcal = 5.179;
	int inbun = 3;
	
	double result = Calc(inbun,pweigh,pcal);
	System.out.println("ªÔ∞›ªÏ 3¿Œ∫– :" + result + "kcal");

	}
	
	private static double Calc(int n, int x, double y) {
		return n* x * y ;
		
	

}
}

