package practice;

public class Practice {
	
	public void test() {
		System.out.println("practice start~~");
//		printHelloWorld();
//		printMyName();
//		multiple(10);
//		System.out.println(getName());
		
		System.out.println(plus (10,5));
		
		System.out.println("practice end~~");
	}
	
	//hello world��� ����ϴ� �޼ҵ� �ۼ�
	// �޼ҵ� �̸� : printHelloWorld
	
	
	public void printHelloWorld () {
		System.out.println("hello world!");
	}
	
	//printMyName
	/*
	 * �Է°� : x
	 * ��ȯ�� : x
	 * ���� ���� : ���� �̸� ���
	 */
	
	public void printMyName() {
		System.out.println("�ڻ��");
	}
	
	//�޼ҵ�� :multiple
	//�Է°� : ����
	//��ȯ�� :x
	//���೻�� : �Է¹��� ���� *2
	
	//�޼ҵ�� : getName
	//�Է°� : ����
	//��ȯ�� : �����̸�(�ɿ���)
	//���೻�� : ���� (��ȯ��)
	
	public String getName() {
		return "�ڻ��";
	}
	
	public void multiple (int x) {
		System.out.println(x*2);
	}
	
	public int plus (int x, int y) {
		System.out.println("�޼ҵ� ȣ���");
		return x+y;
	}

}
