package defaultIndicator.Method;

public class defaultMethod1 {
	String apple="사과";				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana="바나나";		//전역변수, 클래스변수(static 변수)	==> Method Area 영역
	
	
	public static void main(String[] args){
		// 1. 같은 클래스 내의 default 인스턴스 메소드와 default static 메소드 호출.
		defaultMethod1 dm1 = new defaultMethod1();
		dm1.Method1();
		defaultMethod1.Method2();
	}
	
	void Method1(){
		System.out.println(apple);
		System.out.println(banana);
	}
	
	static void Method2(){
		//System.out.println(apple);	=> apple 변수는 Heap영역에 선언되어있지만 test2 메소드는 Method Area영역에 있어서 접근을 못함. 객체화시켜주면 가능.
		System.out.println(banana);
	}
}
