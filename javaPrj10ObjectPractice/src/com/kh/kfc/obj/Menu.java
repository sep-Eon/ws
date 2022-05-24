package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.Main.Main;

public class Menu {
	
	//메뉴판 보여주기
	Scanner sc = new Scanner(System.in);
	
	MenuHamburger mh = new MenuHamburger();
	MenuDrink md = new MenuDrink();
	MenuSide ms = new MenuSide();
	

	
	public int showMenu() {
		System.out.println("======Menu=======");
		System.out.println("1. 햄버거");
		System.out.println("2. 음료");
		System.out.println("3. 사이드");
		
		int menu = Integer.parseInt(sc.nextLine());
		// String => int로 변환시켜줌
		
		switch(menu) {
		case 1 : return 1; //return하면 코드가 끝나므로, break; 필요없음
		case 2 : return 2;
		case 3 : return 3;
		default : System.out.println("메뉴 선택 중 에러 발생");
		return-1;}
	}
	
	//주문 더 받을건지 물어보기
	
	public void more() {
		System.out.println("추가 주문을 하시겠습니까? (Y/N)");
		String answer = sc.nextLine();
		
//		if (answer.equals("Y")) {
//			Main.finish = false;
//		}
//		else { Main.finish = true;}
		Main.finish = answer.equals("Y") || answer.equals("y") ? false : true; //삼항연산자
}
}