package practiceProblem02;

import java.util.Scanner;

public class Problem10 {

	public static void main(String[] args) {
		// 1253
		
//		� �� �� a, b�� ���� �� �� �� ������ ��� ������ ������������ ����Ͻÿ�.
//
//		���� ���, a=5 , b=10�� ��� 5 6 7 8 9 10�Դϴ�.
		
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
