package main;

public class Main {

	public static void main(String[] args) {

		System.out.println("==== ���� ó�� ====");
		
		
//		System.out.println("�ȳ��ϼ���");
//		try {
//			String str = null;
//			String strSub = str.substring(2, 5);
//			System.out.println(strSub);
//			int x = 1/0;
//			
//		}catch(ArithmeticException e) {
//			System.out.println("AE ����");
//			e.printStackTrace();
//		}catch(NullPointerException e) {
//		System.out.println("NPE �����");}
//		
//		System.out.println("���̹���");
		
		Test t = new Test();
		
		try {
			t.methodA();
		} catch (Exception e) {
			System.out.println("���� �޼ҵ忡�� Exception catch");
			if (e instanceof MyException) {
				System.out.println("��� ���� ���ܴ� MyExceptionŸ��");
			}
		}
		
//		try {
//		throw new MyException();
//		} catch(Exception e) {
//			System.out.println("���� ���� ���� ����");
//		}
		
		
//		try {
//			t.test();
//		}catch(Exception e) {
//			System.out.println("���θ޼ҵ忡�� Exception�� catch��");
//		}
		
		
	
	}

}
