package main;

import java.util.*;

public class Test {

	/*
	 * ���׸�
	 * - (Ư�� �÷���) Ÿ�� ������ ���� ����� 
	 * ���� : List<String> = new ArrayList<String>();
	 * List<String> = new ArrayList<>();
	 */
	
	public void test() {
		
		List<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		
		//����Ʈ�� �ִ� ��� ������ ���� �� ���
//		int o1 = al.get(0);
//		int o2 = al.get(1);
//		int o3 = al.get(2);
//		
//		int result = o1 + o2 + o3;
//		System.out.println(result);
		
		int result = 0;
//		for (int i = 0; i < al.size(); ++i) {
		
		for(int element : al) {
			int temp = element;
			result += temp;
		}
		System.out.println(result);
			
//			
//			int result = o1 + o2 + o3;
//			System.out.println(result);
//			
//		}
		
		
		
		
		
	}
}
