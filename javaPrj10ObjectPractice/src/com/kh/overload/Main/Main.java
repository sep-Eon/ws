package com.kh.overload.Main;

import com.kh.overload.test.Test;

public class Main {

	public static void main(String[] args) {
		
		//생성자 호출을 통해서 객체 생성, 생성된 객체를 변수에 할당.
		Test t = new Test();
		
		System.out.println("t.name ::: " + t.name);

	}

}
