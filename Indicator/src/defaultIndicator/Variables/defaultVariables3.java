package defaultIndicator.Variables;

public class defaultVariables3 {
	String apple="사과";				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana="바나나";		//전역변수, 클래스변수(static 변수)	==> Method Area 영역
	
	public static void main(String[] args){
		//3. 다른클래스 안에있는 'default 변수'만 호출
		Test1 test1 = new Test1();
		System.out.println(test1.apple_price);
		System.out.println(Test1.banana_price);
	}
}
class Test1{
	int apple_price=1000;
	static int banana_price=1500;
}


