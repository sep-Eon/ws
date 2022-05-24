package main;

public class Main {

	public static void main(String[] args) {
		
		
		//������ ������� 3����
		//������ ���� ��� (start)
		//run���� ȣ���ϸ� ���ο� ������ �������� ����

		String name = Thread.currentThread().getName();
		System.out.print(name + " : ");
		System.out.println(" ==== ������ ==== ");
		
		Thread t1 = new MyThread();
		t1.start(); //���ο� �����带 ����. run�� ���� �����尡 ����
		
		Thread t2 = new Thread(new MyRunner());
		//Thread Ŭ������ Run�� ���� �ٷ� ���� �Ұ���
		//Runnable�̶�� �������̽��� ��ӹ��� Runner�� Runnable���Լ� Run �޼ҵ带 �޾ұ� ������
		//Runner�� ���Ͽ� ���� �����ϴ�.
		t2.start();
		
		Thread t3 = new Thread (
				() ->{
					System.out.print(Thread.currentThread().getName() + " : ");
					System.out.println("�̰� ���ٽ� ����");
				});
		t3.start();
		
		
	}

}
