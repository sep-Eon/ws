package person.obj;

public class Person {
	
	//Ŭ���� == data + method
	
	// ������ == �ʵ� == ������� == �������� == �ν��Ͻ����� ==��ü����
	public String name;
	public int age;
	public double height;
	public double weight;
	public char gender; //Male, Female
	public String skin;
	public String birth;
	public String adress;
	
	//��� == ���� ==�޼ҵ�
	
	
	public void walk() {
		System.out.println("�ѹ��ѹ�..");
	}
	
	public void say() {
		System.out.println("�ȳ��ϼ���");
	}
	
	public void eat() {
		System.out.println("��~~���ִ�");
	}
	
	//�ڱ�Ұ� �޼ҵ�
	public void introduce() {
		//������ ���� ��� �����͵�(����==�ʵ�==��������==�ν��Ͻ�)
		//���
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
