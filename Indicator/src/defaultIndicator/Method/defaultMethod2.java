package defaultIndicator.Method;

public class defaultMethod2 {
	public static void main(String[] args){
		//2. 외부 클래스의 메소드 호출
		outClassMethod1 outclass = new outClassMethod1();
		outclass.method1();
		outClassMethod1.method2();
	}
}


class outClassMethod1{
	void method1(){
		System.out.println("사과");
	}
	static void method2(){
		System.out.println("바나나");
	}
}
/*static class outClassMethod3{			//클래스는 static 및 접근제어자 사용불가.(Ineer 클래스만 가능)
	
}
*/
