package shoppingmall;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop {

	// ?Ό?λͺ? ?΄λ¦?
	String title;
	
	// κΈ°μ‘΄ κ³μ  ??(λ©μΈ ?¨??? λ³?κ²½νκΈ?)
	String[] existingUsers = new String[2];
	String newUser;
	
	Product[] electronicProducts = new Product[3];
	Product[] clothProducts = new Product[3];
	Product[] sportingProducts = new Product[3];
	
	// ?? μΆκ?λ₯? ?? ?₯λ°κ΅¬?
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// ? ??κ°? κ³ λ₯Έ ?? λ²νΈ
	int productNo;
	
	// ?? ₯?΄ μ€λ³΅λ§κΈ° ??¨
	Scanner scan = new Scanner(System.in);
	
	// μ΄? ?? κΈμ‘
	int total = 0;

	/**
	 * ?Ό?λͺ? ?΄λ¦? ?€? (λ©μΈ ?¨??? ?€? ?κΈ?)
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * κΈ°μ‘΄? μ‘΄μ¬?? κ³μ  ?? ?±λ‘νκΈ?
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
	 * ?Ό?λͺ? ???  ? μ½μ? κΈ°λ³Έ?Όλ‘? μ°ν? μ΄κΈ° ?λ¦?
	 */
	public void initAlarm() {
		
		System.out.println("====================================================");
		System.out.println("#  " + title + " ?Ό?λͺ°μ ?€? κ²μ ???©??€.  #");
		System.out.println("#  κΈ°μ‘΄? ???¬ ?Ό?λͺ°μ λ°©λ¬Έ?΄ λ³΄μ ? ?΄ ??Ό? κ°??? [y/n]  #");
		System.out.printf("#  λ°©λ¬Έ?¬λΆ? : ");
		
		String isVisited = scan.next();
		
		switch (isVisited) {
			case "y": 
				
				choiceAccount(); break;
			case "n":
				
				registerAccount(); break;
			default:
				
				System.out.println("#  λ²μλ₯? λ²μ΄?¬?΅??€. ?λ‘κ·Έ?¨? μ’λ£?©??€.");
				System.exit(0); break;
		}
	}
	
	/**
	 * κΈ°μ‘΄ λ°©λ¬Έ?¬λΆ? yλ₯? ???? ?, κΈ°μ‘΄? μ‘΄μ¬?? κ³μ  κ³ λ₯΄? λ©μ? 
	 */
	public void choiceAccount() {
		
		System.out.println("====================================================");
		System.out.println("# ?°?΄?° μ‘°ν κ²°κ³Ό, ? κ°μ κ³μ ?΄ μ‘΄μ¬?©??€. ???? κ³μ ? ? ??΄μ£ΌμΈ?.");
		System.out.println("#  ??[1] : " + existingUsers[0]);
		System.out.println("#  ??[2] : " + existingUsers[1]);
		System.out.printf("#  ? ? -> ");
		
		int userNo = scan.nextInt();
		
		switch (userNo) {
			case 1:
				
				firstUser(existingUsers[0]); break;
			case 2:
				
				secondUser(existingUsers[1]); break;
			default:
				System.out.println("#  λ²μλ₯? λ²μ΄?¬?΅??€. ?λ‘κ·Έ?¨? μ’λ£?©??€.");
				System.exit(0); break;
		}
		
	}
	
	/**
	 * ??κ°??
	 */
	public void registerAccount() {
		
		System.out.println("====================================================");
		System.out.println("#  ??κ°??? μ§ν?©??€.");
		System.out.printf("#  ?±?¨? ?? ₯?΄μ£ΌμΈ? : ");
		
		newUser = scan.next();
		
		UserList userList = new UserList();
		userList.setNewUser(newUser);
		
		System.out.println("====================================================");
		System.out.println("#  " + userList.getNewUser() + "? ???©??€. ???? μΉ΄νκ³ λ¦¬λ₯? ? ??΄μ£ΌμΈ?.");
		
		selectCategory();
	}
	
	/**
	 * κΈ°μ‘΄? ?±λ‘λ μ²? λ²μ§Έ κ³μ  λΆλ¬?€κΈ?
	 * @param firstUser
	 */
	public void firstUser(String firstUser) {
		
		System.out.println("===================================================");
		System.out.println("#  " + firstUser + "? ???©??€. ???? μΉ΄νκ³ λ¦¬λ₯? ? ??΄μ£ΌμΈ?.");
		
		selectCategory();
	}
	
	/**
	 * κΈ°μ‘΄? ?±λ‘λ ? λ²μ§Έ κ³μ  λΆλ¬?€κΈ?
	 * @param secondUser
	 */
	public void secondUser(String secondUser) {
		
		System.out.println("===================================================");
		System.out.println("#  " + secondUser + "? ???©??€. ???? μΉ΄νκ³ λ¦¬λ₯? ? ??΄μ£ΌμΈ?.");
		
		selectCategory();
	}

	/**
	 * ?Ό?λͺ? κ²μ ?€? ?, ?? generate
	 */
	public void genProduct() {
		
		Electronic electronic = new Electronic("LGκ·Έλ¨", 1500000, 5);
		electronic.setCategoryName("? ?κΈ°κΈ°");
		electronicProducts[0] = electronic;
		electronic = new Electronic("?Ό?± ?Έ?κΈ?", 2000000, 2);
		electronicProducts[1] = electronic;
		electronic = new Electronic("??΄? 2?Έ??", 150000, 3);
		electronicProducts[2] = electronic;
		
		Cloth cloth = new Cloth("κ°?? μ½νΈ", 250000, 2);
		cloth.setCategoryName("?λ₯?");
		clothProducts[0] = cloth;
		cloth = new Cloth("κ°?? μ²??μΌ?", 120000, 2);
		clothProducts[1] = cloth;
		cloth = new Cloth("?¨λ§? λ‘±ν¨?©", 470000, 2);
		clothProducts[2] = cloth;
		
		SportingItem sportingItem = new SportingItem("??΄?€ ?λͺ©λ°΄?", 23000, 5);
		sportingItem.setCategoryName("?€?¬μΈ μ©?"); 
		sportingProducts[0] = sportingItem;
		sportingItem = new SportingItem("???€?€ μΆκ΅¬?", 40000, 5);
		sportingProducts[1] = sportingItem;
		sportingItem = new SportingItem("? λ²€ν¬?€ ? ??Ό", 100000, 5);
		sportingProducts[2] = sportingItem;
	}
	
	/**
	 * μΉ΄νκ³ λ¦¬ λͺ©λ‘ μΆλ ₯?κΈ?
	 */
	public void selectCategory() {
		
		System.out.println("???μΉ΄νκ³ λ¦¬λͺ©λ‘???");
		System.out.println("? 1. ? ?κΈ°κΈ°   ?");
		System.out.println("? 2. ?λ₯?      ?");
		System.out.println("? 3. ?€?¬μΈ μ©?  ?");
		System.out.println("???????????????");
		System.out.println("#  [0] : ?₯λ°κ΅¬? λ¬Όν? κ³μ°?©??€.");
		System.out.printf("#  ? ? -> ");
		
		int categoryNo = scan.nextInt();
		
		printProductList(categoryNo);
	}
	
	/**
	 * μΉ΄νκ³ λ¦¬ ?΄?Ή λ²νΈ? λ§λ ?? λͺ©λ‘ μΆλ ₯
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
				
				System.out.println("#  λ²μλ₯? λ²μ΄?¬?΅??€. ?λ‘κ·Έ?¨?΄ μ’λ£???΅??€.");
				System.exit(0); break;
		}
		
	}

	/**
	 * 	??? ? ??? ?, ?₯λ°κ΅¬?? ?£κΈ?
	 * @param product
	 */
	public void putCart(Product product) {
		
		if (product.getRemainingStock() != 0) {
			
			cart.add(product);
			total += product.getPrice();
			
			product.deductRemainingStock(); 
			
			System.out.printf("#  %s? ? ???¨?΅??€. ??¬ ?₯λ°κ΅¬? μ΄? κΈμ‘?? %d? ???€.\n", product.getProductName(), total);
			System.out.println("#  Enter?€λ₯? ?λ₯΄μλ©? μΉ΄νκ³ λ¦¬ λͺ©λ‘?΄ μΆλ ₯?©??€.");
		} else {
			
			System.out.println("==================================================");
			System.out.printf("#  ? ???  %s ? ??? ?¬κ³ κ? λͺ¨λ ?μ§λ??΅??€.\n", product.getProductName());
		}
		
		scan.nextLine();
		scan.nextLine(); // ?? ₯ λ²νΌ μ§??°κΈ?
		
		selectCategory();
	}
	
	/**
	 * μΉ΄νκ³ λ¦¬ ?΄?Ή λ²νΈ? λ§λ ?? λͺ©λ‘ μΆλ ₯
	 * @param products
	 */
	public void selectProduct(Product[] products) {
		
		System.out.println("=================================================================");
		
		// products[0]? ?λ―Έλ 0, 1, 2μ€? ?λ¬΄κ±°? ??? μΆλ ₯κ°μ΄ κ°μ? 0?Όλ‘? ?€? ?¨
		System.out.println("#  " + products[0].getCategoryName() + " μΉ΄νκ³ λ¦¬? ?€?  κ²μ ???©??€. ???? ?? λ²νΈλ₯? ?? ₯?΄μ£ΌμΈ?.");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("#  ??λͺ?" + (i + 1) + " : %s, κ°?κ²? : %d, ?¨?? ?¬κ³? : %d\n", 
					products[i].getProductName(), products[i].getPrice(), products[i].getRemainingStock());
		}
		
		System.out.println("#  [0] : ?₯λ°κ΅¬? λ¬Όν?€? κ³μ°?©??€.");
		System.out.printf("#  ? ? -> ");
		
		productNo = scan.nextInt();
		
		System.out.println("==================================================================");
		
		if (productNo == 0) {
			
			checkout();
		} else if (productNo == 1 || productNo == 2 || productNo == 3) {
			
			putCart(products[productNo-1]);
		} else {
			
			System.out.println("#  λ²μλ₯? λ²μ΄?¬?΅??€. ?λ‘κ·Έ?¨? μ’λ£?©??€.");
			System.exit(0);
		}
	}
	
	
	/**	
	 * μ²΄ν¬??
	 */
	public void checkout() {
		if (total == 0) {
			
			System.out.println("============================================");
			System.out.println("#  ?₯λ°κ΅¬?κ°? λΉμ΄??΅??€. ?₯λ°κ΅¬?? ??? ?΄?μ£ΌμΈ?.");
			
			selectCategory();
		} else {
			
			printShoppingBasket();
			System.out.printf("#  κ²°μ ??€ μ΄? κΈμ‘?? %d? ???€. \n#  ?Ό κ²°μ  λ°©λ²? ? ??΄μ£ΌμΈ? ?Ό\n", total);
			System.out.println("#  [1] : CASH");
			System.out.println("#  [2] : CARD");
			System.out.printf("#  ? ? -> ");
			
			int payment = scan.nextInt();
			
			switch (payment) {
				case 1:
					
					paymentOnCash(); break;
				case 2:
					
					paymentOnCard(); break;
				default:
					
					System.out.println("#  λ²μλ₯? λ²μ΄?¬?΅??€. ?λ‘κ·Έ?¨? μ’λ£?©??€.");
					System.exit(0); break;
			}
		}
	}

	/**
	 * μ²΄ν¬???  ?, μ§?κΈκΉμ§? ?₯λ°κ΅¬?? ?£?΄?¨? ?? λͺ©λ‘?€ ??Έμ°? μΆλ ₯
	 */
	public void printShoppingBasket() {
		
		System.out.println("=========================================");
		System.out.println("???????????₯λ°κ΅¬? λͺ©λ‘???????????");
		System.out.println("?λ²?\t   ??\t\t      κ°?κ²?");
		
		for (int i = 0; i < cart.size(); i++) {
			
			System.out.printf(" %d   ?\t%s   \t?%d \n",i + 1 ,cart.get(i).getProductName(), cart.get(i).getPrice());
		}
		
		System.out.println("??????????????????????????????");
	}
	
	/**
	 * ?κΈ? κ³μ°
	 */
	public void paymentOnCash() {
		
//		System.out.printf("#  ?κΈ? μ§?λΆμ ???¨?΅??€. 15% ? ?Έ??΄ κ²°μ ??€ μ΅μ’ κΈμ‘?? %d? ???€.\n", total * 0.85);
		System.out.println("=======================================");
		System.out.printf("#  μ§?λΆν?€ ?κΈμ ?? ₯?΄μ£ΌμΈ? : ");
		
		int cash = scan.nextInt();
		
		if (cash >= total) {
			
			System.out.println("=======================================");
			System.out.printf("#  %d?? μ§?λΆν?¨?΅??€. κ±°μ€λ¦λ?? %d? ???€.\n", cash, cash - total);
			System.out.println("#  κ³μ°?΄ ?λ£λ??΅??€. ??? κ°??Έ?.");
		} else {
			
			System.out.println("=======================================");
			System.out.printf("#  %d?? ? μ§?λΆν??Ό ?©??€.\n", total - cash);
			
			differencePayment(cash);
		}
		
	}
	
	/**
	 * ?κΈ? μ°¨μ‘ μ§?λΆνκΈ?
	 * @param cash
	 */ 
	public void differencePayment(int cash) {
		
		System.out.printf("#  μ°¨μ‘ μ§?λΆνκΈ? : ");
		
		int difference = scan.nextInt();
		
		if (difference == total - cash) {
			
			System.out.println("=====================================");
			System.out.println("#  κ³μ°?΄ ?λ£λ??΅??€. ??? κ°??Έ?.");
		} else if (difference < total - cash) {
			
			total = (total - cash) - difference; 
			
			System.out.println("=====================================");
			System.out.printf("#  %d?? ? μ§?λΆν??Ό ?©??€.\n", total);
			
			differencePayment(total);
		} else {
			
			System.out.println("=====================================");
			System.out.printf("#  %d?? μ§?λΆν?¨?΅??€. κ±°μ€λ¦λ?? %d? ???€.\n", difference , difference - (total - cash));
			System.out.println("#  κ³μ°?΄ ?λ£λ??΅??€. ??? κ°??Έ?.");
			System.out.println("#  ?λ‘κ·Έ?¨?΄ μ’λ£???΅??€.");
		}
	}
	
	
	/**
	 * μΉ΄λ κ³μ°
	 */
	public void paymentOnCard() {
		
		System.out.println("=====================================");
		System.out.println("#  ??μ¦? ???? κ°???(y/n)");
		System.out.printf("#  ? ? -> ");
		
		String isNeedRecipt = scan.next();
		
		switch (isNeedRecipt) {
		case "y": 
			
			System.out.println("=====================================");
			System.out.println("#  ??μ¦? λ°κΈ?΄ ?λ£λ??΅??€. ??? κ°??Έ?.");
			System.out.println("#  ?λ‘κ·Έ?¨?΄ μ’λ£???΅??€."); break;
		case "n":
			
			System.out.println("=====================================");
			System.out.println("#  κ³μ°?΄ ?λ£λ??΅??€. ??? κ°??Έ?.");
			System.out.println("#  ?λ‘κ·Έ?¨?΄ μ’λ£???΅??€."); break;
		default:
			
			System.out.println("=====================================");
			System.out.println("#  λ²μλ₯? λ²μ΄?¬?΅??€. ?λ‘κ·Έ?¨? μ’λ£?©??€.");
			
			System.exit(0); break;
		}
	}
	
}
