package defaultIndicator.Class;

public class defaultClass2 {
	public static void main(String[] args) {
		outClass1 outclass = new outClass1();
		outclass.method1();
		outClass1.method2();

	}
}
class outClass1{
	void method1(){
		System.out.println("���");
	}
	static void method2(){
		System.out.println("�ٳ���");
	}
}
/*static class outClassMethod3{			//Ŭ������ static �� ���������� ���Ұ�.(Ineer Ŭ������ ����)
	
}
*/
