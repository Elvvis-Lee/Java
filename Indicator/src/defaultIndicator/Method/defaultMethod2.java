package defaultIndicator.Method;

public class defaultMethod2 {
	String apple="사과";				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana="바나나";		//전역변수, 클래스변수(static 변수)	==> Method Area 영역
	
	
	public static void main(String[] args){
		// 2. 다른 클래스 내의 인스턴스 메소드와 static 메소드 호출.
		Test test = new Test();
		test.test1();
		Test.test2();
	}
}

class Test{
	void test1(){
		defaultMethod2 dm2 = new defaultMethod2();	//다른 클래스의 변수에 접근하려면 반드시 객체화해야함.
		System.out.println(dm2.apple);
		System.out.println(defaultMethod2.banana);
	}
	
	static void test2(){
		defaultMethod2 dm2 = new defaultMethod2();
		System.out.println(dm2.apple);
		System.out.println(defaultMethod2.banana);
	}
}
