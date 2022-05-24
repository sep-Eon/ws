package person.main;

import person.obj.Person;

public class PersonMain {

	public static void main(String[] args) {
		System.out.println("PersonMain클래스의 main 메소드 호출됨...");
		System.out.println("================");
		
		//Person 클래스를 이용해서, 객체를 생성
		//생성한 객체를 앞으로 사용할거임, 때문에 변수에 담을 것임.
		Person p1 = new Person();
		
		System.out.println("객체 잘 만들어졌나 확인 :::" + p1);
			
	    //객체를 가지고 여러가지 하기
		p1.walk();
		p1.say();
		p1.eat();
		
		p1.name = "박상언";
		p1.age = 27;
		p1.height = 173.0;
		p1.weight = 66.0;
		p1.gender = 'm';
		p1.skin = "Yellow";
		p1.birth = "7월 30일";
		p1.adress = "부천시";
		
		p1.introduce();
	}

}
