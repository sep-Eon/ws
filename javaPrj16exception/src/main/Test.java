package main;

public class Test {
	
	public void test() throws Exception {
		
		//���ܸ� ���� ���� �߻���Ű��
		
//		try {
//			throw new Exception(); //������. Exception ��ü��
//		}catch(Exception e) {
//			System.out.println("���� ����");
//		}
		
		throw new Exception();
			
	}
	
	public void methodA() throws Exception {
		System.out.println("methodA ȣ���");
		try {
			methodB();
		}catch(Exception e) {
			throw new MyException();
		}
		System.out.println("methodA ����");
	}
	
	public void methodB() throws Exception {
		System.out.println("methodB ȣ���");
		methodC();
		System.out.println("methodB ����...");
	}
	
	public void methodC() throws Exception {
		System.out.println("methodC ȣ���");
		int x = 1/0;
		System.out.println("methodC ����...");
		
	}

}
