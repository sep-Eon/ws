package practice;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		/*
		 * 2���� 29�ϱ��� �ִ� �ظ� �����̶� �Ѵ�.
		 * � �ذ� �ԷµǸ� �� �ذ� �������� �ƴ��� �Ǻ��Ͻÿ�.
		 * ���� �Ǵ� ����
		 * ����1) ��(Year)�� 4�� ����̸鼭 100�� ����� �ƴϸ� ����
		 * ����2) 400�� ����̸� ����
		 * �� �� ���� �� �ϳ��� ������ �������̴�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if ( (x%4==0 && x%100!=0) || (x%400==0) ) {System.out.println("����");}
		else {System.out.println("���� �ƴ�");}

	}

}
