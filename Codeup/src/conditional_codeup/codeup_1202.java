package conditional_codeup;

import java.util.Scanner;

public class codeup_1202 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x>=0&&x<=100) {
		if (x>=90) {System.out.println("A");}
		else if (x>=80) {System.out.println("B");}
		else if (x>=70) {System.out.println("C");}
		else if (x>=60) {System.out.println("D");}
		else {System.out.println("F");}
		}
	}

}
