package privateIndicator.Method;

public class privateMethod1 {
	public static void main(String[] args){
	// 1. ����Ŭ������ �޼ҵ� ȣ��.
		privateMethod1 pm = new privateMethod1();
		pm.Method1();
		privateMethod1.Method2();
		pm.Method3();
		privateMethod1.Method4();
	}
	
	void Method1(){
		System.out.println("���");
	}
	
	static void Method2(){
		System.out.println("�ٳ���");
	}
	private void Method3(){
		System.out.println("������");
	}
	private static void Method4(){
		System.out.println("����");
	}
}