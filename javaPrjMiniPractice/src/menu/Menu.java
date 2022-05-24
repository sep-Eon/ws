package menu;

import java.util.Scanner;

public class Menu {
	
	//메소드 == 동작이므로 작성 시 동사 형태로 작성
	
	//메뉴 보여주는 메소드
	public void showMenu() {		
	
	System.out.println("1. 회원가입");
	System.out.println("2. 업다운 게임");
	System.out.println("3. ??");
	System.out.println("4. ???");
	System.out.println("5. ????");
		
		
		
	}
	
	//메뉴 선택 입력 받기
	
	public String inputMenu() {
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}
	


}
