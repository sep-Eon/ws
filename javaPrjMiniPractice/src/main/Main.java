package main;

import game.GameManager;
import member.MemberController;
import menu.Menu;

public class Main {

	public static void main(String[] args) {
		System.out.println(" ==== 미니 연습 ====");
		
		Menu menu = new Menu(); //컨트롤+쉬프트+O ==> 임포트
		//중복되는 클래스?  패키지 직접 선택 가능
		
		menu.showMenu();
		String menuVal = menu.inputMenu();
		
		//1번 로직 처리 == 회원가입
		
		if(menuVal.trim().equals("1")) {
			new MemberController().memberJoin();
		}
		else if (menuVal.trim().equals("2")) {
			new GameManager().gameStart();
		}
	}

}
