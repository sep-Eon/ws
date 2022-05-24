package main;

public class Run {

	public static void main(String[] args) {
		
		/*
		 *  연산자 (산술, 비교, 논리)
		 *  
		 *  산술 : +, -, *, /, %
		 *  비교 : ==, !=, >, <, >=, <=
		 *  논리 : &&, ||, (= and, or)
		 */
		
		// 1.산술
		
		int x,y;
		x = 10;
		y = 20;
		
		System.out.println(x+y); //30
		System.out.println(x-y); //-10
		System.out.println(x*y); //200
		System.out.println(x/y); // 0 나누기가 아님. 몫을 구하는 연산자
		System.out.println(x%y); // 10, 나머지를 구하는 연산자
		
		// 2.비교
		
		// ==, !=, <, <=, >, >=
		
		//int x,y;
		//x = 10;
		//y = 20;
		
		System.out.println(x==y); // false
		System.out.println(x!=y); //true
		System.out.println(x<y); //true
		System.out.println(x<=y); //true
		System.out.println(x>y); //false
		System.out.println(x>=y); //false
		
		System.out.println(" x 의 값은? " + x); 
		// String + int String 뒤의 int는 String 으로 바꿔줌 => x는 문자열 10이 됨
		
		
		System.out.println(" x == y? " + (x==y));
		//System.out.println(" x == y ? ");
		//System.out.println(x==y);
		
		System.out.println(" x != y? " + (x!=y));
		//System.out.println(" x != y ? ");
		//System.out.println(x!=y);
		
		
		// 논리
		
		/*
		 * 나는 남자다 ? true
		 * 나는 여자다 ? false
		 * 
		 * 나는 초등학생이다 ? false
		 * 나는 초등학생이 아니다 ? true
		 * 
		 * 나는 남자면서 초등학생이다 ? false
		 * 나는 여자다. 또는 잼민이가 아니다. true
		 */
		
		/*
		 *  T && T ? T
		 *  T && F ? F
		 *  F && T ? F
		 *  F && F ? F
		 *  
		 *  T||T ? T
		 *  T||F ? T
		 *  F||T ? T
		 *  F||F ? F
		 */
		
		
		
	}

}
