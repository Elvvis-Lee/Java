package ArrayEx;
public class arrayInstance {
	public static void main(String[] args) {
		
/* 
	1. �Ϲ����� �ν��Ͻ� �迭�� ����
		String[] strArr = new String[3];
		strArr[0] = new String("Java");
		strArr[1] = new String("Flex");
		strArr[2] = new String("Ruby");
*/	
/*		
	2. �ʱ�ȭ �� �������� ���� ���� �迭�� ���� ����� ����.
		String[] strArr = new String[] {
				"Java", "Flex", "Ruby"
		};
*/
		
//  3.�̷��� ���� �� ����.
		
 		String[] strArr = {"Java", "Flex", "Ruby"};
		
		for(int i = 0; i<strArr.length; i++) {
			System.out.println(strArr[i]);
		}
	}
}