package practice;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		
		// 1. 변수 하나 만들고, 숫자 입력받기
		// 2. 해당 숫자가 양수인지, 음수인지, 0인지 판단하기
		
		//int num = -231;
		//if (num>0) {System.out.println("양수입니다.");
		//}
		//else if (num<0) {System.out.println("음수입니다.");
		//}
		//else {System.out.println("0입니다.");
		//}
		
		// 시작은 무조건 if, 
		//else if는 여러개 사용 가능 (단, 앞에 if 존재해야함)
		//else를 사용하려면 무조건 마지막에 사용하기
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x>0) {
			System.out.println("+"); 
		}
		
		else if (x<0) {
			System.out.println("-");
		}
		else { System.out.println("0"); }

		
		

	}

}
