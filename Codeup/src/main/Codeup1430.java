package main;

import java.util.Scanner;

public class Codeup1430 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int memo[] = new int[10000001]; // 0~10,000,00까지 배열 생성
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			memo[x] = 1;
		}
		
		int m = sc.nextInt();
		
		for (int i = 0; i < n; ++i) {
			System.out.println(memo[sc.nextInt()] + " ");
		}
		
		for (int i = 0; i < n; ++i) {
			int x = sc.nextInt();
			if(memo[x] == 1 ) {
			  System.out.print("1" + " ");
			 }
			else {System.out.print("0" + " ");}
		}
		
		
		
		
	}

}
