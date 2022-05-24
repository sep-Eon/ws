package main;

public class Main {

	public static void main(String[] args) {
		
		
		//쓰레드 생성방법 3가지
		//쓰레드 시작 방법 (start)
		//run으로 호출하면 새로운 쓰레드 생성되지 않음

		String name = Thread.currentThread().getName();
		System.out.print(name + " : ");
		System.out.println(" ==== 쓰레드 ==== ");
		
		Thread t1 = new MyThread();
		t1.start(); //새로운 쓰레드를 만듦. run은 메인 쓰레드가 읽음
		
		Thread t2 = new Thread(new MyRunner());
		//Thread 클래스는 Run이 없어 바로 실행 불가능
		//Runnable이라는 인터페이스를 상속받은 Runner를 Runnable에게서 Run 메소드를 받았기 때문에
		//Runner를 통하여 실행 가능하다.
		t2.start();
		
		Thread t3 = new Thread (
				() ->{
					System.out.print(Thread.currentThread().getName() + " : ");
					System.out.println("이게 람다식 ㅎㅎ");
				});
		t3.start();
		
		
	}

}
