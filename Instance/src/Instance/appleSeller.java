package Instance;

public class appleSeller {
	private int sellerMoney; //static 정적변수
	private int sellerAppleAmount;
	final int Apple_Price = 1000;
 	// 거래에 따라 변동되는 과일장수의 재산과 사과개수를 의미하는 생성자
	public appleSeller(int money, int appleAmount) {
		this.sellerMoney = money;
		this.sellerAppleAmount = appleAmount;
		
	}
 	// 사과 거래과정
	public int appleTransaction(final int buyerRequestApple){
		if (sellerAppleAmount > 0) {
			sellerAppleAmount -= buyerRequestApple;
			sellerMoney += (buyerRequestApple * Apple_Price);
			this.sellerStatus(); // 같은 클래스 내에서는 함수호출시 this 를 사용.
			appleBuyer buyer = new appleBuyer(100000, 0);
			buyer.appleTransaction(sellerMoney, buyerRequestApple);
			return sellerAppleAmount;
		} else {
			return 0;
		}
	}
	
	// 판매자의 상태 조회
	public void sellerStatus(){
		System.out.println("현재 판매자 재산 : "+this.sellerMoney);
		System.out.println("판매자의 남은 사과 개수 : "+this.sellerAppleAmount);
	}
	
} 