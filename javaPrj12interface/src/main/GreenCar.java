package main;

public class GreenCar implements Car {

	@Override
	public String startCar() {
		return "���� �õ� �ɾ���";
	}

	@Override
	public void go() {
		System.out.println("���� �ٶ����� ���� ��");
	}

	@Override
	public int stop() {
		return 100;
	}

}
