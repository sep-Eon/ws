package person.main;

import person.obj.Person;

public class PersonArrayMain {

	public static void main(String[] args) {
		
		//��ü�迭
		
		//�迭
		//(���� Ÿ��)�ȿ��� �������� �����͸� �����ϱ� ���� ���
		
		//����ü (�ڹٿ� ����)
		// (Ÿ�� ���)���� �������� ������ ����
		
		
		//Ŭ���� (c��� ����ü�� ���� ����)
		//data + method
		// �������� ������ + �޼ҵ�
		
		//��ü �迭
		//�������� ��ü�� �����Ϸ��� (����Ÿ��)
		
		System.out.println("personArrayMain Ŭ������ main �޼ҵ� ȣ���...");
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
		
		pArr[0].name = "�ǿ�";
		pArr[1].name = "�ǵ�";
		pArr[2].name = "�Ǽ�";
		pArr[3].name = "�ǳ�";
		pArr[4].name = "�Ǵټ�";
		
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
//		//Person Ŭ���� �ϳ��� �� ���� ��ü+���� ����.
//		
//		p1.name = "�ǿ�";
//		p2.name = "����";
//		p3.name = "�Ǿ���";
//		p4.name = "����";
//		p5.name = "�����̺�";
//		
//		p1.introduce();
//		p2.introduce();
//		p3.introduce();
//		p4.introduce();
//		p5.introduce();
	}

}

