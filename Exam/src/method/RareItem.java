package method;

public class RareItem {

	public static void main(String[] args) {
		wear(2400,2000);
		wear(3800,1200);

	}

	private static void wear(int hp, int mp) {
		if(hp == 100)
			System.out.println("체력이 가득");
		else if(hp >= 50)
			System.out.println("체력이 손실");
		else
			System.out.println("체력이 부족");
		
	}
	

}
