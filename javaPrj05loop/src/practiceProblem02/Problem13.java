package practiceProblem02;

import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		// 1352
		
//		���� n�� �ԷµǸ� ���̰� n�� �簢���� ����Ͻÿ�. 
//
//		��, �簢���� * ������� ä���.
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x = 0; x <= n; ++x) { // x : 1~n
			for (int i = 0; i< x; ++i) { // x�� �ݺ��ϸ� ���
				System.out.print("*"); 
			}
			System.out.println( );
		}
		
		
//		for (int i = 0; i< 1 ; ++i) {
//			System.out.print("*"); 1�� �ݺ�
//		}
//		
//		for (int i = 0; i< 2 ; ++i) {
//			System.out.print("*"); 2�� �ݺ�
//		}
//		
//		for (int i = 0; i< 3 ; ++i) {
//			System.out.print("*"); 3�� �ݺ�
//		}


	}

}
