package chap02var;

public class VarTest {
	
	/*
	 * ���� ��� ��Ģ
	 * - Ŭ���� �̸��� �빮�ڷ� ����
	 * - �޼ҵ� �̸�, �������� �ҹ��ڷ� ����
	 * - ���Ⱑ �ִ� ���� �ܾ��� ���, ���� ��� �ٿ����� �����ܾ��� ������ �빮�ڷ� ����
	 * - ������� �̸��� ��� �빮�ڷ� �ۼ�                          // ex) PI
	 * - ������� �̸��� �������� �ܾ��� ���, '_' �� ����Ѵ�. // ex) MAX_SIZE
	 * 
	 * -PascalCase // �빮�ڷ� ����, ���� ��� �빮��
	 * -camelCase // �ҹ��ڷ� ����, ���� ��� �빮��
	 * - Ŭ���� ���� PascalCase
	 * -�޼ҵ�, �������� camelCase
	 * 
	 */
	
	public void test() {
		
		int x = 10;
		
		System.out.println(x);
	}
	
	public void test2() {
		//������ ����
		
		byte b = 17; //1byte
		short s = 1; //2byte
		int i = 10; //4byte
		long l = 999; //8byte
		
		System.out.println("byte b : " + b);
		System.out.println("Short s : "+ s);
		System.out.println("int i : " + i);
		System.out.println("long l : " + l);
		
	}
	
	public void test3() {
		
		//�Ǽ��� ����
		
		float f = 3.14f; // 4byte
		double d = 1.234; // 8byte
		
		System.out.println("float f : " + f);
		System.out.println("double d : " + d);
	}
	
	public void test4() {
	
		//���� ����
		
		boolean b = false; // 1byte
		System.out.println(b);
		
	}
		
		
	public void test5() {
		
		char ch = 'A'; //2byte , A�� �ƽ�Ű�ڵ� 65
		System.out.println((int)'A'); //65�� ���
		// syso ((char)66); = B�� ���
		
		
	}
	
	// ��ǻ�ʹ� ���ڸ� ���ڷ� ����Ѵ�.
	

	
		
	public void test6() {
		String s = "String" ;
		System.out.println(s);
	}
	
	
	//��� (==�׻� ���� ���� ������ ��)
	public void test7 () {
		final double PI = 3.14;
		// 3.14�� �̿��Ͽ� ����ϴ� ���α׷� (���� ����)
//		pi = 3.41; //����� �ٽ� ���� �Ҵ��� �� ����

	
	}
	}


