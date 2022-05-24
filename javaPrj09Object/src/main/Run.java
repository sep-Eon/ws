package main;

import practice.MyClass01;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("Run 클래스의 main 메소드 호출됨");
		System.out.println("===============");
		
		
		
		//객체 생성 (MyClass01 클래스 파일 이용하여 객체생성)
		
//		MyClass01 mc01 = new MyClass01(); // 오른쪽 : 객체 생성, 왼쪽 : 타입은 myClass01, mc01이라는 변수에 할당
//		// 변수의 타입이 MyClass01이라는 타입임. int, String등에 담을 수 없음
//		// 클래스=타입 == 클래스 생성 = 타입의 생성,
//		
//		mc01.myMethod01();
//		mc01.myMethod02();
		
		//객체의 메소드 호출 (MyCalss01 클래스 파일의 myMethod01 호출)
		
	
		//배열도 사실 하나의 객체임
		// new 타입 => 객체 생성
		
		
		MyClass01 mc = new MyClass01();
		mc.name = " 박상언";
		mc.age = 27;
		mc.introduce();
		
		
		
		
		
		
		
		//객체 (== object == instance)
		// class 를 instance화 하여 객체를 만들어라 => class로 객체를 만들어라
		
		//class : 붕어빵 틀
		//객체 : 붕어빵 => 클래스 통해서 만들어짐
		
		//class : 설계도
		//class : 설계도를 이용하여 만들어진 제품
		
		/*
		 * 카페 아르바이트
		 * 
		 * <절차 지향>
		 * 1. 손님 들어옴
		 * 2. 주문 받음
		 * 2-1 (주문취소 떠남, 아래 내용 실행하지 않음)
		 * 3. 계산
		 * 3-1 (잔액부족)
		 * 4. 음료 제조
		 * 5. 음료 계산
		 */
		
		/*
		 * <객체 지향>
		 * [카운터 직원] => 메뉴얼 (class) => 기능 (method) + data (variable)
		 * -닉네임 =>  data(variable)
		 * -시급 : 9,000 => data (variable)
		 * 
		 * - 주문받는 기능 (method)
		 * - 계산 기능 (method)
		 * - 음료 건네기 (method)
		 * 무한루프 (각자의 역할을 계속 수행하게 함)
		 * 
		 * [주방 직원] => 메뉴얼(class)
		 * -닉네임
		 * -시급 : 10,000 
		 * 
		 * -음료 제조
		 * -음료 건네기
		 * 무한루프
		 * 
		 * 직원 = 객체
		 */
		
		
		//객체를 이해하려면
		//직접 객체를 다뤄야함
		
		/*
		 * Scanner sc = new Scanner(System.in);
			sc.nextInt();

			= 오른쪽부터 해석
			new 새로운 파일
			Scanner 스캐너란 class를 이용 => Scanner 객체를 생성 
			sc에 담아둠.
			
			sc.nextInt();
			sc를 통해서 nextInt라는 메소드를 호출

		 */
		
		/*
		 * 절차지향 vs 객체지향
		 * 
		 */

	}

}
