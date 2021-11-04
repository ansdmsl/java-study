package shoppingmall;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop {

	// ?‡¼?•‘ëª? ?´ë¦?
	String title;
	
	// ê¸°ì¡´ ê³„ì • ?…‹?Œ…(ë©”ì¸ ?•¨?ˆ˜?—?„œ ë³?ê²½í•˜ê¸?)
	String[] existingUsers = new String[2];
	String newUser;
	
	Product[] electronicProducts = new Product[3];
	Product[] clothProducts = new Product[3];
	Product[] sportingProducts = new Product[3];
	
	// ?ƒ?’ˆ ì¶”ê?ë¥? ?œ„?•œ ?¥ë°”êµ¬?‹ˆ
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// ?œ ??ê°? ê³ ë¥¸ ?ƒ?’ˆ ë²ˆí˜¸
	int productNo;
	
	// ?…? ¥?´ ì¤‘ë³µë§‰ê¸° ?œ„?•¨
	Scanner scan = new Scanner(System.in);
	
	// ì´? ?ƒ?’ˆ ê¸ˆì•¡
	int total = 0;

	/**
	 * ?‡¼?•‘ëª? ?´ë¦? ?„¤? •(ë©”ì¸ ?•¨?ˆ˜?—?„œ ?„¤? •?•˜ê¸?)
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * ê¸°ì¡´?— ì¡´ì¬?•˜?˜ ê³„ì • ?šŒ?› ?“±ë¡í•˜ê¸?
	 * @param firstUser
	 * @param secondUser
	 * @param existingUsers
	 */
	public void setExistingUsers(String firstUser, String secondUser, String[] existingUsers) {
		
		UserList userList = new UserList();
		
		userList.setFirstUser(firstUser);
		userList.setSecondUser(secondUser);
		
		existingUsers[0] = userList.getFirstUser();
		existingUsers[1] = userList.getSecondUser();
	}
	
	/**
	 * ?‡¼?•‘ëª? ?‹œ?‘?•  ?•Œ ì½˜ì†”?— ê¸°ë³¸?œ¼ë¡? ì°íˆ?Š” ì´ˆê¸° ?•Œë¦?
	 */
	public void initAlarm() {
		
		System.out.println("====================================================");
		System.out.println("#  " + title + " ?‡¼?•‘ëª°ì— ?˜¤?‹ ê²ƒì„ ?™˜?˜?•©?‹ˆ?‹¤.  #");
		System.out.println("#  ê¸°ì¡´?— ???¬ ?‡¼?•‘ëª°ì„ ë°©ë¬¸?•´ ë³´ì‹ ? ?´ ?ˆ?œ¼?‹ ê°??š”? [y/n]  #");
		System.out.printf("#  ë°©ë¬¸?—¬ë¶? : ");
		
		String isVisited = scan.next();
		
		switch (isVisited) {
			case "y": 
				
				choiceAccount(); break;
			case "n":
				
				registerAccount(); break;
			default:
				
				System.out.println("#  ë²”ìœ„ë¥? ë²—ì–´?‚¬?Šµ?‹ˆ?‹¤. ?”„ë¡œê·¸?¨?„ ì¢…ë£Œ?•©?‹ˆ?‹¤.");
				System.exit(0); break;
		}
	}
	
	/**
	 * ê¸°ì¡´ ë°©ë¬¸?—¬ë¶? yë¥? ?ˆŒ???„ ?•Œ, ê¸°ì¡´?— ì¡´ì¬?•˜?˜ ê³„ì • ê³ ë¥´?Š” ë©”ì„œ?“œ 
	 */
	public void choiceAccount() {
		
		System.out.println("====================================================");
		System.out.println("# ?°?´?„° ì¡°íšŒ ê²°ê³¼, ?‘ ê°œì˜ ê³„ì •?´ ì¡´ì¬?•©?‹ˆ?‹¤. ?›?•˜?‹œ?Š” ê³„ì •?„ ?„ ?ƒ?•´ì£¼ì„¸?š”.");
		System.out.println("#  ?šŒ?›[1] : " + existingUsers[0]);
		System.out.println("#  ?šŒ?›[2] : " + existingUsers[1]);
		System.out.printf("#  ?„ ?ƒ -> ");
		
		int userNo = scan.nextInt();
		
		switch (userNo) {
			case 1:
				
				firstUser(existingUsers[0]); break;
			case 2:
				
				secondUser(existingUsers[1]); break;
			default:
				System.out.println("#  ë²”ìœ„ë¥? ë²—ì–´?‚¬?Šµ?‹ˆ?‹¤. ?”„ë¡œê·¸?¨?„ ì¢…ë£Œ?•©?‹ˆ?‹¤.");
				System.exit(0); break;
		}
		
	}
	
	/**
	 * ?šŒ?›ê°??…
	 */
	public void registerAccount() {
		
		System.out.println("====================================================");
		System.out.println("#  ?šŒ?›ê°??…?„ ì§„í–‰?•©?‹ˆ?‹¤.");
		System.out.printf("#  ?„±?•¨?„ ?…? ¥?•´ì£¼ì„¸?š” : ");
		
		newUser = scan.next();
		
		UserList userList = new UserList();
		userList.setNewUser(newUser);
		
		System.out.println("====================================================");
		System.out.println("#  " + userList.getNewUser() + "?‹˜ ?™˜?˜?•©?‹ˆ?‹¤. ?›?•˜?‹œ?Š” ì¹´í…Œê³ ë¦¬ë¥? ?„ ?ƒ?•´ì£¼ì„¸?š”.");
		
		selectCategory();
	}
	
	/**
	 * ê¸°ì¡´?— ?“±ë¡ëœ ì²? ë²ˆì§¸ ê³„ì • ë¶ˆëŸ¬?˜¤ê¸?
	 * @param firstUser
	 */
	public void firstUser(String firstUser) {
		
		System.out.println("===================================================");
		System.out.println("#  " + firstUser + "?‹˜ ?™˜?˜?•©?‹ˆ?‹¤. ?›?•˜?‹œ?Š” ì¹´í…Œê³ ë¦¬ë¥? ?„ ?ƒ?•´ì£¼ì„¸?š”.");
		
		selectCategory();
	}
	
	/**
	 * ê¸°ì¡´?— ?“±ë¡ëœ ?‘ ë²ˆì§¸ ê³„ì • ë¶ˆëŸ¬?˜¤ê¸?
	 * @param secondUser
	 */
	public void secondUser(String secondUser) {
		
		System.out.println("===================================================");
		System.out.println("#  " + secondUser + "?‹˜ ?™˜?˜?•©?‹ˆ?‹¤. ?›?•˜?‹œ?Š” ì¹´í…Œê³ ë¦¬ë¥? ?„ ?ƒ?•´ì£¼ì„¸?š”.");
		
		selectCategory();
	}

	/**
	 * ?‡¼?•‘ëª? ê²Œì„ ?‹¤?–‰ ?‹œ, ?ƒ?’ˆ generate
	 */
	public void genProduct() {
		
		Electronic electronic = new Electronic("LGê·¸ë¨", 1500000, 5);
		electronic.setCategoryName("? „?ê¸°ê¸°");
		electronicProducts[0] = electronic;
		electronic = new Electronic("?‚¼?„± ?„¸?ƒê¸?", 2000000, 2);
		electronicProducts[1] = electronic;
		electronic = new Electronic("?—?–´?ŒŸ 2?„¸??", 150000, 3);
		electronicProducts[2] = electronic;
		
		Cloth cloth = new Cloth("ê°??„ ì½”íŠ¸", 250000, 2);
		cloth.setCategoryName("?˜ë¥?");
		clothProducts[0] = cloth;
		cloth = new Cloth("ê°??„ ì²??ì¼?", 120000, 2);
		clothProducts[1] = cloth;
		cloth = new Cloth("?“¨ë§? ë¡±íŒ¨?”©", 470000, 2);
		clothProducts[2] = cloth;
		
		SportingItem sportingItem = new SportingItem("?‚˜?´?‚¤ ?†ëª©ë°´?“œ", 23000, 5);
		sportingItem.setCategoryName("?Š¤?¬ì¸ ìš©?’ˆ"); 
		sportingProducts[0] = sportingItem;
		sportingItem = new SportingItem("?•„?””?‹¤?Š¤ ì¶•êµ¬?™”", 40000, 5);
		sportingProducts[1] = sportingItem;
		sportingItem = new SportingItem("?œ ë²¤íˆ¬?Š¤ ?œ ?‹ˆ?¼", 100000, 5);
		sportingProducts[2] = sportingItem;
	}
	
	/**
	 * ì¹´í…Œê³ ë¦¬ ëª©ë¡ ì¶œë ¥?•˜ê¸?
	 */
	public void selectCategory() {
		
		System.out.println("?”?”?”ì¹´í…Œê³ ë¦¬ëª©ë¡?”?”?”“");
		System.out.println("?”ƒ 1. ? „?ê¸°ê¸°   ?”ƒ");
		System.out.println("?”ƒ 2. ?˜ë¥?      ?”ƒ");
		System.out.println("?”ƒ 3. ?Š¤?¬ì¸ ìš©?’ˆ  ?”ƒ");
		System.out.println("?”—?”?”?”?”?”?”?”?”?”?”?”?”?”?”›");
		System.out.println("#  [0] : ?¥ë°”êµ¬?‹ˆ ë¬¼í’ˆ?„ ê³„ì‚°?•©?‹ˆ?‹¤.");
		System.out.printf("#  ?„ ?ƒ -> ");
		
		int categoryNo = scan.nextInt();
		
		printProductList(categoryNo);
	}
	
	/**
	 * ì¹´í…Œê³ ë¦¬ ?•´?‹¹ ë²ˆí˜¸?— ë§ëŠ” ?ƒ?’ˆ ëª©ë¡ ì¶œë ¥
	 * @param categoryNo
	 */
	public void printProductList(int categoryNo) {
		switch(categoryNo) {
			case 0:
				
				checkout(); break;
			case 1:
				
				selectProduct(electronicProducts); break;
			case 2:
				
				selectProduct(clothProducts); break;
			case 3:
				
				selectProduct(sportingProducts); break;
			default:
				
				System.out.println("#  ë²”ìœ„ë¥? ë²—ì–´?‚¬?Šµ?‹ˆ?‹¤. ?”„ë¡œê·¸?¨?´ ì¢…ë£Œ?˜?—ˆ?Šµ?‹ˆ?‹¤.");
				System.exit(0); break;
		}
		
	}

	/**
	 * 	?ƒ?’ˆ?„ ?„ ?ƒ?–ˆ?„ ?•Œ, ?¥ë°”êµ¬?‹ˆ?— ?„£ê¸?
	 * @param product
	 */
	public void putCart(Product product) {
		
		if (product.getRemainingStock() != 0) {
			
			cart.add(product);
			total += product.getPrice();
			
			product.deductRemainingStock(); 
			
			System.out.printf("#  %s?„ ?„ ?ƒ?•˜?…¨?Šµ?‹ˆ?‹¤. ?˜„?¬ ?¥ë°”êµ¬?‹ˆ ì´? ê¸ˆì•¡?? %d?› ?…?‹ˆ?‹¤.\n", product.getProductName(), total);
			System.out.println("#  Enter?‚¤ë¥? ?ˆ„ë¥´ì‹œë©? ì¹´í…Œê³ ë¦¬ ëª©ë¡?´ ì¶œë ¥?©?‹ˆ?‹¤.");
		} else {
			
			System.out.println("==================================================");
			System.out.printf("#  ?„ ?ƒ?•˜?‹  %s ? œ?’ˆ?? ?¬ê³ ê? ëª¨ë‘ ?†Œì§„ë˜?—ˆ?Šµ?‹ˆ?‹¤.\n", product.getProductName());
		}
		
		scan.nextLine();
		scan.nextLine(); // ?…? ¥ ë²„í¼ ì§??š°ê¸?
		
		selectCategory();
	}
	
	/**
	 * ì¹´í…Œê³ ë¦¬ ?•´?‹¹ ë²ˆí˜¸?— ë§ëŠ” ?ƒ?’ˆ ëª©ë¡ ì¶œë ¥
	 * @param products
	 */
	public void selectProduct(Product[] products) {
		
		System.out.println("=================================================================");
		
		// products[0]?˜ ?˜ë¯¸ëŠ” 0, 1, 2ì¤? ?•„ë¬´ê±°?‚˜ ???„ ì¶œë ¥ê°’ì´ ê°™ì•„?„œ 0?œ¼ë¡? ?„¤? •?•¨
		System.out.println("#  " + products[0].getCategoryName() + " ì¹´í…Œê³ ë¦¬?— ?˜¤?‹  ê²ƒì„ ?™˜?˜?•©?‹ˆ?‹¤. ?›?•˜?‹œ?Š” ?ƒ?’ˆ ë²ˆí˜¸ë¥? ?…? ¥?•´ì£¼ì„¸?š”.");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("#  ?ƒ?’ˆëª?" + (i + 1) + " : %s, ê°?ê²? : %d, ?‚¨?? ?¬ê³? : %d\n", 
					products[i].getProductName(), products[i].getPrice(), products[i].getRemainingStock());
		}
		
		System.out.println("#  [0] : ?¥ë°”êµ¬?‹ˆ ë¬¼í’ˆ?“¤?„ ê³„ì‚°?•©?‹ˆ?‹¤.");
		System.out.printf("#  ?„ ?ƒ -> ");
		
		productNo = scan.nextInt();
		
		System.out.println("==================================================================");
		
		if (productNo == 0) {
			
			checkout();
		} else if (productNo == 1 || productNo == 2 || productNo == 3) {
			
			putCart(products[productNo-1]);
		} else {
			
			System.out.println("#  ë²”ìœ„ë¥? ë²—ì–´?‚¬?Šµ?‹ˆ?‹¤. ?”„ë¡œê·¸?¨?„ ì¢…ë£Œ?•©?‹ˆ?‹¤.");
			System.exit(0);
		}
	}
	
	
	/**	
	 * ì²´í¬?•„?›ƒ
	 */
	public void checkout() {
		if (total == 0) {
			
			System.out.println("============================================");
			System.out.println("#  ?¥ë°”êµ¬?‹ˆê°? ë¹„ì–´?ˆ?Šµ?‹ˆ?‹¤. ?¥ë°”êµ¬?‹ˆ?— ?ƒ?’ˆ?„ ?‹´?•„ì£¼ì„¸?š”.");
			
			selectCategory();
		} else {
			
			printShoppingBasket();
			System.out.printf("#  ê²°ì œ?•˜?‹¤ ì´? ê¸ˆì•¡?? %d?› ?…?‹ˆ?‹¤. \n#  ?–¼ ê²°ì œ ë°©ë²•?„ ?„ ?ƒ?•´ì£¼ì„¸?š” ?–¼\n", total);
			System.out.println("#  [1] : CASH");
			System.out.println("#  [2] : CARD");
			System.out.printf("#  ?„ ?ƒ -> ");
			
			int payment = scan.nextInt();
			
			switch (payment) {
				case 1:
					
					paymentOnCash(); break;
				case 2:
					
					paymentOnCard(); break;
				default:
					
					System.out.println("#  ë²”ìœ„ë¥? ë²—ì–´?‚¬?Šµ?‹ˆ?‹¤. ?”„ë¡œê·¸?¨?„ ì¢…ë£Œ?•©?‹ˆ?‹¤.");
					System.exit(0); break;
			}
		}
	}

	/**
	 * ì²´í¬?•„?›ƒ?•  ?•Œ, ì§?ê¸ˆê¹Œì§? ?¥ë°”êµ¬?‹ˆ?— ?„£?–´?†¨?˜ ?ƒ?’ˆ ëª©ë¡?“¤ ?™•?¸ì°? ì¶œë ¥
	 */
	public void printShoppingBasket() {
		
		System.out.println("=========================================");
		System.out.println("?”?”?”?”?”?”?”?”?”?”?¥ë°”êµ¬?‹ˆ ëª©ë¡?”?”?”?”?”?”?”?”?”?”?”");
		System.out.println("?ˆœë²?\t   ?ƒ?’ˆ\t\t      ê°?ê²?");
		
		for (int i = 0; i < cart.size(); i++) {
			
			System.out.printf(" %d   ?”ƒ\t%s   \t?”ƒ%d \n",i + 1 ,cart.get(i).getProductName(), cart.get(i).getPrice());
		}
		
		System.out.println("?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”?”");
	}
	
	/**
	 * ?˜„ê¸? ê³„ì‚°
	 */
	public void paymentOnCash() {
		
//		System.out.printf("#  ?˜„ê¸? ì§?ë¶ˆì„ ?ƒ?•˜?…¨?Šµ?‹ˆ?‹¤. 15% ?• ?¸?˜?–´ ê²°ì œ?•˜?‹¤ ìµœì¢… ê¸ˆì•¡?? %d?› ?…?‹ˆ?‹¤.\n", total * 0.85);
		System.out.println("=======================================");
		System.out.printf("#  ì§?ë¶ˆí•˜?‹¤ ?˜„ê¸ˆì„ ?…? ¥?•´ì£¼ì„¸?š” : ");
		
		int cash = scan.nextInt();
		
		if (cash >= total) {
			
			System.out.println("=======================================");
			System.out.printf("#  %d?›?„ ì§?ë¶ˆí•˜?…¨?Šµ?‹ˆ?‹¤. ê±°ìŠ¤ë¦„ëˆ?? %d?› ?…?‹ˆ?‹¤.\n", cash, cash - total);
			System.out.println("#  ê³„ì‚°?´ ?™„ë£Œë˜?—ˆ?Šµ?‹ˆ?‹¤. ?•ˆ?…•?ˆ ê°??„¸?š”.");
		} else {
			
			System.out.println("=======================================");
			System.out.printf("#  %d?›?„ ?” ì§?ë¶ˆí•˜?…”?•¼ ?•©?‹ˆ?‹¤.\n", total - cash);
			
			differencePayment(cash);
		}
		
	}
	
	/**
	 * ?˜„ê¸? ì°¨ì•¡ ì§?ë¶ˆí•˜ê¸?
	 * @param cash
	 */ 
	public void differencePayment(int cash) {
		
		System.out.printf("#  ì°¨ì•¡ ì§?ë¶ˆí•˜ê¸? : ");
		
		int difference = scan.nextInt();
		
		if (difference == total - cash) {
			
			System.out.println("=====================================");
			System.out.println("#  ê³„ì‚°?´ ?™„ë£Œë˜?—ˆ?Šµ?‹ˆ?‹¤. ?•ˆ?…•?ˆ ê°??„¸?š”.");
		} else if (difference < total - cash) {
			
			total = (total - cash) - difference; 
			
			System.out.println("=====================================");
			System.out.printf("#  %d?›?„ ?” ì§?ë¶ˆí•˜?…”?•¼ ?•©?‹ˆ?‹¤.\n", total);
			
			differencePayment(total);
		} else {
			
			System.out.println("=====================================");
			System.out.printf("#  %d?›?„ ì§?ë¶ˆí•˜?…¨?Šµ?‹ˆ?‹¤. ê±°ìŠ¤ë¦„ëˆ?? %d?› ?…?‹ˆ?‹¤.\n", difference , difference - (total - cash));
			System.out.println("#  ê³„ì‚°?´ ?™„ë£Œë˜?—ˆ?Šµ?‹ˆ?‹¤. ?•ˆ?…•?ˆ ê°??„¸?š”.");
			System.out.println("#  ?”„ë¡œê·¸?¨?´ ì¢…ë£Œ?˜?—ˆ?Šµ?‹ˆ?‹¤.");
		}
	}
	
	
	/**
	 * ì¹´ë“œ ê³„ì‚°
	 */
	public void paymentOnCard() {
		
		System.out.println("=====================================");
		System.out.println("#  ?˜?ˆ˜ì¦? ?•„?š”?•˜?‹ ê°??š”?(y/n)");
		System.out.printf("#  ?„ ?ƒ -> ");
		
		String isNeedRecipt = scan.next();
		
		switch (isNeedRecipt) {
		case "y": 
			
			System.out.println("=====================================");
			System.out.println("#  ?˜?ˆ˜ì¦? ë°œê¸‰?´ ?™„ë£Œë˜?—ˆ?Šµ?‹ˆ?‹¤. ?•ˆ?…•?ˆ ê°??„¸?š”.");
			System.out.println("#  ?”„ë¡œê·¸?¨?´ ì¢…ë£Œ?˜?—ˆ?Šµ?‹ˆ?‹¤."); break;
		case "n":
			
			System.out.println("=====================================");
			System.out.println("#  ê³„ì‚°?´ ?™„ë£Œë˜?—ˆ?Šµ?‹ˆ?‹¤. ?•ˆ?…•?ˆ ê°??„¸?š”.");
			System.out.println("#  ?”„ë¡œê·¸?¨?´ ì¢…ë£Œ?˜?—ˆ?Šµ?‹ˆ?‹¤."); break;
		default:
			
			System.out.println("=====================================");
			System.out.println("#  ë²”ìœ„ë¥? ë²—ì–´?‚¬?Šµ?‹ˆ?‹¤. ?”„ë¡œê·¸?¨?„ ì¢…ë£Œ?•©?‹ˆ?‹¤.");
			
			System.exit(0); break;
		}
	}
	
}
