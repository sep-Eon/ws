package practiceProblem02;

import java.util.Scanner;

public class Problem12 {

	public static void main(String[] args) {
		// 1351
		
//		���۴ܰ� ������ ���� �Է��ϸ�
//
//		�� ������ �������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		
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
//		else { System.out.println("1~9 ������ ���ڸ� �����մϴ�."); }
		
		
	
		
		

	}

}
