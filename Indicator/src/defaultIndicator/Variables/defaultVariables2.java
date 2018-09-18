package defaultIndicator.Variables;

public class defaultVariables2 {
	public static void main(String[] args){
		//2. 같은 클래스안의  default 인스턴스메소드, default static 메소드의 변수 호출
		defaultVariables2 dv2 = new defaultVariables2();
		dv2.defaultMethodVariables1();
		defaultVariables2.defaultMethodVariables2();
	}
	
	void defaultMethodVariables1(){
		String apple = "사과";
		System.out.println(apple);
	}
	
	static void defaultMethodVariables2(){
		int apple_price=1000;
		System.out.println(apple_price);
	}
}



