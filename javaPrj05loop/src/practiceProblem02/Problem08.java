package practiceProblem02;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		//1208
		
		// �� ���� ���� �Է¹ޱ�
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		//� �ﰢ������ ���
		
//		�� ���� ���̰� ���� ��� : ���ﰢ��
//		�� ���� �����̰� ���� ��� : �̵�ﰢ��
//		a2 + b2 = c2�� ��� (��Ÿ����� ����) : �����ﰢ��
//		���� ���ǿ� ���� �ʴ� �Ϲ� �ﰢ�� �� ��� : �ﰢ��
//		�ﰢ���� �ƴ� ��� : �ﰢ�� �ƴ�
		
			
 		if (x==y && y==z && x==z) {System.out.println("���ﰢ��");}
 		else if (x==y || x==z || y==z) {System.out.println("�̵ �ﰢ��");}
 		else if ((x*x) + (y*y) == (z*z)) {System.out.println("���� �ﰢ��");}
 		else if (x+y>z) {System.out.println("�ﰢ��");}
		else {System.out.println("�ﰢ�� �ƴ�");}
 		
		

	}

}
