package com.kh.main;

public class Pikachu {
//	
//	
//	//������0
//	public Pikachu() {
//		
//	}
	
	
	// �⺻�����ڴ� �ҿ����� ��ü�� ���� �� �����Ƿ�, �⺻�����ڸ� ������ �ʴ´�.
	//������1
	public Pikachu(int level, char type) {
		this.level = level;
		this.type = type; // E= ����Ÿ��
		
		
	}
	
//	//������2
//	public Pikachu(int num, char ch, String msg) {
//		this.level = num;
//		this.type = ch;
//		System.out.println(msg);
//	}
	
	
	private int level;
	private char type; 
	private final String NAME = "��ī��";
	
	public int getLevel() { //getter
		return this.level;
	}
	
	public void setLevel(int level) { //setter
		this.level = level;
	}
	
	public char getType() { //getter
		return this.type;
	}
	
	public void setType(char type) { //setter
		this.type = type;
	}
			
	//�����ġ��
	public void bodyAttack() {
	System.out.println(NAME + " ���� ��ġ�� !!!");
	}
	
	//�鸸��Ʈ
	public void millionbolt() {
		System.out.println(NAME + " �鸸��Ʈ~~");
	}
	
	//�����Ʈ
	public void Thunderbolt() {
		System.out.println(NAME + " �����Ʈ~~");
	}
	
	

}
