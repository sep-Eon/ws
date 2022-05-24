package practiceProblem02;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// 1352
		
//		길이 n이 입력되면 길이가 n인 사각형을 출력하시오. 
//
//		단, 사각형은 * 모양으로 채운다.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 0; x <= n; ++x) { // x : 1~n
			for (int i = 0; i< x; ++i) { // x번 반복하며 출력
				System.out.print("*"); 
			}
			System.out.println( );
		}
		
		
//		for (int i = 0; i< 1 ; ++i) {
//			System.out.print("*"); 1번 반복
//		}
//		
//		for (int i = 0; i< 2 ; ++i) {
//			System.out.print("*"); 2번 반복
//		}
//		
//		for (int i = 0; i< 3 ; ++i) {
//			System.out.print("*"); 3번 반복
//		}


	}

}
