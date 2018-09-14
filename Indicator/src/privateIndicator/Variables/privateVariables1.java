package privateIndicator.Variables;

public class privateVariables1 {
	String apple;				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	private String orange;		//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana;		//전역변수, 클래스변수(static 변수)		==> Method Area 영역
	private static String grape;//전역변수, 클래스변수(static 변수)		==> Method Area 영역
	
	public static void main(String[] args){
		//1. 같은 클래스안에서 private 변수호출.  ==> private 변수는 같은 클래스 내에서 호출이 잘됨.
		privateVariables1 pv = new privateVariables1();	
		System.out.println(pv.apple);				//1.1 인스턴스 변수 호출
		System.out.println(pv.orange);				//1.1 인스턴스 변수 호출
		
		System.out.println(privateVariables1.banana);//1.2 static 변수 호출
		System.out.println(privateVariables1.grape); //1.2 static 변수 호출
	}
}