package privateIndicator.Variables;

public class privateVariables2 {
	String apple="사과";					//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	private String orange="오렌지";			//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana="바나나";			//전역변수, 클래스변수(static 변수)	==> Method Area 영역
	private static String grape="포도";	//전역변수, 클래스변수(static 변수)	==> Method Area 영역
	
	public static void main(String[] args){
		//2. 같은 클래스 안의 인스턴스 메소드와 static메소드 안에있는 private 변수 호출.
		privateVariables2 test = new privateVariables2();
		test.test1();
		privateVariables2.test2();
		
		
	}
	void test1(){
		privateVariables2 pv2 = new privateVariables2();
		System.out.println(pv2.apple);
		System.out.println(pv2.orange);
		System.out.println(privateVariables2.banana);
		System.out.println(privateVariables2.grape);
	}
	
	static void test2(){
		privateVariables2 pv2 = new privateVariables2();
		System.out.println(pv2.apple);
		System.out.println(pv2.orange);
		System.out.println(privateVariables2.banana);
		System.out.println(privateVariables2.grape);
	}
}