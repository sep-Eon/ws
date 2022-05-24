package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		
		//정수 하나를 입력받고
		//입력 받은 정수가 홀수인지, 짝수인지 판단하기.
		// 홀수면 홀수라고 출력, 짝수면 짝수라고 출력
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (x%2==1) {System.out.println("홀수입니다.");}
		
		else if (x%2==0) {
			if (x==0) {System.out.println("0");}
			else {System.out.println("짝수입니다.");}

	}

}
	
}
	


