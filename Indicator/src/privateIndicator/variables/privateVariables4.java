package privateIndicator.variables;

public class privateVariables4 {
	public static void main(String[] args){
		//4. �ܺ� Ŭ������ �ν��Ͻ� �޼ҵ��� ���� ȣ��� static �޼ҵ��� ���� ȣ��
		Test test = new Test();		//4.1 �ܺ� Ŭ������ �ν��Ͻ� �޼ҵ��� ���� ȣ���� ��ü ���� ��
		test.test1();				//'�ܺ�Ŭ������.�޼ҵ��' �����Ѵ�.
		
		Test.test2();				//4.2 �ܺ� Ŭ������ static �޼ҵ��� ����ȣ���� '�ܺ� Ŭ������.�޼ҵ��'�����Ѵ�.
		
	}
}

class Test{
	void test1(){						//�������� �������� ���������� ����� �Ұ����ϴ�.
		String apple="���";
		System.out.println(apple);
	}

	static void test2(){				//�������� �������� ���������� ����� �Ұ����ϴ�.
		String banana="�ٳ���";
		System.out.println(banana);
	}
}
