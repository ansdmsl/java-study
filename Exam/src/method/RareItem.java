package method;

public class RareItem {

	public static void main(String[] args) {
		wear(2400,2000);
		wear(3800,1200);

	}

	private static void wear(int hp, int mp) {
		if(hp == 100)
			System.out.println("ü���� ����");
		else if(hp >= 50)
			System.out.println("ü���� �ս�");
		else
			System.out.println("ü���� ����");
		
	}
	

}
