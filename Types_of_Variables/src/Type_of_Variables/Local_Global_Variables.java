package Type_of_Variables;

public class Local_Global_Variables {
	String Global;	//��������
	
	public void main(String[] args){	//���� �޼ҵ�
		String Local_1;		//��������
		String Apple;		//��������
		int Apple_Price=10;	//��������
	}
//--------------------main �޼ҵ��� ���--------------------//
	
	public void test1(){				//test1 �޼ҵ�
		String Local_2;		//��������
		String Banana;		//��������
		int Banan_Price=20;	//��������
	}
//--------------------void ������ �޼ҵ�--------------------//
	
	public int test2(){					//test2 �޼ҵ�
		//String Local_3;
		//String Orange;
		int Orange_Price=30; //��������
		return Orange_Price;
	}
//--------------------return ������ �޼ҵ�--------------------//
	
}
/*
	���������� Ư���� ����(){}�ȿ� �����Ǿ�, �� ���������� ��� ������ ����.
	�׷��� ���������� ����ϱ� ���ؼ��� ������� return���� �����ش�.
*/