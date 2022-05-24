package person.obj;

public class Person {
	
	//클래스 == data + method
	
	// 데이터 == 필드 == 멤버변수 == 전역변수 == 인스턴스변수 ==객체변수
	public String name;
	public int age;
	public double height;
	public double weight;
	public char gender; //Male, Female
	public String skin;
	public String birth;
	public String adress;
	
	//기능 == 동작 ==메소드
	
	
	public void walk() {
		System.out.println("뚜벅뚜벅..");
	}
	
	public void say() {
		System.out.println("안녕하세요");
	}
	
	public void eat() {
		System.out.println("음~~맛있다");
	}
	
	//자기소개 메소드
	public void introduce() {
		//본인이 가진 모든 데이터들(변수==필드==전역변수==인스턴스)
		//출력
		System.out.println("p1.name ::: " + this.name);
		System.out.println("p1.age ::: " +this.age);
		System.out.println("p1.height ::: " +this.height);
		System.out.println("p1.weight ::: " +this.weight);
		System.out.println("p1.gender ::: " +this.gender);
		System.out.println("p1.skin ::: " +this.skin);
		System.out.println("p1.birth ::: " +this.birth);
		System.out.println("p1.adress ::: " +this.adress);
	}

}
