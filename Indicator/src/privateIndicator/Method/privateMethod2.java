package privateIndicator.Method;

public class privateMethod2 {
	public static void main(String[] args){
		//2. �ܺ� Ŭ������ �޼ҵ� ȣ��
		outClassMethod1 outclass = new outClassMethod1();
		outclass.method1();		
		outClassMethod1.method2();
//		outclass.method3();		//private �����ڴ� ���� �Ұ�.
//		outclass.method4();		//private �����ڴ� ���� �Ұ�.
		
	}
}

class outClassMethod1{
	void method1(){
		System.out.println("���");
	}
	static void method2(){
		System.out.println("�ٳ���");
	}
	private void method3(){
		System.out.println("������");
	}
	private static void method4(){
		System.out.println("����");
	}
}

/*private class outClassMethod2{		//Ŭ������ static �� ���������� ���Ұ�.(Ineer Ŭ������ ����)
	
}*/

/*static class outClassMethod3{			//Ŭ������ static �� ���������� ���Ұ�.(Ineer Ŭ������ ����)
	
}
*/
/*private static class outClassMethod4{	//Ŭ������ static �� ���������� ���Ұ�.(Ineer Ŭ������ ����)
	
}*/