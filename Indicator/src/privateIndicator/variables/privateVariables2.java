package privateIndicator.variables;

public class privateVariables2 {
	String apple;				//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	private String orange;		//��������, ��ü����(�ν��Ͻ� ����)		==> Heap ����
	static String banana;		//��������, Ŭ��������(static ����)		==> Method Area ����
	private static String grape;//��������, Ŭ��������(static ����)		==> Method Area ����
	
	public static void main(String[] args){
		
	}
}

// 2. �ٸ� Ŭ������ �ν��Ͻ� �޼ҵ�� static�޼ҵ忡�� private ���� ȣ��.
class privateTest1{							
	void test1(){										//2.1 �ν��Ͻ� �޼ҵ忡�� ȣ��
		privateVariables2 pv2 = new privateVariables2();
		System.out.println(pv2.apple);		
//		System.out.println(pv2.orange);					// ==>orange�� private �������̹Ƿ�, �ٸ�Ŭ������ ȣ�� �ȵ�.
		System.out.println(privateVariables2.banana);
//		System.out.println(privateVariables.grape);		// ==>grape�� private �������̹Ƿ�, �ٸ�Ŭ������ ȣ�� �ȵ�.
	}
	
	static void test2(){								//2.2 static �޼ҵ忡�� ȣ��
		privateVariables2 pv2 = new privateVariables2();
		System.out.println(pv2.apple);		
//		System.out.println(pv2.orange);					// ==>orange�� private �������̹Ƿ�, �ٸ�Ŭ������ ȣ�� �ȵ�.
		System.out.println(privateVariables2.banana);
//		System.out.println(privateVariables.grape);		// ==>grape�� private �������̹Ƿ�, �ٸ�Ŭ������ ȣ�� �ȵ�.
	}
}