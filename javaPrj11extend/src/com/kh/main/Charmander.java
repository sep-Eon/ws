package com.kh.main;

public class Charmander {
	
	public Charmander(int level, char type) {
		this.level = level;
		this.type = type;
	}

	private int level;
	private char type; 
	private final String NAME = "ÆÄÀÌ¸®";
	
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
	
	//¸öÅë¹ÚÄ¡±â
		public void bodyAttack() {
		System.out.println(NAME + " ¸öÅë ¹ÚÄ¡±â !!!");
	}
	
	//Àü±¤¼®È­
	public void speedAttack() {
		System.out.println(NAME + " Àü±¤¼®È­!!");
	}
	
	//ºÒ²É¼¼·Ê
	public void fire() {
		System.out.println(NAME + " ºÒ²É¼¼·Ê~~~!!!");
	}

}
