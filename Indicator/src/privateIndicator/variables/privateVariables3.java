package privateIndicator.variables;

public class privateVariables3 {
	public static void main(String[] args){
		//3. ���� Ŭ������ �ν��Ͻ� �޼ҵ��� ���� ȣ��� static �޼ҵ��� ���� ȣ��
		privateVariables3 pv3 = new privateVariables3();
		pv3.test1();                   	//3.1 ���� Ŭ������ �ν��Ͻ� �޼ҵ��� ���� ȣ���� '�ν��Ͻ�����(pv3).�޼ҵ��' �����Ѵ�.
		
		privateVariables3.test2();		//3.2 �ܺ� Ŭ������ static�޼ҵ��� ���� ȣ���� 'Ŭ������.�޼ҵ��' ���� �Ѵ�.
	}
	
	void test1(){						//���������� ���������� ����� �Ұ����ϴ�.
		String apple="���";
		System.out.println(apple);
	}
	
	static void test2(){				//���������� ���������� ����� �Ұ����ϴ�.
		String banana="�ٳ���";
		System.out.println(banana);
	}
}
// static�� ���� ���� �� �޼ҵ�� Ŭ������ �޸𸮿� �ö� ��, �ڵ������� ��ü�� �����ϱ� ������,
// ȣ��� ��ü�� �������� �ʾƵ� �ȴ�. 
