package conditional_codeup;

import java.util.Scanner;

public class codeup_1228 {
	public static void main(String[] args) {
		
		/*
		 * 희윤이는 '성문이 두마리 치킨' 가게를 운영하고 있다.
			치킨집을 운영하다 보니 매일 치킨을 먹게 되었다.
			그러던 어느 날 몸무게를 재어보니 80kg이 나가는 것을 보고 깜짝 놀랐다.
			희윤이 여자친구는 비만인 사람을 제일 싫어 하므로 희윤이는 절대 비만이면 안 된다.
			희윤이가 비만인지 아닌지 판별하는 프로그램을 작성하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하시오.");
		int x = sc.nextInt();
		System.out.println("몸무게를 입력하시오.");
		int y = sc.nextInt();
		
		double ave = (x-100)*0.9;
		double result = ((y-ave)*100) / ave;
		
		if (result>20) {System.out.println(result + " 입니다. 따라서, 비만입니다.");}
		else if (result>=10&&result<=20) {System.out.println(result + " 입니다. 따라서, 과체중입니다.");}
		else if (result>0&&result<=10) {System.out.println(result + " 입니다. 따라서, 정상입니다.");}

		
		
	}

}
