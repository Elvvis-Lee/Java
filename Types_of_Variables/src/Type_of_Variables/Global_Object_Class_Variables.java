package Type_of_Variables;

public class Global_Object_Class_Variables {
	public static void main(String[] args){
		Global global = new Global();		
		System.out.println(global.apple);		
		System.out.println(global.apple_price);
		
		System.out.println(Global.banana);
		System.out.println(Global.banana_price);
	}
}

class Global{
	String apple;		//��ü����(�ν��Ͻ�����)
	int apple_price;	//��ü����(�ν��Ͻ�����)
	
	static String banana;	//Ŭ���� ����(static����)
	static int banana_price;//Ŭ���� ����(static����)
}

// ��ü����(�ν��Ͻ�����)�� apple, apple_price�� �ݵ�� ��üȭ�� ��Ų�Ŀ�, �ν��Ͻ�Ŭ����(global).���������� ���
// Ŭ��������(static����)�� banana, banana_price�� Ŭ����(Global)��.���������� ���

