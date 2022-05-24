package com.kh.object;

import vo.Person;

public class ObjectTest {
	
	public void test() {
	//getclass
		
		String s = "abc";
		s.getClass();
		System.out.println(s.getClass());
		
		Person p = new Person("박상언", 27, 173, 66, 'M');
		System.out.println(p.getClass());
		
		
		
		
		
	}
	
	public void test2() {
		
		//hashCode
		// 객체의 ID값을 정수로 출력
		//문자열의 경우엔 처리방식이 조금 다름 
		//(같은 문자열은 같은 해시코드 가짐)
		
		Person p = new Person("박상언", 1, 1, 1, 'M');
		System.out.println(p.hashCode());
		
		Person p2 = new Person("박상언", 1, 1, 1, 'M');
		System.out.println(p2.hashCode());
		
		String s1 = "문자열1";
		System.out.println(s1.hashCode());
		
		String s2 = new String("문자열1");
		System.out.println(s2.hashCode());
	}
	
	public void test3() {
		//toString
		//toString은 기본적으로 Object안에 있음
		//객체가 기본적으로 호출됨
		
		Person p = new Person("박상언", 1, 1, 1, 'm');
		System.out.println(p.toString());
	}

}
