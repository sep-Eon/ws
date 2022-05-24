package Practice;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// 1095
		
//		//정보 선생님은 오늘도 이상한 출석을 부른다.
//
//영일이는 오늘도 다른 생각을 해보았다.
//출석 번호를 다 부르지는 않은 것 같은데... 가장 빠른 번호가 뭐였지?
//
//출석 번호를 n번 무작위로 불렀을 때, 가장 빠른 번호를 출력해 보자.
//
//
//참고
//배열에 순서대로 기록해 두면, 기록된 내용을 모두 검사해 가장 작은 값을 찾아내면 된다.
//
//그런데, 가장 작은 값은 어떻게 어떤 것과 비교하고 찾아야 할까?
//		
//		/*
//		 * 번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
//            n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
//		 */
		
		
		Scanner sc = new Scanner(System.in); //
		
		//1~23번 까지 있음
		int[] memo = new int[24]; // 0~23 = 24개
		//n번 출석을 부를거임 =n
		int n = sc.nextInt();
		
		
		for (int i = 0; i < n; ++i) { // n번 반복한다.
			int x = sc.nextInt(); //선생님이 부르신 출석번호 확인=x
			memo[x] = 1; // 선생님이 부르신 x번 칸에 가서 체크
			}
		
		for (int i = 1; i <=23; ++i) {
			if(memo[i]==1) {
				System.out.println(i);
			}
		}


		
		
		
		

	}
}



