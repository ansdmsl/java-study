package shoppingmall;

public class StartShopping {

	public static void main(String[] args) {
		
		MyShop myshop = new MyShop();
		
		myshop.setTitle("11번�?");
		myshop.genProduct();
		myshop.setExistingUsers("조재?��", "권혁�?", myshop.existingUsers);
		myshop.initAlarm();
	}

}
