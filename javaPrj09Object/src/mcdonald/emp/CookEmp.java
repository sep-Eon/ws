package mcdonald.emp;

public class CookEmp {
	
	public String name;
	int money;
	
	public void cook(String hamname) {
		System.out.println(hamname + "�丮�ϱ�");
		System.out.println("�丮�Ϸ�");
		wash();
	}
	
	public void wash() {
		System.out.println("������");
	}

}
