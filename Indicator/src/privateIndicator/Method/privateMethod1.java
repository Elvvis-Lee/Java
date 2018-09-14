package privateIndicator.Method;

public class privateMethod1 {
	public static void main(String[] args){
	//1. 같은 클래스 안의 인스턴스 메소드와 static메소드  호출.
		privateMethod1 pv1 = new privateMethod1();
		pv1.test1();
		privateMethod1.test2();
	}
	
	private void test1(){
		String apple="사과";
		System.out.println(apple);
	}
	
	private static void test2(){
		String banana="바나나";
		System.out.println(banana);
	}
}