package person.main;

import person.obj.Person;

public class PersonArrayMain {

	public static void main(String[] args) {
		
		//객체배열
		
		//배열
		//(같은 타입)안에서 여러개의 데이터를 관리하기 위해 사용
		
		//구조체 (자바에 없음)
		// (타입 상관)없이 여러개의 데이터 관리
		
		
		//클래스 (c언어 구조체의 단점 보완)
		//data + method
		// 여러개의 데이터 + 메소드
		
		//객체 배열
		//여러개의 객체를 관리하려고 (같은타입)
		
		System.out.println("personArrayMain 클래스의 main 메소드 호출됨...");
		System.out.println("=================");
		
		Person[] pArr = new Person[5];
		
		for (int i = 0; i < 5; i++) {
			pArr[i] = new Person();
		}
		
		
		
//		pArr[0] = new Person();
//		pArr[1] = new Person();
//		pArr[2] = new Person();
//		pArr[3] = new Person();
//		pArr[4] = new Person();
		
		pArr[0].name = "피원";
		pArr[1].name = "피둘";
		pArr[2].name = "피셋";
		pArr[3].name = "피넷";
		pArr[4].name = "피다섯";
		
		pArr[0].introduce();
		pArr[1].introduce();
		pArr[2].introduce();
		pArr[3].introduce();
		pArr[4].introduce();
		
		
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
//		Person p4 = new Person();
//		Person p5 = new Person();
//		//Person 클래스 하나로 두 개의 객체+변수 만듦.
//		
//		p1.name = "피원";
//		p2.name = "피투";
//		p3.name = "피쓰리";
//		p4.name = "피포";
//		p5.name = "피파이브";
//		
//		p1.introduce();
//		p2.introduce();
//		p3.introduce();
//		p4.introduce();
//		p5.introduce();
	}

}

