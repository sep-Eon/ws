package main;

public class Main {

	public static void main(String[] args) {
		
		//�̽������� ����
		
		//1. ��¹��� �̿��Ͽ� �Ʒ��� ���� ����Ͻÿ�.
		// "�ȳ�!"
		
//		System.out.println("\"�ȳ�!\"");
//		System.out.println("��\n��");
//		System.out.println("��\r��");
//		System.out.println("��\t��");
		
		
		// \== �̽������� ����
		
		//printf
		
		test();

	}
		
		//printf
		public static void test() {
			
			System.out.println("==== printf test====");
			System.out.printf("%s", "abc");
			System.out.println("");
			System.out.printf("%d", 10);
			System.out.println("");
			System.out.printf("%c", 'a');
			
		}

}
