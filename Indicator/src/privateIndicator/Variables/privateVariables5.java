package privateIndicator.Variables;

public class privateVariables5 {
	public static void main(String[] args){
		
		outClass1 outclass = new outClass1();
		outclass.Method1();
		outclass.Method2();
//		outclass.Method3();		// private �����ڴ� ���ٺҰ�
//		outclass.Method4();		// private �����ڴ� ���ٺҰ�.
	}
}


	class outClass1{
		void Method1(){
			String apple="���";
			System.out.println(apple);
		}
		
		static void Method2(){
			int apple_price=1000;
			System.out.println(apple_price);
		}
		
		private void Method3(){
			String banana="�ٳ���";
			System.out.println(banana);	
		}
		
		private static void Method4(){
			int banana_price=2000;
			System.out.println(banana_price);	
		}
	}
	
/*	static class outClass2{			//Ŭ������ static �� ���������� ���Ұ�.(Ineer Ŭ������ ����)
		...
	}
*/
	
/*	private class outClass3{		//Ŭ������ static �� ���������� ���Ұ�.(Ineer Ŭ������ ����)
		...
	}
*/	
/*	private static class outClass4{	//Ŭ������ static �� ���������� ���Ұ�.(Ineer Ŭ������ ����)
		...
	}
*/