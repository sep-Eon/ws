package practiceProblem;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input>0) {
			if (input%2==0) {System.out.println("¾ç, Â¦");}
			else {System.out.println("¾ç, È¦");
			}
		}

	
		if (input<0) {
			if (input%2==0) {System.out.println("À½, Â¦");}
			else {System.out.println("À½, È¦");}
			}
		}

}
