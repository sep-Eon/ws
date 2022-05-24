package method01;

import java.util.Scanner;

public class Myclass {
	
	public void test() {
		System.out.println("안녕하세요");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		judge(x);
		
		
	
}
	public void judge(int x) {
		
		//숫자 판단
		if(x>0) {
			System.out.println("양수입니다");}
		else if (x<0) {
				System.out.println("음수입니다.");}
				
		else {System.out.println("zero");}
		
		
	}
	
}
