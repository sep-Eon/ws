package practiceProblem02;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		/*1156
		 * �����̿� �����̴� ©©�̷� ���⸦ �Ͽ���.

���� Ȧ������ ���� ��� �Ǹ� �����̰� �̱�� �ǰ�, ¦������ ���� ��� �Ǹ� �����̰� �̱�� ������ ���� ���Ͽ���.

� �ڿ����� �ԷµǸ�  Ȧ���̸� "odd"�� ����ϰ�, ¦���̸� "even"�� ����Ͻÿ�.

		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x%2==0) {System.out.println("even");}
		else {System.out.println("odd");}

	}

}
