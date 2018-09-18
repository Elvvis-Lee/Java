package privateIndicator.Variables;

public class privateVariables2 {
	public static void main(String[] args){
		//2. 같은 클래스안의 인스턴스메소드, static메소드, private 인스턴스메소드, private static 메소드의 변수 호출
		
		privateVariables2 pv2 = new privateVariables2();
		pv2.privateMethodVariables1();
		privateVariables2.privateMethodVariables2();
		pv2.privateMethodVariables3();
		privateVariables2.privateMethodVariables4();	
	}

	void privateMethodVariables1(){
		String apple = "사과";
		System.out.println(apple);
//		private int apple_price = 1000;		// 메소드 안에서는 접근제어자 사용불가
//		System.out.println(apple_price);
	}
	
	static void privateMethodVariables2(){
		String banana="바나나";
		System.out.println(banana);
//		private int banana_price = 2000;	// 메소드 안에서는 접근제어자 사용불가
//		System.out.println(banana_price);
	}
	
	private void privateMethodVariables3(){
		String orange = "오렌지";
		System.out.println(orange);
//		private int orange_price = 3000;	// 메소드 안에서는 접근제어자 사용불가
//		System.out.println(orange_price);
	}
	
	private static void privateMethodVariables4(){
		String grape = "포도";
		System.out.println(grape);
//		private int grape_price = 4000;		// 메소드 안에서는 접근제어자 사용불가
//		System.out.println(grape_price);
	}
}
 
