package practice;

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		// ������ �Է� �ް�, 1���� �Է¹��� �� ���� ����ϴ� ���α׷��� ���弼��.
		// ��, ¦���� ������� �ʴ´�.
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int x = 1; x<=input; x=x+2) { //�����Ŀ��� +1�� �ƴ�, +2��� �Ἥ �ذ� ����
			// if�� �̿��ؼ� Ȧ���� ����ϰ�
			System.out.println(x);
		}
		
		// for(int x= ; x <= input; x=x+1) {
		//if(x%2==0) {continue;}
		//System.out.println(x); }
	}

	}

