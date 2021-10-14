package application;

public class MultiArrayEx {

	public static void main(String[] args) {
		// ÀÌÁÖ¹è¿­ 
		String[][] texts = {
				{"ÇÏ³ª"," µÑ", "¼Â"},
				{"³Ý"," ´Ù¼¸", "¿©¼¸"},
				{"ÀÏ°ö","¿©´ü", "¾ÆÈ©"}
				};
			for(int i=0;i<texts.length;i++) {
			
				for(int j=0;j<texts[i].length; j++) {
					System.out.printf("%\t",texts[i][j]);
				}
			System.out.println();
	}


	}

}
