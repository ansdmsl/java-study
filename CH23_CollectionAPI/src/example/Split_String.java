package example;

public class Split_String {
	public static void main(String[] args) {
		// ¹®ÀÚ¿­.split(" ") => ¹®ÀÚ¿­À» °ø¹é(space)·Î ÂÉ°³¼­ ¹è¿­·Î ¸®ÅÏ
		String text1 = "When? Joe. Manchin, stepped to the podium in the US Capitol on Monday afternoon, the hope among Democrats was that he was going to announce that he supported the $1.75 trillion social safety net bill -- a moment that would virtually ensure passage of the bulk of President Joe Biden's first-term domestic agenda.";
		String text2 = "½ÃÁßÀºÇàµµ ÃÖ±Ù µé¾î °í±İ¸® ¼ö½Å »óÇ°À» ÀÕµû¶ó ¼±º¸ÀÌ°í ÀÖ´Ù. IBK±â¾÷ÀºÇàÀº ¡®IBK ¾ËÅä½º Àû±İ¡¯À» Ãâ½ÃÇß´Ù. ¾ËÅä½º¹è±¸´ÜÀÇ ¡®µµµå¶÷ 2021~2022 V-¸®±×¡¯ ¼ºÀû¿¡ µû¶ó ¿ì´ë±İ¸®¸¦ Á¦°øÇÏ´Â ÀÚÀ¯Àû¸³½Ä »óÇ°ÀÌ´Ù. °è¾à±â°£Àº 1³âÀÌ¸ç ¿ù ÃÖ´ë 50¸¸¿ø±îÁö ³³ÀÔÀÌ °¡´ÉÇÏ°í ¿¬¸»±îÁö 5¸¸ÁÂ ÇÑÁ¤À¸·Î ÆÇ¸ÅµÈ´Ù. »óÇ°ÀÇ ±âº»±İ¸®´Â ¿¬ 1.00%·Î ¿ì´ë±İ¸® ÃÖ´ë ¿¬ 2.00%Æ÷ÀÎÆ®¸¦ Æ÷ÇÔÇÑ ÃÖ°í±İ¸®´Â ¿¬ 3.00%´Ù.";
		
		//String[] words = text1.split("[^a-zA-Z]+"); //Á¤±ÔÇ¥Çö½Ä[] ^½ÃÀÛ¹®ÀÚ
		String[] words = text2.split("[^°¡-ÆR]+");
		
		
		for(String w : words) {
			
			if(w.length()<2) continue; //ÇÑ Ã¶ÀÚÀÌÇÏ´Â »©±â
			
			System.out.println(w.toLowerCase()); //ÀüºÎ ¼Ò¹®ÀÚ·Î Ãâ·Â
		}
	}

}