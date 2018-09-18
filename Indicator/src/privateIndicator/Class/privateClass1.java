package privateIndicator.Class;

public class privateClass1 {
	public static void main(String[] args){
		//1. 클래스 내의 클래스(Ineer 클래스) 호출.                                                                                                                                            
		privateClass1 pc = new privateClass1();
		privateClass1.privateIneer1 pi1 = pc.new privateIneer1();
		pi1.method1();
		pi1.method3();
		
		privateIneer2 pi2 = new privateIneer2();
		pi2.method5();
		privateIneer2.method6();
		pi2.method7();
		privateIneer2.method8();
		
	}
	
	class privateIneer1{			//Heap 영역
		void method1(){
			String apple="사과";
			System.out.println(apple);
		}
//		static void method2(){		//Method Area 영역
//			
//		}
		
		private void method3(){
			int apple_price=1000;
			System.out.println(apple_price);
		}
		
//		private static void method4(){	//Method Area 영역
//			
//		}
	}
	
	static class privateIneer2{		//Method Area 영역
		void method5(){
			String banana="바나나";
			System.out.println(banana);
		}
		static void method6(){
			int banana_price=2000;
			System.out.println(banana_price);
		}
		private void method7(){		
			String orange="오렌지";
			System.out.println(orange);
		}
		private static void method8(){
			int orange_price=3000;
			System.out.println(orange_price);
		}
	}
	
//	private class privateIneer3{	//private 지시자는 접근 불가.
//		
//	}
	
//	private static class privateIneer4{	//private 지시자는 접근 불가.
//		
//	}
}