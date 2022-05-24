package main;

public class RedCar implements Car {

	@Override
	public String startCar() {
		return "홍차 시동 걸었음";
	}

	@Override
	public void go() {
		System.out.println("홍차 기름으로 앞으로 가는 중");
	}

	@Override
	public int stop() {
		return 99;
	}

}
