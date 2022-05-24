package test;

import java.io.BufferedWriter;
import java.util.Map.Entry;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		 * <String>
			1. ���ڿ� �ϳ� �����
			2. n��° ���� ����ϱ�
			3. n��° ���� m ��° ���ڿ� ����ϱ�
			4. "hello" ��� ���ڿ��� ������ Ȯ���ϱ�
			5. "abc" ��� ���ڿ��� �����ϰ� �ִ��� Ȯ���ϱ�
			6. �ش� ���ڿ��� ������ Ư�� ������ �ε��� �� �˾Ƴ���
			7. Ư�� ���ڿ��� �����ڷ� �Ͽ� ���ڹ迭 ����
		 */
		String st = "apple,baby,camp,body,lamp";
		System.out.println(st.substring(1));
		System.out.println(st.substring(1,3));
		System.out.println(st.equals("Hello"));
		System.out.println(st.charAt(2));
		String[] strArr = st.split(",");
		System.out.println(strArr[0]);
		
		/*
		 * <List>
			1. List Ÿ�� ��ü ����
			2. ���ڿ��� ���� �� �ֵ��� ����
			3. ������ �̸� n�� �ֱ�
			4. ��� ������ �̸� ����غ��� (�ݺ�������)
			5. �� �� 3��° ������ �̸� ����غ���
			6. ������(�ڿ��� ù��°) ������ �̸� ����غ���
			7. �ڿ��� �ι�° ������ �̸� �����ϱ�

		 */
		List li = new ArrayList();
		List<String> list = new ArrayList<>();
		//���׸��� ��ü�� �ϴ� ��쵵 ����. <Person> ��
		list.add("��ȿ��");
		list.add("������");
		list.add("�ڻ��");
		
		for (String x : list) {
			System.out.print(x);
		}
		
		System.out.println(list.get(2));
		list.remove(list.size()-3);
		System.out.println(list);
		
		
		/*
		 * <Set>
			1. Set Ÿ�� ��ü ����
			2. ������ ������ �����ϱ�
			3. 10���� ���� �ֱ�
			4. ��� �� ����غ���
			5. ���� n�� �ش� ��ü�� ���ԵǾ� �ִ��� Ȯ���غ���
		 */
		
		Set set = new HashSet<Integer>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(60);
		
		//iterator
		Iterator<Integer> iter = set.iterator();
		
		iter.hasNext();
		
		while(iter.hasNext()) {
			int result = iter.next();
			System.out.println(result);
		}
		
		
		
		
		mmap();
		
			
		}
		/*
		 * <Map>
			1. Map Ÿ�� ��ü ����
			2. Map �� key�� ���ڿ�, value�� ���� �� �����ϱ�
			3. Map �� 5���� ���ڿ�-���� �� ������ �ֱ�
			4. Ư�� key�� value ������ ����غ���
			5. ��� Ű �� Ȯ���غ��� (���)
			6. ��� value Ȯ���غ��� (���)
			7. ��� key - value �� Ȯ���غ��� (���)
		 */
		
		public static void mmap() {
			
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("�ϳ�", 1);
		map.put("��", 2);
		map.put("��", 3);
		map.put("��", 4);
		map.put("��", 5);
		
		int result = map.get("�ϳ�");
		System.out.println(result);
		
		Iterator<String> iter2 = map.keySet().iterator();
		
		while(iter2.hasNext()) {
			String k = iter2.next();
			System.out.println(k + " : ");
			System.out.println(map.get(k));
		}
		
		//���� ���
		
		Collection<Integer> vvv = map.values();
		System.out.println(vvv);
		
		/// keySet(), values(), entrySet()
		
		Set<Map.Entry<String, Integer>> es = map.entrySet();
		}
		
		Iterator<Map.Entry<String, Integer>> iter = es.iterator<Map.Entry>();
		
		while(iter.hasNext()) {
			Map.Entry<String, Integer> x = iter.next();
			System.out.println(x.getkey() + " : ");
			System.out.println(x.getValue());
		}
	}

	

