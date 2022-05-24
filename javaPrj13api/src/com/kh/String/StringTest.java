package com.kh.String;

public class StringTest {
	
	public void test() {
		
		//charAt
		//"문자열"에서 특정 인덱스의 '문자'를 가져옴
		
		String s = "abcdefg";
		
		char ch = s.charAt(0);
		System.out.println("ch : " + ch);
		
	}
	
	public void test2() {
		//compareTo
		//사전순으로 정렬했을 때, 앞이면 음수, 
		//뒤면 양수로 비교해줌
		
		String s =  "a";
		String s2 = "b";
		int com = s.compareTo(s2);
		System.out.println(com);
		
	}
	
	public void test3() {
		//concat
		//문자열 합쳐줌 
		
		String s = "abc";
		String s2 = "ABC";
		
		String con = s.concat(s2);
		System.out.println(con);
	}
	
	public void test4() {
		//equals
		//문자열 같은지 비교
		
		String s = "abc";
		String s2 = "zzz";
		System.out.println(s.equals(s2));
	}
	
	public void test5() {
		//equalsIgnoreCase
		//문자열 같은지 비교 (대소문자 무시)
		
		String s = "abc";
		String s2 = "ABC";
		System.out.println(s.equalsIgnoreCase(s2));
	}
	
	public void test6() {
		//length
		//문자열의 길이를 정수값으로 리턴
		
		String s = "abc"; 
		System.out.println(s.length());
	}
	
	public void test7() {
		//replace
		//s.replace(old char,new char) 해당 문자를
		//특정 문자를 원하는 문자로 바꿔줌 (전부)
		
		String s = "aaabc123";
		String x = s.replace('a', 'b');
		System.out.println(x);
		System.out.println(s);
		
	}
	
	public void test8() {
		//substring
		//문자열의 특정 범위를 잘라냄
		// 시작~끝, 시작~특정지점
		
		//beginIndex(시작점)을 정수로 받아 그 이후부터 출력
		//5를 입력하여 5번 인덱스인 2 이후인 3,4,5가 출력됨
		// 두가지 숫자를 받을 경우, 2<= ? < 5 이런식으로 출력된다.
		
		String s = "abc12345";
//		String x = s.substring(5);
		String x = s.substring(2, 5);
		System.out.println(x);
		
	}
	
	public void test9() {
		//toUpperCase
		//소문자를 대문자로 바꿔줌
		
		String s = "abc123";
		String x = s.toUpperCase();
		System.out.println(x);
		
		String low = test10(x); // 대문자로 변경된 문자열을 test10에 전달
		System.out.println(low);
		
	}
	
	public String test10(String str) {
		//toLowerCase
		return str.toLowerCase();
	}

}
