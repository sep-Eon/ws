package com.kh.main;

import java.util.Scanner;

public class LoginMain {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("====�α���====");
		
		LoginTest lt = new LoginTest();
		
		
		System.out.println("ȯ���մϴ�.");
		System.out.println("�α��ΰ� ȸ�������� ���� �ٶ��ϴ�.");
		System.out.println("1 : ȸ������");
		System.out.println("2 : �α���");
		
		int num = sc.nextInt();
		sc.nextLine(); //����Ű ����
		
		if (num==1) {
		try {
			lt.join();
		} catch (JoinException e) {
			System.out.println("ȸ������ ����");
		}
		}
		else if (num==2) {
		lt.login();
		}
		else {System.out.println("�����߽��ϴ�.");
		}

	}

}
