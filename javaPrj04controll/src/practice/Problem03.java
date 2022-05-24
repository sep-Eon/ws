package practice;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		/*
		 * 2월이 29일까지 있는 해를 윤년이라 한다.
		 * 어떤 해가 입력되면 그 해가 윤년인지 아닌지 판별하시오.
		 * 윤년 판단 조건
		 * 조건1) 해(Year)가 4의 배수이면서 100의 배수가 아니면 윤년
		 * 조건2) 400의 배수이면 윤년
		 * 위 두 조건 중 하나라도 맞으면 ㅇ윤년이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if ( (x%4==0 && x%100!=0) || (x%400==0) ) {System.out.println("윤년");}
		else {System.out.println("윤년 아님");}

	}

}
