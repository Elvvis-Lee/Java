package defaultIndicator.Variables;

public class defaultVariables4 {
	String apple="사과";				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana="바나나";		//전역변수, 클래스변수(static 변수)	==> Method Area 영역
	String orange="오렌지";
	static String grape="포도";
	
	public static void main(String[] args){
		//4. 다른클래스의 인스턴스메소드의 'default변수'와 static메소드의 'default변수' 호출  
		Test test = new Test();
		test.test1();
		Test.test2();
	}
}

class Test{
	void test1(){
		defaultVariables4 dv4 = new defaultVariables4();
		System.out.println(dv4.apple);
		System.out.println(defaultVariables4.banana);
	}
	
	static void test2(){
		defaultVariables4 dv4 = new defaultVariables4();
		System.out.println(dv4.orange);
		System.out.println(defaultVariables4.grape);
	}
}

