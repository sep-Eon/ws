package game;

import java.util.Scanner;

import utill.InputUtill;

public class GameManager {
	
	public void gameStart() {
		
		System.out.println("1:업다운게임");
		System.out.println("2:메이플");
		System.out.println("3:포커");
		System.out.print(" 게임 번호 선택 ");
		
//		Scanner sc = new Scanner(System.in);
//		String gameNumStr = sc.nextLine();
//		int gameNum = Integer.parseInt(gameNumStr);
//		
		
		int gameNum = InputUtill.inputInt();
		
		switch(gameNum) {
		case 1: updownGameStart(); break;
		case 2: break;
		case 3: break;
		default : //error~
		}
	}
	
	private void updownGameStart() {
		System.out.println("1~100 사이의 숫자를 하나 고르시오");
		//컴퓨터 랜덤숫자 생성
		//업다운 비교, 결과 출력
		//입력받기
		//위를 무한반복 (맞출 때 까지)
		
		System.out.println("게임 종료");
	
	}

}
