package Type_of_Variables;

public class Local_Global_Variables {
	String Global;	//전역변수
	
	public void main(String[] args){	//메인 메소드
		String Local_1;		//지역변수
		String Apple;		//지역변수
		int Apple_Price=10;	//지역변수
	}
//--------------------main 메소드인 경우--------------------//
	
	public void test1(){				//test1 메소드
		String Local_2;		//지역변수
		String Banana;		//지역변수
		int Banan_Price=20;	//지역변수
	}
//--------------------void 형태의 메소드--------------------//
	
	public int test2(){					//test2 메소드
		//String Local_3;
		//String Orange;
		int Orange_Price=30; //지역변수
		return Orange_Price;
	}
//--------------------return 형태의 메소드--------------------//
	
}
/*
	지역변수는 특정한 구역(){}안에 생성되어, 그 지역에서만 사용 가능한 변수.
	그래서 지역변수를 사용하기 위해서는 결과값을 return으로 돌려준다.
*/