package com.kh.String;

public class StringTest {
	
	public void test() {
		
		//charAt
		//"���ڿ�"���� Ư�� �ε����� '����'�� ������
		
		String s = "abcdefg";
		
		char ch = s.charAt(0);
		System.out.println("ch : " + ch);
		
	}
	
	public void test2() {
		//compareTo
		//���������� �������� ��, ���̸� ����, 
		//�ڸ� ����� ������
		
		String s =  "a";
		String s2 = "b";
		int com = s.compareTo(s2);
		System.out.println(com);
		
	}
	
	public void test3() {
		//concat
		//���ڿ� ������ 
		
		String s = "abc";
		String s2 = "ABC";
		
		String con = s.concat(s2);
		System.out.println(con);
	}
	
	public void test4() {
		//equals
		//���ڿ� ������ ��
		
		String s = "abc";
		String s2 = "zzz";
		System.out.println(s.equals(s2));
	}
	
	public void test5() {
		//equalsIgnoreCase
		//���ڿ� ������ �� (��ҹ��� ����)
		
		String s = "abc";
		String s2 = "ABC";
		System.out.println(s.equalsIgnoreCase(s2));
	}
	
	public void test6() {
		//length
		//���ڿ��� ���̸� ���������� ����
		
		String s = "abc"; 
		System.out.println(s.length());
	}
	
	public void test7() {
		//replace
		//s.replace(old char,new char) �ش� ���ڸ�
		//Ư�� ���ڸ� ���ϴ� ���ڷ� �ٲ��� (����)
		
		String s = "aaabc123";
		String x = s.replace('a', 'b');
		System.out.println(x);
		System.out.println(s);
		
	}
	
	public void test8() {
		//substring
		//���ڿ��� Ư�� ������ �߶�
		// ����~��, ����~Ư������
		
		//beginIndex(������)�� ������ �޾� �� ���ĺ��� ���
		//5�� �Է��Ͽ� 5�� �ε����� 2 ������ 3,4,5�� ��µ�
		// �ΰ��� ���ڸ� ���� ���, 2<= ? < 5 �̷������� ��µȴ�.
		
		String s = "abc12345";
//		String x = s.substring(5);
		String x = s.substring(2, 5);
		System.out.println(x);
		
	}
	
	public void test9() {
		//toUpperCase
		//�ҹ��ڸ� �빮�ڷ� �ٲ���
		
		String s = "abc123";
		String x = s.toUpperCase();
		System.out.println(x);
		
		String low = test10(x); // �빮�ڷ� ����� ���ڿ��� test10�� ����
		System.out.println(low);
		
	}
	
	public String test10(String str) {
		//toLowerCase
		return str.toLowerCase();
	}

}
