package privateIndicator.Class;

public class privateClass2 {
	public static void main(String[] args){
		//2. 클래스안에 선언된 private 클래스(Inner 클래스) 호출
		
		privateClass2 pC1 = new privateClass2();
		privateClass2.Inner1 I1 = pC1.new Inner1();
		I1.test1();
		
		Ineer2 I2 = new Ineer2();
		I2.test2();
	}
	
	private class Inner1{				//메모리에 안올라와서, 오려주고, 객체화 시켜줘야함
		void test1(){
			System.out.println("orange");
		}
	}
	
	private static class Ineer2{	//메모리에 올라와있으니 객체만 시켜줌
		void test2(){
			System.out.println("grape");
		}
	}
}
