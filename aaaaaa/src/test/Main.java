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
			1. 문자열 하나 만들기
			2. n번째 문자 출력하기
			3. n번째 부터 m 번째 문자열 출력하기
			4. "hello" 라는 문자열과 같은지 확인하기
			5. "abc" 라는 문자열을 포함하고 있는지 확인하기
			6. 해당 문자열이 가지는 특정 문자의 인덱스 값 알아내기
			7. 특정 문자열을 구분자로 하여 문자배열 얻어내기
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
			1. List 타입 객체 생성
			2. 문자열만 담을 수 있도록 제한
			3. 연예인 이름 n명 넣기
			4. 모든 연예인 이름 출력해보기 (반복문으로)
			5. 그 중 3번째 연예인 이름 출력해보기
			6. 마지막(뒤에서 첫번째) 연예인 이름 출력해보기
			7. 뒤에서 두번째 연예인 이름 삭제하기

		 */
		List li = new ArrayList();
		List<String> list = new ArrayList<>();
		//제네릭은 객체로 하는 경우도 있음. <Person> 등
		list.add("박효신");
		list.add("윤찬우");
		list.add("박상언");
		
		for (String x : list) {
			System.out.print(x);
		}
		
		System.out.println(list.get(2));
		list.remove(list.size()-3);
		System.out.println(list);
		
		
		/*
		 * <Set>
			1. Set 타입 객체 생성
			2. 정수만 들어가도록 제한하기
			3. 10개의 정수 넣기
			4. 모든 값 출력해보기
			5. 정수 n이 해당 객체에 포함되어 있는지 확인해보기
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
			1. Map 타입 객체 생성
			2. Map 의 key는 문자열, value는 정수 로 제한하기
			3. Map 에 5개의 문자열-정수 쌍 데이터 넣기
			4. 특정 key로 value 꺼내서 출력해보기
			5. 모든 키 값 확인해보기 (출력)
			6. 모든 value 확인해보기 (출력)
			7. 모든 key - value 쌍 확인해보기 (출력)
		 */
		
		public static void mmap() {
			
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("하나", 1);
		map.put("둘", 2);
		map.put("삼", 3);
		map.put("넷", 4);
		map.put("오", 5);
		
		int result = map.get("하나");
		System.out.println(result);
		
		Iterator<String> iter2 = map.keySet().iterator();
		
		while(iter2.hasNext()) {
			String k = iter2.next();
			System.out.println(k + " : ");
			System.out.println(map.get(k));
		}
		
		//벨류 출력
		
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

	

