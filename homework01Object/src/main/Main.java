package main;

import java.util.Scanner;
import machine.Machine;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("===환영합니다.===");
		System.out.println("사용 가능한 게임은 현재 1개입니다.");
		System.out.println("1번을 입력하시면 슬롯머신게임으로 이동합니다.");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		if (menu==1) {
			System.out.println("선택하신 게임은 슬롯머신입니다.");
			System.out.println("사용자의 이름을 입력하시길 바랍니다.");
			String userId = sc.nextLine();
			Machine mc = new Machine(userId);
		}
		else {
			System.out.println("잘못된 값입니다.");
		}
	}
}
