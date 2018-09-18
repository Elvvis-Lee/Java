package defaultIndicator.Class;

public class defaultClass1 {
	public static void main(String[] args){
		//1.클래스 내의 클래스(Ineer 클래스)의 메소드 호출.
		defaultClass1 dc = new defaultClass1();
		defaultClass1.defaultIneer1 di1 = dc.new defaultIneer1();
		di1.method1();
//		di1.method2();		//private 지시자는 호출 불가능.
		di1.method3();
//		di1.method4();		//private 지시자는 호출 불가능.
		
		defaultIneer2 di2 = new defaultIneer2();
		di2.method5();
		defaultIneer2.method6();
		di2.method7();
		defaultIneer2.method8();
	}
	
	class defaultIneer1{			//Heap 영역
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
	
	static class defaultIneer2{		//Method Area 영역
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
}