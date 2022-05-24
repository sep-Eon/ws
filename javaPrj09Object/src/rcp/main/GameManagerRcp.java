package rcp.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerRcp {
	
	public final String gamaname = "가위바위보";
	
	public void gamestart() {
		System.out.println("게임시작");
		
		//가위바위보 게임
		
		
		//컴퓨터 패 선택
		
		
		int comNum = new Random().nextInt(3) + 1; 
		// nextInt(3) = 0<=x<3 이므로, (0,1,2)+1 = 1,2,3
		String com = " ";
			
			switch(comNum) {
			
			case 1 : com = "가위"; break;
			case 2 : com = "바위"; break;
			case 3 : com = "보"; break;
			default : System.out.println("error!!!");
			}
			
			System.out.println("가위, 바위, 보 중 하나를 입력하시오.");
		
			//사용자 입력
			Scanner sc = new Scanner(System.in);
			String user = sc.nextLine();
			
			//컴퓨터, 사용자 패 출력
			System.out.println("com : " + com);
			System.out.println("user : " + user);
			//판단
			//문자열 끼리 비교하려면, 문자열.equals(문자열);
			if(com.equals("가위")) {
				if(user.equals("가위")) {
					System.out.println("draw");
				}
				else if (user.equals("바위")) {
					System.out.println("사용자 승");
				}
				else {System.out.println("컴퓨터 승");}
				
			if(com.equals("바위")) {
				if(user.equals("가위")) {
					System.out.println("컴퓨터 승");
				}
				else if (user.equals("바위")) {
					System.out.println("draw");
				}
				else {System.out.println("사용자 승");}
				
			if(com.equals("보자기")) {
				if(user.equals("가위")) {
					System.out.println("사용자 승");
				}
				else if (user.equals("바위")) {
					System.out.println("컴퓨터 승");
				}
				else {System.out.println("draw");}
			}
			
			
			
		}
	}
	}
}
			

