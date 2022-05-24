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
		
		System.out.println("KFC에 오신걸 환영합니다.");
		//메뉴판 객체 생성
		Menu menu = new Menu();
		MenuHamburger menuham = new MenuHamburger();
		MenuDrink menudrink = new MenuDrink();
		MenuSide menuside = new MenuSide();
		
		//반복문. 여러 주문을 받기 위함
		do {
				//메뉴 선택 (대분류)
			int menuNum = menu.showMenu();
			System.out.println(menuNum);
			
			    //상세메뉴판 보여주기
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
				System.out.println("잘못 입력하셨습니다.");
				Main.finish = true;
			  }
			menu.more();
			} while(!Main.finish);
		
		
		//최종 결과 출력
		System.out.println("주문하신 메뉴는 " + Main.menuAll + "입니다.");
		System.out.println("총 가격은 : " + Main.total + "원 입니다.");
		/*
		 * switch (menuNum) {
		 * case 1 : //햄버거 메뉴판 
		 * case 2 : // 음료 메뉴판
		 * case 3 : //사이드 메뉴판
		 * default : ~~~
		 * }
		 */
	}
}
