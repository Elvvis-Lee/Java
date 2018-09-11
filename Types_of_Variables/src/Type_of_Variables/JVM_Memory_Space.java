package Type_of_Variables;

public class JVM_Memory_Space {
	String apple="apple11112";			//전역변수 & 객체변수(인스턴스변수)			=====> Heap 영역에 저장.
	static int apple_price=10;		//전역변수 & 클래스변수(Static 변수)		=====> Method Area 영역에 저장.

	public static void main(String[] args){					//static 메소드 	=====> Stack 영역에 저장.
		JVM_Memory_Space jvm = new JVM_Memory_Space();		//메소드는 Stack에 저장되는데, 객체화시키기 위해 사용된 jvm은 메소드안에있지만, 지역변수이므로 Heap에 저장된다.
		System.out.println(jvm.apple);						//객체변수(인스턴스변수)는 반드시 객체화 시켜줘야 한다.		
		System.out.println(JVM_Memory_Space.apple_price);	//클래스변수(Static변수)는 클래스 직접 호출로 해당변수를 사용할 수 있다.
		
	  //String banana;					// 지역변수는 메소드 안에서 호출한 변수를 의미한다.		
	  //static int banana_price=20;		// 지역변수는 static변수가 될 수 없다.
	}
}
//https://www.google.co.kr/search?q=java+memory&oq=java+memory&aqs=chrome..69i57j69i64j0l5&sourceid=chrome&ie=UTF-8
//https://www.journaldev.com/4098/java-heap-space-vs-stack-memory