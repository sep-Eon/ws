package conditional_codeup;

import java.util.Scanner;

public class codeup_1161 {
	
	public static void main(String[] args) {
		
		/*
		 * ����� ü�� �����԰� ��������� ���̽�ũ�� ���⸦ �ϰ� �ƴ�.
			���� ������ 50m ~ 60m ���̿� ���� ���� ���Ⱑ �̱�� �ǰ�, 
			�� �ܿ� ���� �������� ü���������� �̱�� ���� ���ߴ�.
			���Ⱑ ���� ���� ��ġ�� �Է����� �־����� 50�̻� 60�����̸� "win"�� ����ϰ�, 
			�� �ܿ��� "lose"�� ����Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x>=50&&x<=60) {System.out.println("win");}
		else {System.out.println("lose");}
		
	}

}
