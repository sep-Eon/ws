package practiceProblem;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if (input>=0&&input<=100) {
			if (input>=90) {System.out.println("A");}
			else if (input>=70) {System.out.println("B");}
			else if (input>=40) {System.out.println("C");}
			else {System.out.println("D");
			}
		}
		
		else {System.out.println("맞는 값이 없습니다.");}
		
	}

}
