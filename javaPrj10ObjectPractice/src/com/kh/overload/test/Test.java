package com.kh.overload.test;

public class Test {
	
	/*
	 * ������
	 * 
	 * [����������] Ŭ������ (...) {��ü�� �����Ǵ� ����, �����ϰ� ���� ����}
	 * 
	 * ��ü�� �����Ϸ��� �����ڸ� ȣ���ؾ��Ѵ�.
	 */
	
	//�⺻ ������
	public Test() {
		System.out.println("��ü �¾====");
		this.name = "�ڻ��";
		System.out.println("��ü ������ ����====");
		
	}
	
	//������ �����ε�
	public Test(String s) {
		System.out.println("�����ε��� ������ ȣ���~~~");
		System.out.println("�����ڰ� ���޹��� s :::" + s);
		this.name = s;
		System.out.println("�����ε��� ������ ȣ������~~~");
		
	}
	

		
	//data
	
	public String name;
	
	public void hi() {
		System.out.println("hi");
	}
	
	public void hi(String str) {
		System.out.println("hi" + str);
	}

}
