package privateIndicator.variables;

public class privateVariables2 {
	String apple;				//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	private String orange;		//전역변수, 객체변수(인스턴스 변수)		==> Heap 영역
	static String banana;		//전역변수, 클래스변수(static 변수)		==> Method Area 영역
	private static String grape;//전역변수, 클래스변수(static 변수)		==> Method Area 영역
	
	public static void main(String[] args){
		
	}
}

// 2. 다른 클래스의 인스턴스 메소드와 static메소드에서 private 변수 호출.
class privateTest1{							
	void test1(){										//2.1 인스턴스 메소드에서 호출
		privateVariables2 pv2 = new privateVariables2();
		System.out.println(pv2.apple);		
//		System.out.println(pv2.orange);					// ==>orange는 private 지시자이므로, 다른클래스에 호출 안됨.
		System.out.println(privateVariables2.banana);
//		System.out.println(privateVariables.grape);		// ==>grape는 private 지시자이므로, 다른클래스에 호출 안됨.
	}
	
	static void test2(){								//2.2 static 메소드에서 호출
		privateVariables2 pv2 = new privateVariables2();
		System.out.println(pv2.apple);		
//		System.out.println(pv2.orange);					// ==>orange는 private 지시자이므로, 다른클래스에 호출 안됨.
		System.out.println(privateVariables2.banana);
//		System.out.println(privateVariables.grape);		// ==>grape는 private 지시자이므로, 다른클래스에 호출 안됨.
	}
}