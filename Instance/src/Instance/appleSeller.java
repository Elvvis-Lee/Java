package Instance;

public class appleSeller {
	private int sellerMoney; //static ��������
	private int sellerAppleAmount;
	final int Apple_Price = 1000;
 	// �ŷ��� ���� �����Ǵ� ��������� ���� ��������� �ǹ��ϴ� ������
	public appleSeller(int money, int appleAmount) {
		this.sellerMoney = money;
		this.sellerAppleAmount = appleAmount;
		
	}
 	// ��� �ŷ�����
	public int appleTransaction(final int buyerRequestApple){
		if (sellerAppleAmount > 0) {
			sellerAppleAmount -= buyerRequestApple;
			sellerMoney += (buyerRequestApple * Apple_Price);
			this.sellerStatus(); // ���� Ŭ���� �������� �Լ�ȣ��� this �� ���.
			appleBuyer buyer = new appleBuyer(100000, 0);
			buyer.appleTransaction(sellerMoney, buyerRequestApple);
			return sellerAppleAmount;
		} else {
			return 0;
		}
	}
	
	// �Ǹ����� ���� ��ȸ
	public void sellerStatus(){
		System.out.println("���� �Ǹ��� ��� : "+this.sellerMoney);
		System.out.println("�Ǹ����� ���� ��� ���� : "+this.sellerAppleAmount);
	}
	
} 