package defaultIndicator.Class;

public class defaultClass1 {
	public static void main(String[] args){
		//1.Ŭ���� ���� Ŭ����(Ineer Ŭ����)�� �޼ҵ� ȣ��.
		defaultClass1 dc = new defaultClass1();
		defaultClass1.defaultIneer1 di1 = dc.new defaultIneer1();
		di1.method1();
//		di1.method2();		//private �����ڴ� ȣ�� �Ұ���.
		di1.method3();
//		di1.method4();		//private �����ڴ� ȣ�� �Ұ���.
		
		defaultIneer2 di2 = new defaultIneer2();
		di2.method5();
		defaultIneer2.method6();
		di2.method7();
		defaultIneer2.method8();
	}
	
	class defaultIneer1{			//Heap ����
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
	
	static class defaultIneer2{		//Method Area ����
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
}