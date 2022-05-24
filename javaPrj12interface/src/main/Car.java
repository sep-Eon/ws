package main;

public interface Car {
	
	//모든 자동차가 공통적으로 가져야 할 메소드
	
	String startCar(); //시동 시 문자열 출력
	
	void go ();
	
	int stop (); //브레이크 시 속도 출력
	
	//public abstract는 필수이기 때문에 생략가능

}
