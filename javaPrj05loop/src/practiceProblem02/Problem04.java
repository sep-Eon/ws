package practiceProblem02;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		// 1153
		//�� ������ �Էµȴ�.  
		//�� ������ ũ�⸦ ���Ͽ� ���� ���� ũ�� > �� ���, ������ ���� ũ�� < �� ���, ������ = �� ����Ͻÿ�.
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x==y) {System.out.println("=");}
		else if(x>y) {System.out.println(">");}
		else if(x<y) {System.out.println("<");}
		
		
		

	}

}
