package Instance;

public class appleBuyer {
	private int buyerMoney;
	private int buyerAppleAmount;
	
	// 거래에 따라 변동되는 손님의 재산과 사과개수를 의미하는 생성자
	public appleBuyer(int money, int appleAmount){
		this.buyerMoney = money;
		this.buyerAppleAmount = appleAmount;
	}
	
	public int appleTransaction(int sellerMoney, int buyerRequestApple){
		buyerMoney -= sellerMoney;
		buyerAppleAmount += buyerRequestApple;
		
		this.buyerStatus();
		return buyerMoney;
	}
	
	public void buyerStatus(){
		System.out.println("--------------------------------");
		System.out.println("현재 손님 재산 : "+this.buyerMoney+"원");
		System.out.println("손님이 보유한 사과 개수 : "+this.buyerAppleAmount+"개");
	}
}