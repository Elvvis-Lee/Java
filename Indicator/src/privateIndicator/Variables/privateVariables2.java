package privateIndicator.Variables;

public class privateVariables2 {
	String apple="���";					//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	private String orange="������";			//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana="�ٳ���";			//��������, Ŭ��������(static ����)	==> Method Area ����
	private static String grape="����";	//��������, Ŭ��������(static ����)	==> Method Area ����
	
	public static void main(String[] args){
		//2. ���� Ŭ���� ���� �ν��Ͻ� �޼ҵ�� static�޼ҵ� �ȿ��ִ� private ���� ȣ��.
		privateVariables2 test = new privateVariables2();
		test.test1();
		privateVariables2.test2();
		
		
	}
	void test1(){
		privateVariables2 pv2 = new privateVariables2();
		System.out.println(pv2.apple);
		System.out.println(pv2.orange);
		System.out.println(privateVariables2.banana);
		System.out.println(privateVariables2.grape);
	}
	
	static void test2(){
		privateVariables2 pv2 = new privateVariables2();
		System.out.println(pv2.apple);
		System.out.println(pv2.orange);
		System.out.println(privateVariables2.banana);
		System.out.println(privateVariables2.grape);
	}
}