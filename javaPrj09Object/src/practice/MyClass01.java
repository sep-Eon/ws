package practice;

public class MyClass01 {
	
	//객체 생성
	//객체 메소드 호출
	
	public String name;
	public int age;
	
	/*
	 * 지역변수 vs 필드 (==인스턴스변수==전역변수==클래스변수==멤버변수)
	 * - 서로 같은 이름을 사용 가능
	 * - 메소드 안에서는 지역변수가 선택된다.
	 * 그러나, this.변수명으로 써주면 필드가 선택된다.
	 */
	public void introduce() {
		
		String name = "ㅋㅋㅋ지역변수 생성";
		//this : 현재 객체
		this.name = "메소드 안에서 만든 이름"; //this : 현재 객체
		System.out.println("안녕 나는 MyClass01의 타입이야");
		System.out.println("내 이름은" + this.name);
		System.out.println("내 나이는" + age);
		
	}
	
	public void myMethod01() {
		System.out.println("MyClass01의 myMethod 호출됨...");
	}
	
	public void myMethod02() {
		System.out.println("MyClass02의 myMethod 호출됨...");
	}

}
