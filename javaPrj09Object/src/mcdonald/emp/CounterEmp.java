package mcdonald.emp;

import java.util.Scanner;

public class CounterEmp {
	
	Scanner sc = new Scanner(System.in);
	
	public String name;
	int money;
	
	//�ֹ��ޱ�
	
	public String order() {
		System.out.println("�ֹ� �����Կ�");
		//�Է¹ޱ� (�ܹ��� �̸�)
		
		String ham = this.sc.nextLine();
		System.out.println(ham +" �ֹ� �޾ҽ��ϴ�." );
		return ham;
	}
	
	public void calc() {
		System.out.println("����ҰԿ�");
		
		String price = this.sc.nextLine();
		System.out.println(price + "�� �޾ҽ��ϴ�.");
		
		//��������� �� �ޱ� (���ڿ��� �Է¹ޱ�)
		//�� �޾ҽ��ϴ�. ����ϱ�
	}

}
