package conditional_codeup;

import java.util.Scanner;

public class codeup_1228 {
	public static void main(String[] args) {
		
		/*
		 * �����̴� '������ �θ��� ġŲ' ���Ը� ��ϰ� �ִ�.
			ġŲ���� ��ϴ� ���� ���� ġŲ�� �԰� �Ǿ���.
			�׷��� ��� �� �����Ը� ���� 80kg�� ������ ���� ���� ��¦ �����.
			������ ����ģ���� ���� ����� ���� �Ⱦ� �ϹǷ� �����̴� ���� ���̸� �� �ȴ�.
			�����̰� ������ �ƴ��� �Ǻ��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��Ͻÿ�.");
		int x = sc.nextInt();
		System.out.println("�����Ը� �Է��Ͻÿ�.");
		int y = sc.nextInt();
		
		double ave = (x-100)*0.9;
		double result = ((y-ave)*100) / ave;
		
		if (result>20) {System.out.println(result + " �Դϴ�. ����, ���Դϴ�.");}
		else if (result>=10&&result<=20) {System.out.println(result + " �Դϴ�. ����, ��ü���Դϴ�.");}
		else if (result>0&&result<=10) {System.out.println(result + " �Դϴ�. ����, �����Դϴ�.");}

		
		
	}

}
