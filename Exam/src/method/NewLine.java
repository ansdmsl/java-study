package method;

public class NewLine {

	
		System.out.println("라인 1");
		threeLines();
		System.out.println("라인 2");
	}

	private static void threeLines() {
		oneLine();
		oneLine();
		oneLine();
		
	}


 private static void oneLine() {
	System.out.println(); // 한줋 뛰움

}
}