package ArrayEx;
public class arrayInstance {
	public static void main(String[] args) {
		
/* 
	1. 일반적인 인스턴스 배열의 선언
		String[] strArr = new String[3];
		strArr[0] = new String("Java");
		strArr[1] = new String("Flex");
		strArr[2] = new String("Ruby");
*/	
/*		
	2. 초기화 된 데이터의 수를 통해 배열의 길이 계산이 가능.
		String[] strArr = new String[] {
				"Java", "Flex", "Ruby"
		};
*/
		
//  3.이렇게 줄일 수 있음.
		
 		String[] strArr = {"Java", "Flex", "Ruby"};
		
		for(int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}