package com.kh.main;

public class Main {

	public static void main(String[] args) {
		
		Pikachu p = new Pikachu(1, 'E');
		
		p.bodyAttack();
		
		Charmander c = new Charmander(1,'F');
		Kkobugi k = new Kkobugi(1,'W');
		
		c.bodyAttack();
		k.bodyAttack();
		
	}

}
