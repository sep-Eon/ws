package practiceProblem;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		
		System.out.println("평가 점수를 입력하시오.");
		
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		
		if (input=="A") {System.out.println("best!!!");}
		else if (input=="B") {System.out.println("good!!");}
		else if (input=="C") {System.out.println("run!");}
		else if (input=="D") {System.out.println("slowly~");}
		else {System.out.println("what?");}

		}

	}


