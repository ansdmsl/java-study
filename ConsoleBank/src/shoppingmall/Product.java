package shoppingmall;

public abstract class Product {

	protected String categoryName;
	protected String productName;
	protected int price;
	protected int remainingStock;
	
	Product(String productName, int price, int remainingStock) {
		this.productName = productName;
		this.price = price;
		this.remainingStock = remainingStock;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	};
	
	public String getCategoryName() {
		return this.categoryName;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public int getRemainingStock() {
		return this.remainingStock;
	}
	
	public void deductRemainingStock() {
		this.remainingStock--;
	}
	
	public void printDetail(int num) {
		System.out.printf("#  ?????????%d : %s, ?????? : %d, ????? ?????? : %d\n", num + 1, productName, price, remainingStock);
	};
}
