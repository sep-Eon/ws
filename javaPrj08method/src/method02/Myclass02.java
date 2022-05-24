package method02;

public class Myclass02 {
	

	//메소드(method)
	//==수학시간 함수
	
	/*
	 * 메소드 작성 방법
	 * 접근제한자 리턴타입 메소드명(매개변수) {실행할 내용, 리턴값 있다면 리턴값}
	 * public int plusOne(int number) {number++; return number;}
	 * 
	 * -리턴값이 없으면? void라고 작성
	 * -매개변수는 안받아도 되고, 여러개를 받아도 됨
	 */
	
	
	/*
	 * 메소드 구성
	 * 메소드 헤드(== 메소드 시그니처) 메소드 바디
	 * -메소드의 헤드를 보면, 입력값으 정보 및 반환값의 정보를 알 수 있다.
	 */
	public void test() { //메소드 헤드(시그니처)
 		System.out.println("테스트 메소드 시작"); //메소드 바디
//		myMethod01();
//		plusTen(10);
//		System.out.println(getAge());
		//plusOne 메소드를 호출한다. (숫자 10을 전달)
		//호출 통해서 리턴받은 값 출력하기
		
//		int result = plusOne(10);
//		System.out.println(result);
		
		System.out.println(calcCircle(10));
		
		System.out.println("테스트 메소드 종료");
		
	}
	
	//매개변수가 없고, 리턴값이 없는 메소드
	public void myMethod01() {
		System.out.println("안녕 나는 출력문이야ㅎㅎ");
	}
	
	//정수 하나 전달 받아서, 그 숫자에 +10해서 출력하는 메소드
	//매개변수 있고, 리턴값 없는 메소드
	public void plusTen(int x) {
		x = x+10;
		System.out.println(x);
	}
	
	//본인 나이를 반환(return)하는 메소드
	public int getAge() {
		System.out.println("getAge 메소드 호출됨");
		return 20;
	}
	
	
	//정수 하나를 입력받고, +1한 값을 리턴
	//매개변수(입력받는 값)이 있고, 반환하는 값(==return)이 있는 메소드
	public int plusOne(int x) {
		x++;
		return x;
	}
	
	//반지름의 길이를 입력받고, 원의 넓이를 리턴하는 메소드
	//매개변수 : 반지름
	//리턴타입 : ???
	//실행할 내용 : 반지름을 이용해 넓이 계산
	
	public double calcCircle(int r) {
		double result = r * r * 3.14;
		return result;
	}

}
