package privateIndicator.method;

public class privateMethod2 {
	public static void main(String[] args){
		//2. �ܺ� Ŭ���������� private �޼ҵ� ȣ��
		
	//	Test2 test = new Test2();
	//	test.test3();				// 2.1 private �����ڴ� ���� Ŭ���� �������� ����� �����ϹǷ�, private �޼ҵ� ȣ�� �Ұ�.
	//	Test2.test4();
	}
	

}

class Test2{
	private void test3(){
		String apple="���";
		System.out.println(apple);
	}
	
	private static void test4(){
		String banana="�ٳ���";
		System.out.println(banana);
	}
}
