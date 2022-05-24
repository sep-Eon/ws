package practiceProblem02;

import java.util.Scanner;

public class Problem16_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 중에 하나를 입력하시오.");
		
		int i = (int)(Math.random()*3);
		int userTryCnt = 0;
		int userWinCnt = 0;
	    
		boolean isGameOver = false;
		
		while (!isGameOver) { 
			
			int a = sc.nextInt();
			++userTryCnt;
			
			if (i==0) {
				
				System.out.println("컴퓨터 : 가위");
				
				if (a==0) {
					System.out.println("사용자 : 가위");
					System.out.println("무승부입니다.");
					}
				else if (a==1) {
					System.out.println("사용자 : 바위");
					System.out.println("사용자 승리");
					userWinCnt++; 
					}
				else {
					System.out.println("사용자 : 보");
					System.out.println("컴퓨터 승리");
					}
			}
			
			if (i==1) {
				
				System.out.println("컴퓨터 : 바위");
				
				if (a==0) {
					System.out.println("사용자 : 가위");
					System.out.println("컴퓨터 승리");
					}
				else if (a==1) {
					System.out.println("사용자 : 바위");
					System.out.println("무승부입니다.");
					}
				else {
					System.out.println("사용자 : 보");
					System.out.println("사용자 승리");
					userWinCnt++; }
			}
				
			if (i==2) {
				
				System.out.println("컴퓨터 : 보");
				
				if (a==0) {
					System.out.println("사용자 : 가위");
					System.out.println("사용자 승리");
					userWinCnt++; }
				else if (a==1) {
					System.out.println("사용자 : 바위");
					System.out.println("컴퓨터 승리");}
					
			}	
				else {
					System.out.println("사용자 : 보");
					System.out.println("무승부입니다.");}
				
				System.out.println("한판 더 하시겠습니까? (1:다시, 2:종료)");
				int replay = sc.nextInt();
				
				if (replay==2) {isGameOver = true;}
				
		}
			System.out.println("도전하신 횟수는 " + userTryCnt + " 번입니다.");
			System.out.println("승리하신 횟수는 " + userWinCnt + " 번입니다.");
	
}
}

