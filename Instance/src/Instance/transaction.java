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
		System.out.println("�ȳ��ϼ���! ����� �����Ͻðھ��? \n 1. �����Ѵ�. \n 2. �������� �ʴ´�.");
		question1 = scanner.nextLine();
		if (question1.equals("1")) {
			System.out.println("������� : ��� � �����ϰھ��?");
			Buyer_Request_Apple = scanner.nextInt();
			System.out.println("�մ� : ��� " + Buyer_Request_Apple + "�� �ּ���.");
			seller.Apple_Transaction(Buyer_Request_Apple);
		} else {
			System.out.println("��! ������ �˰ڽ��ϴ�.");
		}
	}
}
class Apple_Seller {
	static int Seller_Money = 0; // �Ǹ����� ���
	static int Seller_Apple = 100; // �Ǹ��ڰ� ������ ��� ����
	static final int Apple_Price = 1000; // ��� ����
	public int Apple_Transaction(int Buyer_Request_Apple) {
		if (Seller_Apple > 0) {
			int num = Buyer_Request_Apple; // �����ڰ� �� ����ŭ ������� �پ��. �� �������� ������
											// Ȯ���ϱ� ���� num ���� ����
			Seller_Apple -= num; // �Ǹ��ڰ� ������ ��� ������ �����ڰ� �� ���� ���� ��� ������ŭ �پ��.
			Seller_Money += (Buyer_Request_Apple * Apple_Price); // �׸���, �Ǹ����� ����� �����ڰ� �� �� ��ŭ ����� �þ
			return Seller_Apple; // �ȸ� ��� �� ��ŭ ���� ��Ȳ�� �����ؾ���.
		} else
			return Seller_Apple;
	}
	public void Seller_Status() {
		System.out.println("�Ǹ����� ��� ���� ��Ȳ : " + Seller_Apple);
		System.out.println("�Ǹ����� ��� ��Ȳ : " + Seller_Money);
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
		System.out.println("�������� ��� ���� ��Ȳ : " + Buyer_Apple);
		System.out.println("�������� ��� ��Ȳ : " + Buyer_Money);
	}
}
class Trade_End {
	public Trade_End() {
		System.out.println("�մ� : ��.. ���� ���׿�. ������ �ðԿ�");
		return;
	}
} 