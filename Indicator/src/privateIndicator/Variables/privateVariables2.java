package privateIndicator.Variables;

public class privateVariables2 {
	public static void main(String[] args){
		//2. ���� Ŭ�������� �ν��Ͻ��޼ҵ�, static�޼ҵ�, private �ν��Ͻ��޼ҵ�, private static �޼ҵ��� ���� ȣ��
		
		privateVariables2 pv2 = new privateVariables2();
		pv2.privateMethodVariables1();
		privateVariables2.privateMethodVariables2();
		pv2.privateMethodVariables3();
		privateVariables2.privateMethodVariables4();	
	}

	void privateMethodVariables1(){
		String apple = "���";
		System.out.println(apple);
//		private int apple_price = 1000;		// �޼ҵ� �ȿ����� ���������� ���Ұ�
//		System.out.println(apple_price);
	}
	
	static void privateMethodVariables2(){
		String banana="�ٳ���";
		System.out.println(banana);
//		private int banana_price = 2000;	// �޼ҵ� �ȿ����� ���������� ���Ұ�
//		System.out.println(banana_price);
	}
	
	private void privateMethodVariables3(){
		String orange = "������";
		System.out.println(orange);
//		private int orange_price = 3000;	// �޼ҵ� �ȿ����� ���������� ���Ұ�
//		System.out.println(orange_price);
	}
	
	private static void privateMethodVariables4(){
		String grape = "����";
		System.out.println(grape);
//		private int grape_price = 4000;		// �޼ҵ� �ȿ����� ���������� ���Ұ�
//		System.out.println(grape_price);
	}
}
 
