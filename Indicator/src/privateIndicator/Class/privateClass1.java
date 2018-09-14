package privateIndicator.Class;

public class privateClass1 {
	public static void main(String[] args){
		//1. 같은 클래스(Inner 클래스)의 인스턴스 메소드 호출.
		
		privateClass1 pC1 = new privateClass1();	// 바깥클래스(privateClass1)에 대한 객체생성. 객체 : pC1	
		//1.1 바깥클래스(privateClass1) 객체명 = new 바깥클래스(privateClass1)로 바깥클래스 생성.
		
		privateClass1.Inner1 pI1 = pC1.new Inner1(); 
		//1.2 바깥클래스(privateClass1).안쪽클래스(Inner) 객체명 = 바깥클래스 객체명(pC1).new 안쪽클래스 생성자(Inner)
		pI1.test1();
		
		Ineer2 in2 = new Ineer2();				// 이너 클래스는 객체화시켜야한다.
		in2.test2();
		
	}
	
	private class Inner1{				//메모리에 안올라와서, 오려주고, 객체화 시켜줘야함
		void test1(){
			System.out.println("apple1111");
		}
	}
	
	private static class Ineer2{	//메모리에 올라와있으니 객체만 시켜ㅜㅁ
		void test2(){
			System.out.println("apple222");
		}
	}
}
