package Instance;

public class appleSeller {
	private int sellerMoney; //static 정적변수
	private int sellerAppleAmount;
	int sellerDayOfTheWeek;
	double Apple_Price=1000;
	double Discount_Rate;
	
	
 	// 거래에 따라 변동되는 과일장수의 재산과 사과개수를 의미하는 생성자
	public appleSeller(int money, int appleAmount, int dayOfTheWeek) {
		this.sellerMoney = money;
		this.sellerAppleAmount = appleAmount;
		this.sellerDayOfTheWeek = dayOfTheWeek;
	}

 	// 사과 거래과정
	public int appleTransaction(final int buyerRequestApple){
		switch(sellerDayOfTheWeek) {
			case dayOfWeekConst.SUNDAY  : 
				Discount_Rate = 0.01;			
				break;
			case dayOfWeekConst.MONDAY  : 
				Discount_Rate = 0.02;			
				break;
			case dayOfWeekConst.TUESDAY  : 
				Discount_Rate = 0.03;			
				break;
			case dayOfWeekConst.WENDSDAY  : 
				Discount_Rate = 0.04;			
				break;
			case dayOfWeekConst.THURSDAY  : 
				Discount_Rate = 0.05;			
				break;
			case dayOfWeekConst.FRIDAY  : 
				Discount_Rate = 0.06;			
				break;
			case dayOfWeekConst.SATUREDAY : 
				Discount_Rate = 0.07;			
				break;
			default: 
				Discount_Rate = 0.01;
				break;
		}
		
		if (sellerAppleAmount > 0) {
			double Apple_Final_Price = Apple_Price -(Apple_Price *Discount_Rate);
			sellerAppleAmount -= buyerRequestApple;
			sellerMoney += (buyerRequestApple * Apple_Final_Price);
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
		System.out.println("--------------------------------");
		System.out.println("현재 판매자 재산 : "+this.sellerMoney+"원");
		System.out.println("판매자의 남은 사과 개수 : "+this.sellerAppleAmount+"개");
	}
	
} 