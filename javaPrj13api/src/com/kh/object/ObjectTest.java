package com.kh.object;

import vo.Person;

public class ObjectTest {
	
	public void test() {
	//getclass
		
		String s = "abc";
		s.getClass();
		System.out.println(s.getClass());
		
		Person p = new Person("�ڻ��", 27, 173, 66, 'M');
		System.out.println(p.getClass());
		
		
		
		
		
	}
	
	public void test2() {
		
		//hashCode
		// ��ü�� ID���� ������ ���
		//���ڿ��� ��쿣 ó������� ���� �ٸ� 
		//(���� ���ڿ��� ���� �ؽ��ڵ� ����)
		
		Person p = new Person("�ڻ��", 1, 1, 1, 'M');
		System.out.println(p.hashCode());
		
		Person p2 = new Person("�ڻ��", 1, 1, 1, 'M');
		System.out.println(p2.hashCode());
		
		String s1 = "���ڿ�1";
		System.out.println(s1.hashCode());
		
		String s2 = new String("���ڿ�1");
		System.out.println(s2.hashCode());
	}
	
	public void test3() {
		//toString
		//toString�� �⺻������ Object�ȿ� ����
		//��ü�� �⺻������ ȣ���
		
		Person p = new Person("�ڻ��", 1, 1, 1, 'm');
		System.out.println(p.toString());
	}

}
