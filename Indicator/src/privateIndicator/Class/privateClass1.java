package privateIndicator.Class;

public class privateClass1 {
	public static void main(String[] args){
		//1. Ŭ���� ���� Ŭ����(Ineer Ŭ����) ȣ��.                                                                                                                                            
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
	
	class privateIneer1{			//Heap ����
		void method1(){
			String apple="���";
			System.out.println(apple);
		}
//		static void method2(){		//Method Area ����
//			
//		}
		
		private void method3(){
			int apple_price=1000;
			System.out.println(apple_price);
		}
		
//		private static void method4(){	//Method Area ����
//			
//		}
	}
	
	static class privateIneer2{		//Method Area ����
		void method5(){
			String banana="�ٳ���";
			System.out.println(banana);
		}
		static void method6(){
			int banana_price=2000;
			System.out.println(banana_price);
		}
		private void method7(){		
			String orange="������";
			System.out.println(orange);
		}
		private static void method8(){
			int orange_price=3000;
			System.out.println(orange_price);
		}
	}
	
//	private class privateIneer3{	//private �����ڴ� ���� �Ұ�.
//		
//	}
	
//	private static class privateIneer4{	//private �����ڴ� ���� �Ұ�.
//		
//	}
}