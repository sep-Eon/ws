package com.kh.main;

public class Kkobugi {
	
	public Kkobugi(int level, char type) {
		this.level = level;
		this.type = type;
	}
	
	private int level;
	private char type; 
	private final String NAME = "���α�";
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public char getType() {
		return this.type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	//�����ġ��
		public void bodyAttack() {
		System.out.println(NAME + " ���� ��ġ�� !!!");
	}
	
	
	//������
	public void waterCanon() {
		System.out.println(NAME + " ������~~~");
	}
	
	//��ǰ����
	public void bubble() {
		System.out.println(NAME + " ��ǰ����~~~");
	}
}
