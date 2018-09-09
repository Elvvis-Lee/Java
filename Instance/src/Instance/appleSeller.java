package Instance;

public class appleSeller {
	private int sellerMoney; //static ��������
	private int sellerAppleAmount;
	int sellerDayOfTheWeek;
	double Apple_Price=1000;
	double Discount_Rate;
	
 	// �ŷ��� ���� �����Ǵ� ��������� ���� ��������� �ǹ��ϴ� ������
	public appleSeller(int money, int appleAmount, int dayOfTheWeek) {
		this.sellerMoney = money;
		this.sellerAppleAmount = appleAmount;
		this.sellerDayOfTheWeek = dayOfTheWeek;
	}

 	// ��� �ŷ�����
	public int appleTransaction(final int buyerRequestApple){
		switch(sellerDayOfTheWeek) {
			case 1 : Discount_Rate = 0.01;			//������
			case 2 : Discount_Rate = 0.02;			//ȭ���� 
			case 3 : Discount_Rate = 0.03;			//������ 
			case 4 : Discount_Rate = 0.04;			//�����
			case 5 : Discount_Rate = 0.05;			//�ݿ���
			case 6 : Discount_Rate = 0.06;			//�����
			case 7: Discount_Rate = 0.07;			//�Ͽ���
		}
		
		if (sellerAppleAmount > 0) {
			double Apple_Final_Price = Apple_Price -(Apple_Price *Discount_Rate);
			sellerAppleAmount -= buyerRequestApple;
			sellerMoney += (buyerRequestApple * Apple_Final_Price);
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
		System.out.println("--------------------------------");
		System.out.println("���� �Ǹ��� ��� : "+this.sellerMoney+"��");
		System.out.println("�Ǹ����� ���� ��� ���� : "+this.sellerAppleAmount+"��");
	}
	
} 