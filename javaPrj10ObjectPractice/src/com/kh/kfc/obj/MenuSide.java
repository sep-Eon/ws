package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.Main.Main;

public class MenuSide {
	
Scanner sc = new Scanner(System.in);
	
	public void showMenuSide() {
		System.out.println("=====���̵�=====");
		System.out.println("1. ����Ƣ�� (3,000��) ");
		System.out.println("2. �߲���Ƣ�� (2,000��) ");
		System.out.println("3. ġ�ƽ (1,000��) ");
		
		int menuside = Integer.parseInt(sc.nextLine());
		// String => int
		
		switch(menuside) {
		case 1 : 
					Main.total += 3000; 
					Main.menuAll += " ����Ƣ��, ";
					System.out.println("����Ƣ�� (3,000��)�� �����ϼ̽��ϴ�."); break; // 1�� �޴� ����ٰ� ����ϱ�
		case 2 : 
					Main.total += 2000; 
					Main.menuAll += " �߲���Ƣ��, ";
					System.out.println("�߲���Ƣ�� (2,000��)�� �����ϼ̽��ϴ�."); break;
		case 3 : 
					Main.total += 1000; 
					Main.menuAll += " ġ�ƽ, ";
					System.out.println("ġ�ƽ (1,000)���� �����ϼ̽��ϴ�."); break;
		default : 
					System.out.println("�׷� ���̵�޴� ����");
		}
	}
}
