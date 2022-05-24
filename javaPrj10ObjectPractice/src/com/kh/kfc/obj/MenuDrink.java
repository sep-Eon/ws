package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.Main.Main;

public class MenuDrink {
	
Scanner sc = new Scanner(System.in);
	
	public void showMenuDrink() {
		System.out.println("=====음료수=====");
		System.out.println("1. 콜라 (1,000원) ");
		System.out.println("2. 환타 (1,000원) ");
		System.out.println("3. 우유 (1,000원) ");
		
		int menudrink = Integer.parseInt(sc.nextLine());
		// String => int
		
		switch(menudrink) {
		case 1 : 
					Main.total  += 1000; 
					Main.menuAll += "  콜라, ";
					System.out.println("콜라 (1,000)원을 선택하셨습니다."); break;
		case 2 : 
					Main.total += 1000; 
					Main.menuAll += " 환타, ";
					System.out.println("환타 (1,000)원을 선택하셨습니다."); break;
		case 3 : 
					Main.total += 1000; 
					Main.menuAll += " 우유, ";
					System.out.println("우유 (1,000)원을 선택하셨습니다."); break;
		default : 
					System.out.println("그런 음료 없음");
		}
	}
}
