package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.Main.Main;

public class MenuHamburger {
	
	//������ (== �⺻������) // (����������:��������) Ŭ�����̸� () {}
	public MenuHamburger() {}
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenuHam() {
		System.out.println("=====�ܹ���=====");
		System.out.println("1. �Ұ����� (5,000��) ");
		System.out.println("2. Ÿ������ (8,000��) ");
		System.out.println("3. ¡�Ź��� (7,000��) ");
		
		int menuham = Integer.parseInt(sc.nextLine());
		// String => int
		
		switch(menuham) {
		case 1 : 
					Main.total  += 5000; 
					Main.menuAll += " �Ұ�����, ";
					System.out.println("�Ұ����� (5,000)���� �����ϼ̽��ϴ�."); break;
		case 2 : 
					Main.total += 8000; 
					Main.menuAll += " Ÿ������, ";
					System.out.println("Ÿ������ (8,000)���� �����ϼ̽��ϴ�."); break;
		case 3 : 
					Main.total += 7000; 
					Main.menuAll += " ¡�Ź���, ";
					System.out.println("¡�Ź��� (7,000)���� �����ϼ̽��ϴ�."); break;
		default : 
					System.out.println("�׷� �ܹ��� ����"); 
		}
	}
}
