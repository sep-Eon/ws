package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.Main.Main;

public class MenuDrink {
	
Scanner sc = new Scanner(System.in);
	
	public void showMenuDrink() {
		System.out.println("=====�����=====");
		System.out.println("1. �ݶ� (1,000��) ");
		System.out.println("2. ȯŸ (1,000��) ");
		System.out.println("3. ���� (1,000��) ");
		
		int menudrink = Integer.parseInt(sc.nextLine());
		// String => int
		
		switch(menudrink) {
		case 1 : 
					Main.total  += 1000; 
					Main.menuAll += "  �ݶ�, ";
					System.out.println("�ݶ� (1,000)���� �����ϼ̽��ϴ�."); break;
		case 2 : 
					Main.total += 1000; 
					Main.menuAll += " ȯŸ, ";
					System.out.println("ȯŸ (1,000)���� �����ϼ̽��ϴ�."); break;
		case 3 : 
					Main.total += 1000; 
					Main.menuAll += " ����, ";
					System.out.println("���� (1,000)���� �����ϼ̽��ϴ�."); break;
		default : 
					System.out.println("�׷� ���� ����");
		}
	}
}
