package com.kh.thread;

public class Main {
	
	public static final Factory factory = new Factory();

	public static void main(String[] args) {
		
//		System.out.println("==== ������ �׽�Ʈ ====");
//		
//		//10�� ī��Ʈ�ٿ� �ϴ� ���α׷���
//		
//		for(int i = 10; i>0; i--) {
//			System.out.println(i);
//			//���� ������ �����ͼ�, �� ������ 1�� ����
//			try {
//				Thread.currentThread().sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("���� �޼��� ::: " + e.getMessage()); //e�� ��� ����Ÿ���� ǥ��
//			}
//		}
//		
//		System.out.println("��~~");
		
//		test1();
		test2();
		
		
		
	}
	
		private static void test1() {
			
			System.out.println(" ==== inturrpt test ==== ");
			Thread t1 = new Thread (new MyRunner());
			t1.start();
			
			t1.interrupt();
			
		}
		
		private static void test2() {
			
			System.out.println(" ==== notify test ==== ");
			
			Thread t1 = new Thread(new RunnerMethodA());
			Thread t2 = new Thread(new RunnerMethodB());
			
			
			t1.start();
			t2.start();
		}

	

}
