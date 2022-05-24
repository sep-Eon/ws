package practiceProblem02;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int Q = (int)(Math.random()*50)+1; //랜덤 1~50
		
		int cnt = 0; // ?번 시도해서 맞췄습니다.
		
		System.out.println("무슨 숫자일까?");
		
		while (true) {
		int A = sc.nextInt();
		cnt++;
		
		if (Q==A) {System.out.println("정답입니다."); break;}
		else if (Q>A) {System.out.println("Up");}
		else {System.out.println("Down");}
		}
		
		System.out.println(cnt + "번 시도했습니다.");
		
	
		
		// 업다운
		
		// 컴퓨터가 숫자 하나 생각하게 하기
		
		// 컴퓨터한테 숫자 물어보기
		
		// 컴퓨터가 답변하기
		
		// 정답이면 종료하기
		
		}

	}


