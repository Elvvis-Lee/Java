package defaultIndicator.Class;

public class defaultClass2 {
	public static void main(String[] args) {
		outClass1 outclass = new outClass1();
		outclass.method1();
		outClass1.method2();

	}
}
class outClass1{
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
