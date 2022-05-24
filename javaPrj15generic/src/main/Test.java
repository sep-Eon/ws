package main;

import java.util.*;

public class Test {

	/*
	 * 제네릭
	 * - (특히 컬렉션) 타입 제한을 위해 사용함 
	 * 예시 : List<String> = new ArrayList<String>();
	 * List<String> = new ArrayList<>();
	 */
	
	public void test() {
		
		List<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		
		
		//리스트에 있는 모든 데이터 더한 값 출력
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
