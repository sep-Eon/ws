package game.main;

import java.util.Scanner;

import rcp.main.GameManagerRcp;
import updown.main.GameManagerUpDown;

public class Main {

	public static void main(String[] args) {

		

		//스캐너 Class 파일 이용하여 객체 생성 후 sc라는 변수에 할당
		Scanner sc = new Scanner(System.in);
		
		
		// 직원(게임매니저) 채용 (객체 준비 == 객체 미리 생성해놓기)
		
		GameManagerUpDown gmUpDown = new GameManagerUpDown();
		GameManagerRcp gmRcp = new GameManagerRcp();
		
		
		System.out.println("1: updown");
		System.out.println("2: rcp ");
	
	
		int input = sc.nextInt();
		
		if (input==1) {
			gmUpDown.GameStart();
		}
		
		else if(input==2) {
			gmRcp.gamestart();
		}
		else { System.out.println("오류입니다. 1,2 중 다시 입력하세요."); }

}
}
