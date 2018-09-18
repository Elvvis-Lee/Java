package privateIndicator.Variables;

public class privateVariables5 {
	public static void main(String[] args){
		
		outClass1 outclass = new outClass1();
		outclass.Method1();
		outclass.Method2();
//		outclass.Method3();		// private 지시자는 접근불가
//		outclass.Method4();		// private 지시자는 접근불가.
	}
}


	class outClass1{
		void Method1(){
			String apple="사과";
			System.out.println(apple);
		}
		
		static void Method2(){
			int apple_price=1000;
			System.out.println(apple_price);
		}
		
		private void Method3(){
			String banana="바나나";
			System.out.println(banana);	
		}
		
		private static void Method4(){
			int banana_price=2000;
			System.out.println(banana_price);	
		}
	}
	
/*	static class outClass2{			//클래스는 static 및 접근제어자 사용불가.(Ineer 클래스만 가능)
		...
	}
*/
	
/*	private class outClass3{		//클래스는 static 및 접근제어자 사용불가.(Ineer 클래스만 가능)
		...
	}
*/	
/*	private static class outClass4{	//클래스는 static 및 접근제어자 사용불가.(Ineer 클래스만 가능)
		...
	}
*/