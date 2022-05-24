package scanner;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {
		
		//스캐너로 문자열 받기
		
		//스캐너 생성
		
		Scanner sc = new Scanner (System.in);
//		String s1 = sc.nextLine();
//		System.out.println(s1);
//		
		
		// 숫자, 문자열 입력받기
		
		int x = sc.nextInt();
		int x2 = sc.nextInt();
		
		String s2 = sc.nextLine();
		System.out.println("x : " + x);
		System.out.println("x2 : " + x2);
		System.out.println("s2 : " + s2);
		
		
		
		//next는 띄어쓰기 이전 문자열만 출력
		//nextLine은 띄어쓰기 이후 문자열도 포함하여 출력
	

	}

}
