package defaultIndicator.Variables;

public class defaultVariables2 {
	public static void main(String[] args){
		//2. ���� Ŭ��������  default �ν��Ͻ��޼ҵ�, default static �޼ҵ��� ���� ȣ��
		defaultVariables2 dv2 = new defaultVariables2();
		dv2.defaultMethodVariables1();
		defaultVariables2.defaultMethodVariables2();
	}
	
	void defaultMethodVariables1(){
		String apple = "���";
		System.out.println(apple);
	}
	
	static void defaultMethodVariables2(){
		int apple_price=1000;
		System.out.println(apple_price);
	}
}



