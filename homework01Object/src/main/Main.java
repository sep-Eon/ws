package main;

import java.util.Scanner;
import machine.Machine;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===ȯ���մϴ�.===");
		System.out.println("��� ������ ������ ���� 1���Դϴ�.");
		System.out.println("1���� �Է��Ͻø� ���ԸӽŰ������� �̵��մϴ�.");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		if (menu==1) {
			System.out.println("�����Ͻ� ������ ���Ըӽ��Դϴ�.");
			System.out.println("������� �̸��� �Է��Ͻñ� �ٶ��ϴ�.");
			String userId = sc.nextLine();
			Machine mc = new Machine(userId);
		}
		else {
			System.out.println("�߸��� ���Դϴ�.");
		}
	}
}
