package main;

public class RedCar implements Car {

	@Override
	public String startCar() {
		return "ȫ�� �õ� �ɾ���";
	}

	@Override
	public void go() {
		System.out.println("ȫ�� �⸧���� ������ ���� ��");
	}

	@Override
	public int stop() {
		return 99;
	}

}
