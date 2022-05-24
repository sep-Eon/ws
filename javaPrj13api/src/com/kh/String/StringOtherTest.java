package com.kh.String;

public class StringOtherTest {
	
	//문자열 관련 3가지
	
	// 1. String
	// 2. StringBuffer
	// 3. StringBuilder
	
	public void test() {
		//String
		String str = new String("zzz");
		String str2 = "zzz"; // String만 가능, StringBuffet, StringBuilder 불가능
		str += "123"; ///zzz123
		
	}
	public void test2() {
		//StringBuffer
		
		StringBuffer sb = new StringBuffer("buffer~~~ ");
		System.out.println(sb);
//		sb += "123"; 스트링버퍼에선 이런식으로 추가 불가능
		sb.append("123"); //append 메소드를 통해서만 가능
		System.out.println(sb);
		
		
		//thread safe
		//thread == 실행될 때 실질적으로 일하는 일꾼
		
	}
	
	public void test3() {
		//StringBuilder
		StringBuilder sbd = new StringBuilder("builder~~");
		sbd.append("123");
		//앞에다 추가하고 싶으면 sbd.insert(0, "문자열") 사용
		System.out.println(sbd);
		
		//thread unsafe
		
	}

}
