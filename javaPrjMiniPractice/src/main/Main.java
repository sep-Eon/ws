package main;

import game.GameManager;
import member.MemberController;
import menu.Menu;

public class Main {

	public static void main(String[] args) {
		System.out.println(" ==== �̴� ���� ====");
		
		Menu menu = new Menu(); //��Ʈ��+����Ʈ+O ==> ����Ʈ
		//�ߺ��Ǵ� Ŭ����?  ��Ű�� ���� ���� ����
		
		menu.showMenu();
		String menuVal = menu.inputMenu();
		
		//1�� ���� ó�� == ȸ������
		
		if(menuVal.trim().equals("1")) {
			new MemberController().memberJoin();
		}
		else if (menuVal.trim().equals("2")) {
			new GameManager().gameStart();
		}
	}

}
