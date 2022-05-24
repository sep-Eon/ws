package mcdonald.emp;

public class CookEmp {
	
	public String name;
	int money;
	
	public void cook(String hamname) {
		System.out.println(hamname + "요리하기");
		System.out.println("요리완료");
		wash();
	}
	
	public void wash() {
		System.out.println("설거지");
	}

}
