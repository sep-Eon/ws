package conditional_codeup;

import java.util.Scanner;

public class codeup_1166 {
	public static void main(String[] args) {
		
		/*
		 * 2월이 29일까지 있는 해를 윤년이라고 한다.
			어떤 해가 입력되면 그 해가 윤년인지 아닌지 판별하시오.
			윤년 판단 조건)
			1. 해(year)가 4의 배수이면서 100의 배수가 아니면 윤년.
			2. 400의 배수이면 윤년.
			위 두 조건 중 하나라도 맞으면 윤년이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x%4==0&&x%100!=0) {System.out.println("윤년입니다");}
		else if (x%400==0) {System.out.println("윤년입니다");}
		else {System.out.println("윤년 아닙니다.");}
		
	}

}
