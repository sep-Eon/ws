package practice;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		// 1. ���� �ϳ� �����, ���� �Է¹ޱ�
		// 2. �ش� ���ڰ� �������, ��������, 0���� �Ǵ��ϱ�
		
		//int num = -231;
		//if (num>0) {System.out.println("����Դϴ�.");
		//}
		//else if (num<0) {System.out.println("�����Դϴ�.");
		//}
		//else {System.out.println("0�Դϴ�.");
		//}
		
		// ������ ������ if, 
		//else if�� ������ ��� ���� (��, �տ� if �����ؾ���)
		//else�� ����Ϸ��� ������ �������� ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x>0) {
			System.out.println("+"); 
		}
		
		else if (x<0) {
			System.out.println("-");
		}
		else { System.out.println("0"); }

		
		

	}

}
