package main;

public class MyThread extends Thread {
	
	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.print(name + " : ");
		System.out.println("�ȳ��ϼ���");
	}

}
