package practiceProblem02;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		// 1173
		
		/*
		 * ��ȣ�� 30�� ������ ���ư��� ���� 1�� �̴�.

������ �������� �ð��� ���� �־�����.

�׷��� �� �ð��� �������� 30������ �ð��� ����Ͻÿ�.

��)

12 35  =====> 12 5

12 0 ======> 11 30

11 5 ======> 10 35
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>=0&&x<=23) {
			if(y-30<0) {System.out.println(x-1);}
			else {System.out.println(x);}
		}
			
		if (y>=0&&y<=60) {
			if(y<30) {System.out.println(y+30);}
			else {System.out.println(y-30);}
		}
			
//		 if (m<30) {
//		 h = h-1;
//		 m = m+60;
//		 }
//		 else { m = m-30; }

		

	}

}
