package practiceProblem02;

import java.util.Scanner;

public class Problem14 {

	public static void main(String[] args) {
		// 1353
		
//		n�� �ԷµǸ� ������ ���� �ﰢ���� ����Ͻÿ�.
//
//		��)
//
//		n �� 5 �̸�
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
