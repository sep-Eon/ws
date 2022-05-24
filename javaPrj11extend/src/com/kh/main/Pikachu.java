package com.kh.main;

public class Pikachu {
//	
//	
//	//생성자0
//	public Pikachu() {
//		
//	}
	
	
	// 기본생성자는 불완전한 객체를 만들 수 있으므로, 기본생성자를 만들지 않는다.
	//생성자1
	public Pikachu(int level, char type) {
		this.level = level;
		this.type = type; // E= 전기타입
		
		
	}
	
//	//생성자2
//	public Pikachu(int num, char ch, String msg) {
//		this.level = num;
//		this.type = ch;
//		System.out.println(msg);
//	}
	
	
	private int level;
	private char type; 
	private final String NAME = "피카츄";
	
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
			
	//몸통박치기
	public void bodyAttack() {
	System.out.println(NAME + " 몸통 박치기 !!!");
	}
	
	//백만볼트
	public void millionbolt() {
		System.out.println(NAME + " 백만볼트~~");
	}
	
	//썬더볼트
	public void Thunderbolt() {
		System.out.println(NAME + " 썬더볼트~~");
	}
	
	

}
