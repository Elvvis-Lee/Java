package defaultIndicator.Variables;

public class defaultVariables1 {
	String apple="사과";				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana="바나나";	//전역변수, 클래스변수(static 변수)	==> Method Area 영역
	
	public static void main(String[] args){
		//1. 같은클래스에서 default 변수 호출.
		defaultVariables1 dv1 = new defaultVariables1();
		System.out.println(dv1.apple);
		System.out.println(defaultVariables1.banana);
	}
}