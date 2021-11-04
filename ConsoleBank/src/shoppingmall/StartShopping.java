package shoppingmall;

public class StartShopping {

	public static void main(String[] args) {
		
		MyShop myshop = new MyShop();
		
		myshop.setTitle("11ë²ˆê?");
		myshop.genProduct();
		myshop.setExistingUsers("ì¡°ì¬?¬", "ê¶Œí˜ì²?", myshop.existingUsers);
		myshop.initAlarm();
	}

}
