package Instance;

import java.util.Scanner;
public class transaction {
	public static void main(String[] args) {
		Apple_Transaction transaction = new Apple_Transaction();
		Apple_Seller seller = new Apple_Seller();
		Apple_Buyer buyer = new Apple_Buyer();
		transaction.Apple_Trading();
		seller.Seller_Status();
		buyer.Apple_Transaction(transaction.Buyer_Request_Apple);
		buyer.Buyer_Status();
	}
}
class Apple_Transaction {
	String question1;
	int Buyer_Request_Apple;
	Scanner scanner = new Scanner(System.in);
	Apple_Seller seller = new Apple_Seller();
	public void Apple_Trading() {
		System.out.println("안녕하세요! 사과를 구매하시겠어요? \n 1. 구매한다. \n 2. 구매하지 않는다.");
		question1 = scanner.nextLine();
		if (question1.equals("1")) {
			System.out.println("과일장수 : 사과 몇개 구매하겠어요?");
			Buyer_Request_Apple = scanner.nextInt();
			System.out.println("손님 : 사과 " + Buyer_Request_Apple + "개 주세요.");
			seller.Apple_Transaction(Buyer_Request_Apple);
		} else {
			System.out.println("네! 다음에 뵙겠습니다.");
		}
	}
}
class Apple_Seller {
	static int Seller_Money = 0; // 판매자의 재산
	static int Seller_Apple = 100; // 판매자가 보유한 사과 수량
	static final int Apple_Price = 1000; // 사과 가격
	public int Apple_Transaction(int Buyer_Request_Apple) {
		if (Seller_Apple > 0) {
			int num = Buyer_Request_Apple; // 구매자가 준 돈만큼 사과수가 줄어듬. 그 돈에대한 개수를
											// 확인하기 위한 num 변수 선언
			Seller_Apple -= num; // 판매자가 보유한 사과 수량은 구매자가 준 돈에 대한 사과 개수만큼 줄어듬.
			Seller_Money += (Buyer_Request_Apple * Apple_Price); // 그리고, 판매자의 재산은 구매자가 준 돈 만큼 재산이 늘어남
			return Seller_Apple; // 팔린 사과 수 만큼 보유 현황을 갱신해야함.
		} else
			return Seller_Apple;
	}
	public void Seller_Status() {
		System.out.println("판매자의 사과 보유 현황 : " + Seller_Apple);
		System.out.println("판매자의 재산 현황 : " + Seller_Money);
		System.out.println("------------------------------------------");
	}
}
class Apple_Buyer {
	static int Buyer_Money = 100000;
	static int Buyer_Apple = 0;
	Apple_Transaction transaction = new Apple_Transaction();
	Apple_Seller seller = new Apple_Seller();
	public int Apple_Transaction(int Buyer_Request_Apple) {
		Buyer_Apple += Buyer_Request_Apple;
		Buyer_Money -= Buyer_Apple * Apple_Seller.Apple_Price;
		return Buyer_Money;
	}
	public void Buyer_Status() {
		System.out.println("구매자의 사과 보유 현황 : " + Buyer_Apple);
		System.out.println("구매자의 재산 현황 : " + Buyer_Money);
	}
}
class Trade_End {
	public Trade_End() {
		System.out.println("손님 : 아.. 돈이 없네요. 다음에 올게요");
		return;
	}
} 