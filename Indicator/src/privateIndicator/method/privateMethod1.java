package privateIndicator.method;

public class privateMethod1 {
	public static void main(String[] args){
	//1. ���� Ŭ���������� private �޼ҵ� ȣ��
		privateMethod1 pv1 = new privateMethod1();
		pv1.test1();
		privateMethod1.test2();
	}
	
	private void test1(){
		String apple="���";
		System.out.println(apple);
	}
	
	private static void test2(){
		String banana="�ٳ���";
		System.out.println(banana);
	}
}