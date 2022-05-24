package com.kh.overload.test;

public class Test {
	
	/*
	 * 생성자
	 * 
	 * [접근제한자] 클래스명 (...) {객체가 생성되는 순간, 실행하고 싶은 내용}
	 * 
	 * 객체를 생성하려면 생성자를 호출해야한다.
	 */
	
	//기본 생성자
	public Test() {
		System.out.println("객체 태어남====");
		this.name = "박상언";
		System.out.println("객체 생성자 종료====");
		
	}
	
	//생성자 오버로딩
	public Test(String s) {
		System.out.println("오버로딩된 생성자 호출됨~~~");
		System.out.println("생성자가 전달받은 s :::" + s);
		this.name = s;
		System.out.println("오버로딩된 생성자 호출종료~~~");
		
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
