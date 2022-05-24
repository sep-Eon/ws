package com.kh.main;

import java.util.Scanner;

public class LoginMain {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("====로그인====");
		
		LoginTest lt = new LoginTest();
		
		
		System.out.println("환영합니다.");
		System.out.println("로그인과 회원가입중 선택 바랍니다.");
		System.out.println("1 : 회원가입");
		System.out.println("2 : 로그인");
		
		int num = sc.nextInt();
		sc.nextLine(); //엔터키 목적
		
		if (num==1) {
		try {
			lt.join();
		} catch (JoinException e) {
			System.out.println("회원가입 실패");
		}
		}
		else if (num==2) {
		lt.login();
		}
		else {System.out.println("실패했습니다.");
		}

	}

}
