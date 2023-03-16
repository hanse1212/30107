package fruit;

public class FruitBuyer {
	int numOfApple = 0;
	int myMoney = 5000;
	
	public FruitBuyer() {}
	
	public void buyApple(FruitSeller fs, int money) {
		numOfApple += fs.saleApple(money);
		myMoney -= (money/fs.APPLE_PRICE)*fs.APPLE_PRICE;
	}
	
	public void showBuyResult() {
		System.out.println("남은 사과 : " + numOfApple);
		System.out.println("판매 수익 : " + myMoney);
	}
}
