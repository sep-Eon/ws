package practiceProblem;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input>=1&&input<=12) {
		
		if (input==12||input==1||input==2) {
			System.out.println("winter");
		}
		else if (input==3||input==4||input==5) {
			System.out.println("Spring");
		}
		else if (input==6||input==7||input==8) {
			System.out.println("Summer");
		}
		else {System.out.println("fall");}
			
		}
		
		else {System.out.println("해당 월은 없습니다.");}
	}
		
		

	}


