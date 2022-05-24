package practiceProblem02;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// 1351
		
//		시작단과 마지막 단을 입력하면
//
//		그 구간의 구구단을 출력하는 프로그램을 작성하시오.
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for (int dan = a; dan<=b; ++dan) {
			   for (int i = 1; i <=9; ++i) {
					  System.out.println (dan + "*" + i + " = " + dan*i);
				 }
		}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		
//		if (x>=1 && y>= 1 && x<=9 && y<=9) {
//			
//			for (int i = 0; i<=9; i++) {
//				System.out.println(x + "*" + i + "=" + (x*i));
//			}
//			for (int a = 0; a<=9; a++) {
//				System.out.println(y + "*" + a + "=" + (y*a));
//			}
//			
//		}
//		else { System.out.println("1~9 사이의 숫자만 가능합니다."); }
		
		
	
		
		

	}

}
