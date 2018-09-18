package privateIndicator.Method;

public class privateMethod1 {
	public static void main(String[] args){
	// 1. 같은클래스의 메소드 호출.
		privateMethod1 pm = new privateMethod1();
		pm.Method1();
		privateMethod1.Method2();
		pm.Method3();
		privateMethod1.Method4();
	}
	
	void Method1(){
		System.out.println("사과");
	}
	
	static void Method2(){
		System.out.println("바나나");
	}
	private void Method3(){
		System.out.println("오렌지");
	}
	private static void Method4(){
		System.out.println("포도");
	}
}