package shoppingmall;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop {

	// ?��?���? ?���?
	String title;
	
	// 기존 계정 ?��?��(메인 ?��?��?��?�� �?경하�?)
	String[] existingUsers = new String[2];
	String newUser;
	
	Product[] electronicProducts = new Product[3];
	Product[] clothProducts = new Product[3];
	Product[] sportingProducts = new Product[3];
	
	// ?��?�� 추�?�? ?��?�� ?��바구?��
	ArrayList<Product> cart = new ArrayList<Product>();
	
	// ?��??�? 고른 ?��?�� 번호
	int productNo;
	
	// ?��?��?�� 중복막기 ?��?��
	Scanner scan = new Scanner(System.in);
	
	// �? ?��?�� 금액
	int total = 0;

	/**
	 * ?��?���? ?���? ?��?��(메인 ?��?��?��?�� ?��?��?���?)
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
	/**
	 * 기존?�� 존재?��?�� 계정 ?��?�� ?��록하�?
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
	 * ?��?���? ?��?��?�� ?�� 콘솔?�� 기본?���? 찍히?�� 초기 ?���?
	 */
	public void initAlarm() {
		
		System.out.println("====================================================");
		System.out.println("#  " + title + " ?��?��몰에 ?��?��것을 ?��?��?��?��?��.  #");
		System.out.println("#  기존?�� ???�� ?��?��몰을 방문?�� 보신?��?�� ?��?��?���??��? [y/n]  #");
		System.out.printf("#  방문?���? : ");
		
		String isVisited = scan.next();
		
		switch (isVisited) {
			case "y": 
				
				choiceAccount(); break;
			case "n":
				
				registerAccount(); break;
			default:
				
				System.out.println("#  범위�? 벗어?��?��?��?��. ?��로그?��?�� 종료?��?��?��.");
				System.exit(0); break;
		}
	}
	
	/**
	 * 기존 방문?���? y�? ?��???�� ?��, 기존?�� 존재?��?�� 계정 고르?�� 메서?�� 
	 */
	public void choiceAccount() {
		
		System.out.println("====================================================");
		System.out.println("# ?��?��?�� 조회 결과, ?�� 개의 계정?�� 존재?��?��?��. ?��?��?��?�� 계정?�� ?��?��?��주세?��.");
		System.out.println("#  ?��?��[1] : " + existingUsers[0]);
		System.out.println("#  ?��?��[2] : " + existingUsers[1]);
		System.out.printf("#  ?��?�� -> ");
		
		int userNo = scan.nextInt();
		
		switch (userNo) {
			case 1:
				
				firstUser(existingUsers[0]); break;
			case 2:
				
				secondUser(existingUsers[1]); break;
			default:
				System.out.println("#  범위�? 벗어?��?��?��?��. ?��로그?��?�� 종료?��?��?��.");
				System.exit(0); break;
		}
		
	}
	
	/**
	 * ?��?���??��
	 */
	public void registerAccount() {
		
		System.out.println("====================================================");
		System.out.println("#  ?��?���??��?�� 진행?��?��?��.");
		System.out.printf("#  ?��?��?�� ?��?��?��주세?�� : ");
		
		newUser = scan.next();
		
		UserList userList = new UserList();
		userList.setNewUser(newUser);
		
		System.out.println("====================================================");
		System.out.println("#  " + userList.getNewUser() + "?�� ?��?��?��?��?��. ?��?��?��?�� 카테고리�? ?��?��?��주세?��.");
		
		selectCategory();
	}
	
	/**
	 * 기존?�� ?��록된 �? 번째 계정 불러?���?
	 * @param firstUser
	 */
	public void firstUser(String firstUser) {
		
		System.out.println("===================================================");
		System.out.println("#  " + firstUser + "?�� ?��?��?��?��?��. ?��?��?��?�� 카테고리�? ?��?��?��주세?��.");
		
		selectCategory();
	}
	
	/**
	 * 기존?�� ?��록된 ?�� 번째 계정 불러?���?
	 * @param secondUser
	 */
	public void secondUser(String secondUser) {
		
		System.out.println("===================================================");
		System.out.println("#  " + secondUser + "?�� ?��?��?��?��?��. ?��?��?��?�� 카테고리�? ?��?��?��주세?��.");
		
		selectCategory();
	}

	/**
	 * ?��?���? 게임 ?��?�� ?��, ?��?�� generate
	 */
	public void genProduct() {
		
		Electronic electronic = new Electronic("LG그램", 1500000, 5);
		electronic.setCategoryName("?��?��기기");
		electronicProducts[0] = electronic;
		electronic = new Electronic("?��?�� ?��?���?", 2000000, 2);
		electronicProducts[1] = electronic;
		electronic = new Electronic("?��?��?�� 2?��??", 150000, 3);
		electronicProducts[2] = electronic;
		
		Cloth cloth = new Cloth("�??�� 코트", 250000, 2);
		cloth.setCategoryName("?���?");
		clothProducts[0] = cloth;
		cloth = new Cloth("�??�� �??���?", 120000, 2);
		clothProducts[1] = cloth;
		cloth = new Cloth("?���? 롱패?��", 470000, 2);
		clothProducts[2] = cloth;
		
		SportingItem sportingItem = new SportingItem("?��?��?�� ?��목밴?��", 23000, 5);
		sportingItem.setCategoryName("?��?��츠용?��"); 
		sportingProducts[0] = sportingItem;
		sportingItem = new SportingItem("?��?��?��?�� 축구?��", 40000, 5);
		sportingProducts[1] = sportingItem;
		sportingItem = new SportingItem("?��벤투?�� ?��?��?��", 100000, 5);
		sportingProducts[2] = sportingItem;
	}
	
	/**
	 * 카테고리 목록 출력?���?
	 */
	public void selectCategory() {
		
		System.out.println("?��?��?��카테고리목록?��?��?��");
		System.out.println("?�� 1. ?��?��기기   ?��");
		System.out.println("?�� 2. ?���?      ?��");
		System.out.println("?�� 3. ?��?��츠용?��  ?��");
		System.out.println("?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��");
		System.out.println("#  [0] : ?��바구?�� 물품?�� 계산?��?��?��.");
		System.out.printf("#  ?��?�� -> ");
		
		int categoryNo = scan.nextInt();
		
		printProductList(categoryNo);
	}
	
	/**
	 * 카테고리 ?��?�� 번호?�� 맞는 ?��?�� 목록 출력
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
				
				System.out.println("#  범위�? 벗어?��?��?��?��. ?��로그?��?�� 종료?��?��?��?��?��.");
				System.exit(0); break;
		}
		
	}

	/**
	 * 	?��?��?�� ?��?��?��?�� ?��, ?��바구?��?�� ?���?
	 * @param product
	 */
	public void putCart(Product product) {
		
		if (product.getRemainingStock() != 0) {
			
			cart.add(product);
			total += product.getPrice();
			
			product.deductRemainingStock(); 
			
			System.out.printf("#  %s?�� ?��?��?��?��?��?��?��. ?��?�� ?��바구?�� �? 금액?? %d?�� ?��?��?��.\n", product.getProductName(), total);
			System.out.println("#  Enter?���? ?��르시�? 카테고리 목록?�� 출력?��?��?��.");
		} else {
			
			System.out.println("==================================================");
			System.out.printf("#  ?��?��?��?�� %s ?��?��?? ?��고�? 모두 ?��진되?��?��?��?��.\n", product.getProductName());
		}
		
		scan.nextLine();
		scan.nextLine(); // ?��?�� 버퍼 �??���?
		
		selectCategory();
	}
	
	/**
	 * 카테고리 ?��?�� 번호?�� 맞는 ?��?�� 목록 출력
	 * @param products
	 */
	public void selectProduct(Product[] products) {
		
		System.out.println("=================================================================");
		
		// products[0]?�� ?��미는 0, 1, 2�? ?��무거?�� ???�� 출력값이 같아?�� 0?���? ?��?��?��
		System.out.println("#  " + products[0].getCategoryName() + " 카테고리?�� ?��?�� 것을 ?��?��?��?��?��. ?��?��?��?�� ?��?�� 번호�? ?��?��?��주세?��.");
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("#  ?��?���?" + (i + 1) + " : %s, �?�? : %d, ?��?? ?���? : %d\n", 
					products[i].getProductName(), products[i].getPrice(), products[i].getRemainingStock());
		}
		
		System.out.println("#  [0] : ?��바구?�� 물품?��?�� 계산?��?��?��.");
		System.out.printf("#  ?��?�� -> ");
		
		productNo = scan.nextInt();
		
		System.out.println("==================================================================");
		
		if (productNo == 0) {
			
			checkout();
		} else if (productNo == 1 || productNo == 2 || productNo == 3) {
			
			putCart(products[productNo-1]);
		} else {
			
			System.out.println("#  범위�? 벗어?��?��?��?��. ?��로그?��?�� 종료?��?��?��.");
			System.exit(0);
		}
	}
	
	
	/**	
	 * 체크?��?��
	 */
	public void checkout() {
		if (total == 0) {
			
			System.out.println("============================================");
			System.out.println("#  ?��바구?���? 비어?��?��?��?��. ?��바구?��?�� ?��?��?�� ?��?��주세?��.");
			
			selectCategory();
		} else {
			
			printShoppingBasket();
			System.out.printf("#  결제?��?�� �? 금액?? %d?�� ?��?��?��. \n#  ?�� 결제 방법?�� ?��?��?��주세?�� ?��\n", total);
			System.out.println("#  [1] : CASH");
			System.out.println("#  [2] : CARD");
			System.out.printf("#  ?��?�� -> ");
			
			int payment = scan.nextInt();
			
			switch (payment) {
				case 1:
					
					paymentOnCash(); break;
				case 2:
					
					paymentOnCard(); break;
				default:
					
					System.out.println("#  범위�? 벗어?��?��?��?��. ?��로그?��?�� 종료?��?��?��.");
					System.exit(0); break;
			}
		}
	}

	/**
	 * 체크?��?��?�� ?��, �?금까�? ?��바구?��?�� ?��?��?��?�� ?��?�� 목록?�� ?��?���? 출력
	 */
	public void printShoppingBasket() {
		
		System.out.println("=========================================");
		System.out.println("?��?��?��?��?��?��?��?��?��?��?��바구?�� 목록?��?��?��?��?��?��?��?��?��?��?��");
		System.out.println("?���?\t   ?��?��\t\t      �?�?");
		
		for (int i = 0; i < cart.size(); i++) {
			
			System.out.printf(" %d   ?��\t%s   \t?��%d \n",i + 1 ,cart.get(i).getProductName(), cart.get(i).getPrice());
		}
		
		System.out.println("?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��?��");
	}
	
	/**
	 * ?���? 계산
	 */
	public void paymentOnCash() {
		
//		System.out.printf("#  ?���? �?불을 ?��?��?��?��?��?��. 15% ?��?��?��?�� 결제?��?�� 최종 금액?? %d?�� ?��?��?��.\n", total * 0.85);
		System.out.println("=======================================");
		System.out.printf("#  �?불하?�� ?��금을 ?��?��?��주세?�� : ");
		
		int cash = scan.nextInt();
		
		if (cash >= total) {
			
			System.out.println("=======================================");
			System.out.printf("#  %d?��?�� �?불하?��?��?��?��. 거스름돈?? %d?�� ?��?��?��.\n", cash, cash - total);
			System.out.println("#  계산?�� ?��료되?��?��?��?��. ?��?��?�� �??��?��.");
		} else {
			
			System.out.println("=======================================");
			System.out.printf("#  %d?��?�� ?�� �?불하?��?�� ?��?��?��.\n", total - cash);
			
			differencePayment(cash);
		}
		
	}
	
	/**
	 * ?���? 차액 �?불하�?
	 * @param cash
	 */ 
	public void differencePayment(int cash) {
		
		System.out.printf("#  차액 �?불하�? : ");
		
		int difference = scan.nextInt();
		
		if (difference == total - cash) {
			
			System.out.println("=====================================");
			System.out.println("#  계산?�� ?��료되?��?��?��?��. ?��?��?�� �??��?��.");
		} else if (difference < total - cash) {
			
			total = (total - cash) - difference; 
			
			System.out.println("=====================================");
			System.out.printf("#  %d?��?�� ?�� �?불하?��?�� ?��?��?��.\n", total);
			
			differencePayment(total);
		} else {
			
			System.out.println("=====================================");
			System.out.printf("#  %d?��?�� �?불하?��?��?��?��. 거스름돈?? %d?�� ?��?��?��.\n", difference , difference - (total - cash));
			System.out.println("#  계산?�� ?��료되?��?��?��?��. ?��?��?�� �??��?��.");
			System.out.println("#  ?��로그?��?�� 종료?��?��?��?��?��.");
		}
	}
	
	
	/**
	 * 카드 계산
	 */
	public void paymentOnCard() {
		
		System.out.println("=====================================");
		System.out.println("#  ?��?���? ?��?��?��?���??��?(y/n)");
		System.out.printf("#  ?��?�� -> ");
		
		String isNeedRecipt = scan.next();
		
		switch (isNeedRecipt) {
		case "y": 
			
			System.out.println("=====================================");
			System.out.println("#  ?��?���? 발급?�� ?��료되?��?��?��?��. ?��?��?�� �??��?��.");
			System.out.println("#  ?��로그?��?�� 종료?��?��?��?��?��."); break;
		case "n":
			
			System.out.println("=====================================");
			System.out.println("#  계산?�� ?��료되?��?��?��?��. ?��?��?�� �??��?��.");
			System.out.println("#  ?��로그?��?�� 종료?��?��?��?��?��."); break;
		default:
			
			System.out.println("=====================================");
			System.out.println("#  범위�? 벗어?��?��?��?��. ?��로그?��?�� 종료?��?��?��.");
			
			System.exit(0); break;
		}
	}
	
}
