package Practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// 1403
		
		//k개의 숫자를 입력받고 그 숫자들을 두번 출력하시오. 
		
		/*
		 * 1.k입력 받아 k개의 숫자를 적을 수 있는 메모장 준비
		 * 2. 숫자 듣고 메모장에 k번 적기
		 * 3. 메모장의 i 번째 요소 읽기 (단, i : 0~k-1)
		 * 4. k번까지 불려진 숫자들을 두 번씩 출력하기
		 */

		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int a[] = new int[k] ;
		
		for (int i = 0; i < k; ++i) {
			
			a[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < k; ++i) {
			
			System.out.println(a[i]);
			System.out.println(a[i]);
		
		}
		
		
		
		
		
		
	}

}
	

