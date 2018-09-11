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
	String apple;		//객체변수(인스턴스변수)
	int apple_price;	//객체변수(인스턴스변수)
	
	static String banana;	//클래스 변수(static변수)
	static int banana_price;//클래스 변수(static변수)
}

// 객체변수(인스턴스변수)인 apple, apple_price는 반드시 객체화를 시킨후에, 인스턴스클래스(global).변수명으로 사용
// 클래스변수(static변수)인 banana, banana_price는 클래스(Global)명.변수명으로 사용

