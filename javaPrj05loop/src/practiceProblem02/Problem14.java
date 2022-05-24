package practiceProblem02;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// 1353
		
//		n이 입력되면 다음과 같은 삼각형을 출력하시오.
//
//		예)
//
//		n 이 5 이면
//
//		*
//		**
//		***
//		****
//		*****
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		for (int i = 0; i < x ; i++) {
			for (int j = 1; j < x ; j++) {
				System.out.println("*");
			}
		}

	}

}
