package practiceProblem02;

import java.util.Scanner;

public class Problem07 {

	public static void main(String[] args) {
		// 1203
		/*
		 * ���� �Ǵ��ϱ� ���ؼ� BMI ��ġ�� �ʿ��ϴ�.

BMI ��ġ�� �ԷµǸ� ���� �Ǵ��Ͻÿ�.

* BMI�� ���� �� ����

BMI ��ġ	�� ����
~10 ����	����
~20 ����	��ü��
20 �ʰ�	��
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x>0) {
			if(x<=10) {System.out.println("����");}
			else if (x<=20) {System.out.println("��ü��");}
			else {System.out.println("��");}
			

	}

}
	
}
