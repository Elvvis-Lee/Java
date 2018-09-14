package defaultIndicator.Variables;

public class defaultVariables2 {
	String apple="사과";				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana="바나나";		//전역변수, 클래스변수(static 변수)	==> Method Area 영역
	
	public static void main(String[] args){
		
		//2. 같은 클래스안에있는 인스턴스메소드의 'default변수' 와 static메소드의 'default변수' 호출
		defaultVariables2 test = new defaultVariables2();
		test.test1();
		defaultVariables2.test2();
	}
	
	void test1(){
		defaultVariables2 dv2 = new defaultVariables2();
		System.out.println(dv2.apple);
		System.out.println(defaultVariables2.banana);
	}
	
	static void test2(){
		defaultVariables2 dv2 = new defaultVariables2();
		System.out.println(dv2.apple);
		System.out.println(defaultVariables2.banana);
	}
}



