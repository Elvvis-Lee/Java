package Instance;

import java.util.Calendar;
import java.util.Scanner;
public class transactionMain {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String question1;
		
		Calendar calendar = Calendar.getInstance();
		int dayOfTheWeek = calendar.get(Calendar.DAY_OF_WEEK);

		appleSeller seller = new appleSeller(0,100, dayOfTheWeek);	// ���(0��), �Ǹ����� ��� ����(100��)�� �ʱⰪ���� �����ϰ�, ���� ������ ��(1~7)�� ������.
		System.out.println("������� : �ȳ��ϼ���! ����� �����Ͻðڽ��ϱ�?\n 1.�����Ѵ� \n 2.�������� �ʴ´�.");
		question1 = scanner.nextLine();
		if (question1.equals("1")) {
			System.out.print("������� : ��! � �����ϰھ��?");
			int requestAppleCount = scanner.nextInt();
			System.out.println("�մ� : " + requestAppleCount + "�� �ּ���.");
			seller.appleTransaction(requestAppleCount);	//appleSeller.java�� appleTransaction �޼ҵ� ȣ��.			
		} 
		else {
			System.out.println("�� ������ �˰ڽ��ϴ�.");
			return;
		}
	}
}