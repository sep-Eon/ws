package practiceProblem02;

import java.util.Scanner;

public class Problem16_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) �߿� �ϳ��� �Է��Ͻÿ�.");
		
		int i = (int)(Math.random()*3);
		int userTryCnt = 0;
		int userWinCnt = 0;
	    
		boolean isGameOver = false;
		
		while (!isGameOver) { 
			
			int a = sc.nextInt();
			++userTryCnt;
			
			if (i==0) {
				
				System.out.println("��ǻ�� : ����");
				
				if (a==0) {
					System.out.println("����� : ����");
					System.out.println("���º��Դϴ�.");
					}
				else if (a==1) {
					System.out.println("����� : ����");
					System.out.println("����� �¸�");
					userWinCnt++; 
					}
				else {
					System.out.println("����� : ��");
					System.out.println("��ǻ�� �¸�");
					}
			}
			
			if (i==1) {
				
				System.out.println("��ǻ�� : ����");
				
				if (a==0) {
					System.out.println("����� : ����");
					System.out.println("��ǻ�� �¸�");
					}
				else if (a==1) {
					System.out.println("����� : ����");
					System.out.println("���º��Դϴ�.");
					}
				else {
					System.out.println("����� : ��");
					System.out.println("����� �¸�");
					userWinCnt++; }
			}
				
			if (i==2) {
				
				System.out.println("��ǻ�� : ��");
				
				if (a==0) {
					System.out.println("����� : ����");
					System.out.println("����� �¸�");
					userWinCnt++; }
				else if (a==1) {
					System.out.println("����� : ����");
					System.out.println("��ǻ�� �¸�");}
					
			}	
				else {
					System.out.println("����� : ��");
					System.out.println("���º��Դϴ�.");}
				
				System.out.println("���� �� �Ͻðڽ��ϱ�? (1:�ٽ�, 2:����)");
				int replay = sc.nextInt();
				
				if (replay==2) {isGameOver = true;}
				
		}
			System.out.println("�����Ͻ� Ƚ���� " + userTryCnt + " ���Դϴ�.");
			System.out.println("�¸��Ͻ� Ƚ���� " + userWinCnt + " ���Դϴ�.");
	
}
}

