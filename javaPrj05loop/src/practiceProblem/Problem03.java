package practiceProblem;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input>0) {
			if (input%2==0) {System.out.println("��, ¦");}
			else {System.out.println("��, Ȧ");
			}
		}

	
		if (input<0) {
			if (input%2==0) {System.out.println("��, ¦");}
			else {System.out.println("��, Ȧ");}
			}
		}

}
