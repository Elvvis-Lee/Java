package protectedIndicator.Variables;

public class protectedVariables1 {
	protected String apple="사과";				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	protected String orange="오렌지";		//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	protected static String banana="바나나";		//전역변수, 클래스변수(static 변수)		==> Method Area 영역
	protected static String grape="포도";//전역변수, 클래스변수(static 변수)		==> Method Area 영역
	
	public static void main(String[] args){
		//1. 같은 클래스 내의 protected변수 호출.
		protectedVariables1 pv1 = new protectedVariables1();
		System.out.println(pv1.apple);
		System.out.println(pv1.orange);
		System.out.println(banana);
		System.out.println(grape);
	}
}
