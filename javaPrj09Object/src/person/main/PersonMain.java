package person.main;

import person.obj.Person;

public class PersonMain {

	public static void main(String[] args) {
		System.out.println("PersonMainŬ������ main �޼ҵ� ȣ���...");
		System.out.println("================");
		
		//Person Ŭ������ �̿��ؼ�, ��ü�� ����
		//������ ��ü�� ������ ����Ұ���, ������ ������ ���� ����.
		Person p1 = new Person();
		
		System.out.println("��ü �� ��������� Ȯ�� :::" + p1);
			
	    //��ü�� ������ �������� �ϱ�
		p1.walk();
		p1.say();
		p1.eat();
		
		p1.name = "�ڻ��";
		p1.age = 27;
		p1.height = 173.0;
		p1.weight = 66.0;
		p1.gender = 'm';
		p1.skin = "Yellow";
		p1.birth = "7�� 30��";
		p1.adress = "��õ��";
		
		p1.introduce();
	}

}
