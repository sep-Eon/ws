package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.Main.Main;

public class MenuSide {
	
Scanner sc = new Scanner(System.in);
	
	public void showMenuSide() {
		System.out.println("=====사이드=====");
		System.out.println("1. 감자튀김 (3,000원) ");
		System.out.println("2. 닭껍질튀김 (2,000원) ");
		System.out.println("3. 치즈스틱 (1,000원) ");
		
		int menuside = Integer.parseInt(sc.nextLine());
		// String => int
		
		switch(menuside) {
		case 1 : 
					Main.total += 3000; 
					Main.menuAll += " 감자튀김, ";
					System.out.println("감자튀김 (3,000원)을 선택하셨습니다."); break; // 1번 메뉴 골랐다고 기억하기
		case 2 : 
					Main.total += 2000; 
					Main.menuAll += " 닭껍질튀김, ";
					System.out.println("닭껍질튀김 (2,000원)을 선택하셨습니다."); break;
		case 3 : 
					Main.total += 1000; 
					Main.menuAll += " 치즈스틱, ";
					System.out.println("치즈스틱 (1,000)원을 선택하셨습니다."); break;
		default : 
					System.out.println("그런 사이드메뉴 없음");
		}
	}
}
