package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.Main.Main;

public class Menu {
	
	//�޴��� �����ֱ�
	Scanner sc = new Scanner(System.in);
	
	MenuHamburger mh = new MenuHamburger();
	MenuDrink md = new MenuDrink();
	MenuSide ms = new MenuSide();
	

	
	public int showMenu() {
		System.out.println("======Menu=======");
		System.out.println("1. �ܹ���");
		System.out.println("2. ����");
		System.out.println("3. ���̵�");
		
		int menu = Integer.parseInt(sc.nextLine());
		// String => int�� ��ȯ������
		
		switch(menu) {
		case 1 : return 1; //return�ϸ� �ڵ尡 �����Ƿ�, break; �ʿ����
		case 2 : return 2;
		case 3 : return 3;
		default : System.out.println("�޴� ���� �� ���� �߻�");
		return-1;}
	}
	
	//�ֹ� �� �������� �����
	
	public void more() {
		System.out.println("�߰� �ֹ��� �Ͻðڽ��ϱ�? (Y/N)");
		String answer = sc.nextLine();
		
//		if (answer.equals("Y")) {
//			Main.finish = false;
//		}
//		else { Main.finish = true;}
		Main.finish = answer.equals("Y") || answer.equals("y") ? false : true; //���׿�����
}
}