package privateIndicator.Variables;

public class privateVariables4 {
	public static void main(String[] args) {
		// 4. ���� Ŭ���� ���� main �޼ҵ� �ۿ� �ִ�  inner Ŭ���� ȣ��
		privateVariables4 pv4 = new privateVariables4();
		privateVariables4.innerClassMethodVariables1 pm1 = pv4.new innerClassMethodVariables1();
		pm1.Method1();
		
		innerClassMethodVariables2.Method6();
		innerClassMethodVariables2.Method8();
		
		
		privateVariables4.innerClassMethodVariables3 pm3 = pv4.new innerClassMethodVariables3();
		pm3.Method9();
		pm3.Method11();
		
		innerClassMethodVariables4.Method14();
		innerClassMethodVariables4.Method16();
		
		
	}	
	class innerClassMethodVariables1{	// Heap ������ �ö��.
		void Method1(){
			String apple = "���";
			System.out.println(apple);
//			private int apple_price = 1000;
//			System.out.println(apple_price);
		}
/*
		static void Method2(){			// static�� Method ����, class�� Heap �����̹Ƿ�, ȣ�� �Ұ�.
			...
		}
*/		

 		private void Method3(){			// Method Area ������ �ö��.	
			int apple_price = 1000;
			System.out.println(apple_price);
		}
		
/*	
		private static void Method4(){		// static�� Method ����, class�� Heap �����̹Ƿ�, ȣ�� �Ұ�.
			...
		}
*/
	}
	static class innerClassMethodVariables2{	//Static�� Method ������ �ö��.
		void Method5(){							
			String banana = "�ٳ���";
			System.out.println(banana);
		}
		
		static void Method6(){
			int banana_price = 2000;
			System.out.println(banana_price);
		}
		
		private void Method7(){
			String orange = "������";
			System.out.println(orange);
		}
		
		private static void Method8(){
			int orange_price =3000;
			System.out.println(orange_price);
		}
				
}

	private class innerClassMethodVariables3{	//Method Area������ �ö��.
		void Method9(){							
			String grape ="����";
			System.out.println(grape);
		}
		
/*		static void Method10(){					// static�� Method ����, class�� Heap �����̹Ƿ�, ȣ�� �Ұ�.
		
		}*/
		
		private void Method11(){
			int grape_price = 4000;
			System.out.println(grape_price);
		}
		
/*		private static void Method12(){			// static�� Method ����, class�� Heap �����̹Ƿ�, ȣ�� �Ұ�.
	
		}	*/	
}

	private static class innerClassMethodVariables4{	//Static�� Method ������ �ö��.
	void Method13(){
		String strawberry = "����";
		System.out.println(strawberry);
	}
	
	static void Method14(){
		int strawberry_price = 6000;
		System.out.println(strawberry_price);
	}
	
	private void Method15(){
		String citrus = "��";
		System.out.println(citrus);
	}
	
	private static void Method16(){
		int citrus_price = 7000;
		System.out.println(citrus_price);
	}		
}		

	
}