package practiceProblem02;

import java.util.Scanner;

public class Problem15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int Q = (int)(Math.random()*50)+1; //���� 1~50
		
		int cnt = 0; // ?�� �õ��ؼ� ������ϴ�.
		
		System.out.println("���� �����ϱ�?");
		
		while (true) {
		int A = sc.nextInt();
		cnt++;
		
		if (Q==A) {System.out.println("�����Դϴ�."); break;}
		else if (Q>A) {System.out.println("Up");}
		else {System.out.println("Down");}
		}
		
		System.out.println(cnt + "�� �õ��߽��ϴ�.");
		
	
		
		// ���ٿ�
		
		// ��ǻ�Ͱ� ���� �ϳ� �����ϰ� �ϱ�
		
		// ��ǻ������ ���� �����
		
		// ��ǻ�Ͱ� �亯�ϱ�
		
		// �����̸� �����ϱ�
		
		}

	}


