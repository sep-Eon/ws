package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		//���� �ϳ��� �Է¹ް�
		//�Է� ���� ������ Ȧ������, ¦������ �Ǵ��ϱ�.
		// Ȧ���� Ȧ����� ���, ¦���� ¦����� ���
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x%2==1) {System.out.println("Ȧ���Դϴ�.");}
		
		else if (x%2==0) {
			if (x==0) {System.out.println("0");}
			else {System.out.println("¦���Դϴ�.");}

	}

}
	
}
	


