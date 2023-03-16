package fruit;

public class FruitSeller {
	int numOfApple = 20;
	int myMoney = 0;
	final int APPLE_PRICE = 1000;
	
	public FruitSeller() {}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney = (money/APPLE_PRICE)*APPLE_PRICE;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
	
}
