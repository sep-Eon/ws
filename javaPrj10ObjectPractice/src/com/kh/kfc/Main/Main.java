package com.kh.kfc.Main;

import com.kh.kfc.obj.Menu;
import com.kh.kfc.obj.MenuDrink;
import com.kh.kfc.obj.MenuHamburger;
import com.kh.kfc.obj.MenuSide;
public class Main {

	public static int total;
	public static String menuAll = "";
	public static boolean finish = false;
	
	public static void main(String[] args) {
		
		System.out.println("KFC�� ���Ű� ȯ���մϴ�.");
		//�޴��� ��ü ����
		Menu menu = new Menu();
		MenuHamburger menuham = new MenuHamburger();
		MenuDrink menudrink = new MenuDrink();
		MenuSide menuside = new MenuSide();
		
		//�ݺ���. ���� �ֹ��� �ޱ� ����
		do {
				//�޴� ���� (��з�)
			int menuNum = menu.showMenu();
			System.out.println(menuNum);
			
			    //�󼼸޴��� �����ֱ�
			if (menuNum==1) {
				menuham.showMenuHam();
			}
			else if (menuNum==2) {
				menudrink.showMenuDrink();
			}
			else if (menuNum==3) {
				menuside.showMenuSide();
			}
			else {
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				Main.finish = true;
			  }
			menu.more();
			} while(!Main.finish);
		
		
		//���� ��� ���
		System.out.println("�ֹ��Ͻ� �޴��� " + Main.menuAll + "�Դϴ�.");
		System.out.println("�� ������ : " + Main.total + "�� �Դϴ�.");
		/*
		 * switch (menuNum) {
		 * case 1 : //�ܹ��� �޴��� 
		 * case 2 : // ���� �޴���
		 * case 3 : //���̵� �޴���
		 * default : ~~~
		 * }
		 */
	}
}
