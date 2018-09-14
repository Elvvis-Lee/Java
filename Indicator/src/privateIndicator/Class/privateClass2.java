package privateIndicator.Class;

public class privateClass2 {
	public static void main(String[] args){
		//2. 같은 클래스(Inner 클래스)의 static 메소드 호출.
		privateClass2 pC2 = new privateClass2();
		
		
		
	}
	
	private static class Inner2{
		void test2(){
			System.out.println("apple");
		}
	}
}
