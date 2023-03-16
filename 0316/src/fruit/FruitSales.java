package fruit;

public class FruitSales {

	public static void main(String[] args) {
		FruitSeller fs = new FruitSeller();
		FruitBuyer fb = new FruitBuyer();
		
		fb.buyApple(fs, 2400);
		
		System.out.println("과일 판매자의 현재 상황");
		fs.showSaleResult();
		
		System.out.println("과일 구매자의 현재 상황");
		fb.showBuyResult();
	}

}
