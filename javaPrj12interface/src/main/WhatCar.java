package main;

public class WhatCar implements Car, ElectronicCar {

	@Override
	public String startCar() {
		return "���� �õ� �ɾ���";
	}

	@Override
	public void go() {
		System.out.println("����, ����� ������ ���� ��");
	}

	@Override
	public int stop() {
		return 300;
	}

	@Override
	public void charge() {
		System.out.println("����(������) ���� ��....");
	}

}
