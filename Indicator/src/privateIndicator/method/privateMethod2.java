package privateIndicator.method;

public class privateMethod2 {
	public static void main(String[] args){
		//2. 외부 클래스에서의 private 메소드 호출
		
	//	Test2 test = new Test2();
	//	test.test3();				// 2.1 private 지시자는 같은 클래스 내에서만 사용이 가능하므로, private 메소드 호출 불가.
	//	Test2.test4();
	}
	

}

class Test2{
	private void test3(){
		String apple="사과";
		System.out.println(apple);
	}
	
	private static void test4(){
		String banana="바나나";
		System.out.println(banana);
	}
}
