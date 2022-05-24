package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.Main.Main;

public class MenuHamburger {
	
	//생성자 (== 기본생성자) // (접근제한자:생략가능) 클래스이름 () {}
	public MenuHamburger() {}
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenuHam() {
		System.out.println("=====햄버거=====");
		System.out.println("1. 불고기버거 (5,000원) ");
		System.out.println("2. 타워버거 (8,000원) ");
		System.out.println("3. 징거버거 (7,000원) ");
		
		int menuham = Integer.parseInt(sc.nextLine());
		// String => int
		
		switch(menuham) {
		case 1 : 
					Main.total  += 5000; 
					Main.menuAll += " 불고기버거, ";
					System.out.println("불고기버거 (5,000)원을 선택하셨습니다."); break;
		case 2 : 
					Main.total += 8000; 
					Main.menuAll += " 타워버거, ";
					System.out.println("타워버거 (8,000)원을 선택하셨습니다."); break;
		case 3 : 
					Main.total += 7000; 
					Main.menuAll += " 징거버거, ";
					System.out.println("징거버거 (7,000)원을 선택하셨습니다."); break;
		default : 
					System.out.println("그런 햄버거 없음"); 
		}
	}
}
