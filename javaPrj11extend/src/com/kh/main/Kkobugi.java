package com.kh.main;

public class Kkobugi {
	
	public Kkobugi(int level, char type) {
		this.level = level;
		this.type = type;
	}
	
	private int level;
	private char type; 
	private final String NAME = "꼬부기";
	
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
	
	//몸통박치기
		public void bodyAttack() {
		System.out.println(NAME + " 몸통 박치기 !!!");
	}
	
	
	//물대포
	public void waterCanon() {
		System.out.println(NAME + " 물대포~~~");
	}
	
	//거품세례
	public void bubble() {
		System.out.println(NAME + " 거품세례~~~");
	}
}
