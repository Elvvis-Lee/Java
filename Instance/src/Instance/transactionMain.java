package Instance;

import java.util.Scanner;
public class transactionMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String question1;
		appleSeller seller = new appleSeller(0,100);	// 재산(0원), 판매자의 사과 개수(100개)을 초기값으로 지정
		
		System.out.println("과일장수 : 안녕하세요! 사과를 구매하시겠습니까?\n 1.구매한다 \n 2.구매하지 않는다.");
		question1 = scanner.nextLine();
		
		if (question1.equals("1")) {
			System.out.print("과일장수 : 네! 몇개 구매하겠어요?");
			int requestAppleCount = scanner.nextInt();
			System.out.println("손님 : " + requestAppleCount + "개 주세요.");
			seller.appleTransaction(requestAppleCount);	//appleSeller.java의 appleTransaction 메소드 호출.			
		} 
		else {
			System.out.println("네 다음에 뵙겠습니다.");
			return;
		}
	}
}