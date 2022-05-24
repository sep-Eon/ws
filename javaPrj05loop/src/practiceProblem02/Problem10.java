package practiceProblem02;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// 1253
		
//		어떤 두 수 a, b가 있을 때 두 수 사이의 모든 정수를 오름차순으로 출력하시오.
//
//		예를 들어, a=5 , b=10일 경우 5 6 7 8 9 10입니다.
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x<y) {
			for ( ; x<=y ; x++) {
				System.out.print(x + " ");
				
			}
		}
		else if (y<x) {
			for ( ; x>=y ; y++) {
				System.out.print(y + " ");
				
			}
		}
	
		
		

	}

}
