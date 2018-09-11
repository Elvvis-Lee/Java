package privateIndicator.variables;

public class privateVariables3 {
	public static void main(String[] args){
		//3. 내부 클래스의 인스턴스 메소드의 변수 호출과 static 메소드의 변수 호출
		privateVariables3 pv3 = new privateVariables3();
		pv3.test1();                   	//3.1 내부 클래스의 인스턴스 메소드의 변수 호출은 '인스턴스변수(pv3).메소드명' 으로한다.
		
		privateVariables3.test2();		//3.2 외부 클래스의 static메소드의 변수 호출은 '클래스명.메소드명' 으로 한다.
	}
	
	void test1(){						//지역변수는 접근제한자 사용이 불가능하다.
		String apple="사과";
		System.out.println(apple);
	}
	
	static void test2(){				//지역변수는 접근제한자 사용이 불가능하다.
		String banana="바나나";
		System.out.println(banana);
	}
}
// static이 붙은 변수 및 메소드는 클래스가 메모리에 올라갈 때, 자동적으로 객체를 생성하기 때문에,
// 호출시 객체를 생성하지 않아도 된다. 
