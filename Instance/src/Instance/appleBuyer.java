package Instance;

public class appleBuyer {
	private int buyerMoney;
	private int buyerAppleAmount;
	
	// �ŷ��� ���� �����Ǵ� �մ��� ���� ��������� �ǹ��ϴ� ������
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
		System.out.println("���� �մ� ��� : "+this.buyerMoney+"��");
		System.out.println("�մ��� ������ ��� ���� : "+this.buyerAppleAmount+"��");
	}
}