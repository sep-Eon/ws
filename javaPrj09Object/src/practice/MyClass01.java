package practice;

public class MyClass01 {
	
	//��ü ����
	//��ü �޼ҵ� ȣ��
	
	public String name;
	public int age;
	
	/*
	 * �������� vs �ʵ� (==�ν��Ͻ�����==��������==Ŭ��������==�������)
	 * - ���� ���� �̸��� ��� ����
	 * - �޼ҵ� �ȿ����� ���������� ���õȴ�.
	 * �׷���, this.���������� ���ָ� �ʵ尡 ���õȴ�.
	 */
	public void introduce() {
		
		String name = "�������������� ����";
		//this : ���� ��ü
		this.name = "�޼ҵ� �ȿ��� ���� �̸�"; //this : ���� ��ü
		System.out.println("�ȳ� ���� MyClass01�� Ÿ���̾�");
		System.out.println("�� �̸���" + this.name);
		System.out.println("�� ���̴�" + age);
		
	}
	
	public void myMethod01() {
		System.out.println("MyClass01�� myMethod ȣ���...");
	}
	
	public void myMethod02() {
		System.out.println("MyClass02�� myMethod ȣ���...");
	}

}
