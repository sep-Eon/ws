package practiceProblem;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int first = sc.nextInt();
		int second = sc.nextInt();
		int third = sc.nextInt();
		
		if (first%2==0) {
			System.out.println("¦");
		}
		else {
			System.out.println("Ȧ");
		}
		
		if (second%2==0) {
			System.out.println("¦");
		}
		else {
			System.out.println("Ȧ");
		}
		
		if (third%2==0) {
			System.out.println("¦");
		}
		else {
			System.out.println("Ȧ");
		}

	}

}
