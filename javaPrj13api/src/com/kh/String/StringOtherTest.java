package com.kh.String;

public class StringOtherTest {
	
	//���ڿ� ���� 3����
	
	// 1. String
	// 2. StringBuffer
	// 3. StringBuilder
	
	public void test() {
		//String
		String str = new String("zzz");
		String str2 = "zzz"; // String�� ����, StringBuffet, StringBuilder �Ұ���
		str += "123"; ///zzz123
		
	}
	public void test2() {
		//StringBuffer
		
		StringBuffer sb = new StringBuffer("buffer~~~ ");
		System.out.println(sb);
//		sb += "123"; ��Ʈ�����ۿ��� �̷������� �߰� �Ұ���
		sb.append("123"); //append �޼ҵ带 ���ؼ��� ����
		System.out.println(sb);
		
		
		//thread safe
		//thread == ����� �� ���������� ���ϴ� �ϲ�
		
	}
	
	public void test3() {
		//StringBuilder
		StringBuilder sbd = new StringBuilder("builder~~");
		sbd.append("123");
		//�տ��� �߰��ϰ� ������ sbd.insert(0, "���ڿ�") ���
		System.out.println(sbd);
		
		//thread unsafe
		
	}

}
