package Practice;

import java.util.Scanner;

public class Problem00 {

	public static void main(String[] args) {
		// 1430
		
		/*
		 * 주현이 엄마는 주현이를 영재로 키우기 위해 매일 혹독한 기억력 테스트를 하고 있다.

N개의 숫자를 먼저 말해주고, M개의 질문을 하면서 그 숫자가 있었는지 없었는지 테스트한다.

만약 있었다면 1을 출력하고, 없었다면 0을 출력한다.

이번에는 주현이가 좋아하는 3단 합체 변신로봇 '또봇 트라이탄'이 선물로 걸려있다.

주현이를 도와 줄수 있는 프로그램을 만드시오.

		 */
		
		//n개의 숫자 알려줌. m개의 질문을 하며 있는지 없는지 테스트함.
		// 있었다면 1, 없었다면 0 출력
		
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a[] = new int[n];
	
		
		if (n>=1&&n<=10000000) {
				
			for (int i = 0; i < n ; ++i) {
				a[i] = sc.nextInt();
			}
		}
		
		int q = sc.nextInt();
		int b[] = new int[q];
		
		if (q>=1&&q<=100000) {
			
			for (int i = 0; i < q ; ++i) {
				
				b[i] = sc.nextInt();
				
				for (int j = 0; j < q ; ++j) {
					
					if (a==b) {
						System.out.println("1");
					}
					
					else {System.out.println("0");}
					
					}
				
			}
			
			
			
			
		}
		}
	
		
		
		
		/*
		 * 첫째줄에 N이 입력된다. (1 <= N <= 10,000,000)

둘째 줄에 N개의 숫자가 공백으로 구분되어 차례대로 입력된다. ( 데이터값의 범위 : 1 ~ 10,000,000)

셋째줄에 질문의 수 M이 입력된다. ( 1 <= M <= 100,000)

넷째 줄에 M개의 질문이 입력된다. 
		 */
		
		/*
		 * M개의 각각의 질문에 대해 그 숫자가 있었으면 1을 출력, 없었으면 0을 하나씩 차례대로 출력한다.
		 */
		
		
	

		
		
		
		
		
		
	}


	

