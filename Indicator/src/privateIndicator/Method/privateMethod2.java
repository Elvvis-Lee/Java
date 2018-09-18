package privateIndicator.Method;

public class privateMethod2 {
	public static void main(String[] args){
		//2. 외부 클래스의 메소드 호출
		outClassMethod1 outclass = new outClassMethod1();
		outclass.method1();		
		outClassMethod1.method2();
//		outclass.method3();		//private 접근자는 접근 불가.
//		outclass.method4();		//private 접근자는 접근 불가.
		
	}
}

class outClassMethod1{
	void method1(){
		System.out.println("사과");
	}
	static void method2(){
		System.out.println("바나나");
	}
	private void method3(){
		System.out.println("오렌지");
	}
	private static void method4(){
		System.out.println("포도");
	}
}

/*private class outClassMethod2{		//클래스는 static 및 접근제어자 사용불가.(Ineer 클래스만 가능)
	
}*/

/*static class outClassMethod3{			//클래스는 static 및 접근제어자 사용불가.(Ineer 클래스만 가능)
	
}
*/
/*private static class outClassMethod4{	//클래스는 static 및 접근제어자 사용불가.(Ineer 클래스만 가능)
	
}*/