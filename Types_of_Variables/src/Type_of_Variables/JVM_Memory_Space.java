package Type_of_Variables;

public class JVM_Memory_Space {
	String apple="apple11112";			//�������� & ��ü����(�ν��Ͻ�����)			=====> Heap ������ ����.
	static int apple_price=10;		//�������� & Ŭ��������(Static ����)		=====> Method Area ������ ����.

	public static void main(String[] args){					//static �޼ҵ� 	=====> Stack ������ ����.
		JVM_Memory_Space jvm = new JVM_Memory_Space();		//�޼ҵ�� Stack�� ����Ǵµ�, ��üȭ��Ű�� ���� ���� jvm�� �޼ҵ�ȿ�������, ���������̹Ƿ� Heap�� ����ȴ�.
		System.out.println(jvm.apple);						//��ü����(�ν��Ͻ�����)�� �ݵ�� ��üȭ ������� �Ѵ�.		
		System.out.println(JVM_Memory_Space.apple_price);	//Ŭ��������(Static����)�� Ŭ���� ���� ȣ��� �ش纯���� ����� �� �ִ�.
		
	  //String banana;					// ���������� �޼ҵ� �ȿ��� ȣ���� ������ �ǹ��Ѵ�.		
	  //static int banana_price=20;		// ���������� static������ �� �� ����.
	}
}
//https://www.google.co.kr/search?q=java+memory&oq=java+memory&aqs=chrome..69i57j69i64j0l5&sourceid=chrome&ie=UTF-8
//https://www.journaldev.com/4098/java-heap-space-vs-stack-memory