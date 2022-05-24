package practiceProblem02;

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("가위(0), 바위(1), 보(2) 중에 하나를 입력하시오.");
		
		int i = (int)(Math.random()*3);
		int userTryCnt = 0;
	    
	    
	    //스위치 역할을 하는 변수
	    //int win = 0; // 사용자가 승리하면 1로 바꿔줄거임
		boolean isUserWin = false; //boolean은 true나 false만 들어올 수 있다.
		//논리 연산자 ! = not 
		
		while (!isUserWin) { //true를 바꿈, 
			
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
					isUserWin = true;
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
					System.out.println("사용자 승리");}
				    isUserWin = true;
			}
				
			if (i==2) {
				
				System.out.println("컴퓨터 : 보");
				
				if (a==0) {
					System.out.println("사용자 : 가위");
					System.out.println("사용자 승리");
					isUserWin = true;
					}
				else if (a==1) {
					System.out.println("사용자 : 바위");
					System.out.println("컴퓨터 승리");}
					
				
				else {
					System.out.println("사용자 : 보");
					System.out.println("무승부입니다.");}
			}
			
	
			System.out.println("도전하신 횟수는 " + userTryCnt + " 번입니다. 감사합니다.");

			}
	}
}


	


			
			
			
			
	  