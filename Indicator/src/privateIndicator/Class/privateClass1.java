package privateIndicator.Class;

public class privateClass1 {
	public static void main(String[] args){
		//1. ���� Ŭ����(Inner Ŭ����)�� �ν��Ͻ� �޼ҵ� ȣ��.
		
		privateClass1 pC1 = new privateClass1();	// �ٱ�Ŭ����(privateClass1)�� ���� ��ü����. ��ü : pC1	
		//1.1 �ٱ�Ŭ����(privateClass1) ��ü�� = new �ٱ�Ŭ����(privateClass1)�� �ٱ�Ŭ���� ����.
		
		privateClass1.Inner1 pI1 = pC1.new Inner1(); 
		//1.2 �ٱ�Ŭ����(privateClass1).����Ŭ����(Inner) ��ü�� = �ٱ�Ŭ���� ��ü��(pC1).new ����Ŭ���� ������(Inner)
		pI1.test1();
		
		Ineer2 in2 = new Ineer2();				// �̳� Ŭ������ ��üȭ���Ѿ��Ѵ�.
		in2.test2();
		
	}
	
	private class Inner1{				//�޸𸮿� �ȿö�ͼ�, �����ְ�, ��üȭ ���������
		void test1(){
			System.out.println("apple1111");
		}
	}
	
	private static class Ineer2{	//�޸𸮿� �ö�������� ��ü�� ���Ѥ̤�
		void test2(){
			System.out.println("apple222");
		}
	}
}
