package practice;

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		// 정수를 입력 받고, 1부터 입력받은 수 까지 출력하는 프로그램을 만드세요.
		// 단, 짝수는 출력하지 않는다.
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for (int x = 1; x<=input; x=x+2) { //증감식에서 +1이 아닌, +2라고 써서 해결 가능
			// if를 이용해서 홀수만 출력하게
			System.out.println(x);
		}
		
		// for(int x= ; x <= input; x=x+1) {
		//if(x%2==0) {continue;}
		//System.out.println(x); }
	}

	}

