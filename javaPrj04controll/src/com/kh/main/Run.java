package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * 제어문
		 * 
		 * 1. 조건문 ( if, switch )
		 * 2. 반복문
		 */
		
		// 조건문 (if, else, else~if) , (switch, case-break, default)
		// 조건에 맞으면 실행 하게 해줌
		/*
		 * if
		 * 
		 * 표현식 :
		 * if(조건식){실행할 내용}
		 * 
		 * 조건식에 들어갈 내용은??
		 * > true / false로 나올 수 있도록 작성
		 * 
		 */
		
		int userInput = 1;
		if(userInput == 1) {//유저인풋이 1이랑 같다면
			System.out.println("짬뽕 주문 완료");
		}
		
		if(userInput == 2) {//유저인풋이 2이랑 같다면
			System.out.println("짜장면 주문 완료");
		}
		
		
		// num이라는 변수를 만들고
		// num 값이 양수라면? 양수입니다. 출력
		//num 값이 0 이라면? zero 출럭
		// num 값이 음수라면? 음수입니다. 출력
		
		/*int num = 1;
		if(num > 0) {
			System.out.println("양수입니다.");
		}
		
		else { System.out.println("음수입니다.");
			}
		
		//if(num < 0) {
		//System.out.println("음수입니다.");
		
		
		/* 
		 * else : 그 밖에
		 * 
		 * 표현식
		 * if (조건식) {실행할 내용}
		 * else {실행할 내용}
		 * 
		 * else는 앞에서 if를 사용한 경우에만 쓸 수 있음
		 */
		
//		int num = 1;
//	    if(num > 0) {
//			System.out.println("양수입니다.");
//		}
//		
//		else if(num < 0) {
//			System.out.println("음수입니다.");
//		}
//		
//		else if(num == 0) {
//			System.out.println("0입니다.");
//		}
		
		/*
		 * else ~if
		 * 
		 * 표현식
		 * if(조건식) {실행할 내용}
		 * else if(조건식) {실행할 내용}
		 * else if(조건식) {실행할 내용} 
		 * *
		 * *
		 * (여러개 사용 가능)
		 * 앞의 if코드가 통과하지 못했을 경우에만 else if 코드가 효력을 가진다.
		 * if로만 이루어진 코드들에 비해서 더욱 효율적임.
		 * if (***)
		 * else if (&&&) <<통과
		 * else if (aaa) <<앞의 else if가 통과하여 코드 발동 x
		 * 
		 * 논리적인 오류를 방지함.
		 * 
		 */
		
		
		/*
		 * switch(?) {
		 *   case ? : 실행구문;
		 *   case ? : 실행구문;
		 *   .
		 *   .
		 *   .
		 *   default : 실행구문;
		 * }
		 * 
		 */
		
		int x = 2;
		switch(x) {
		case 1 : System.out.println("일"); break; //브레이크 필수!
		case 2 : System.out.println("이"); break;
		case 3 : System.out.println("삼"); break;
		default : System.out.println("범위에 없음"); // else 같은 친구, 마지막에만 적용
		}
		
	}

}
