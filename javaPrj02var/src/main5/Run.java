package main5;

public class Run {

	public static void main(String[] args) {
		
		/*
		 *  변수 (논리형)
		 *  
		 *  boolean
		 *  
		 */
		
		boolean t = true;
		boolean f = false;
		
		System.out.println(t);
		System.out.println(f);

		/*
		 * 변수명명규칙
		 * 대소문자가 구별되며 길이에 제한이 없다.
		 * -예약어(keyword)를 쓸 수 없음
		 * -숫자로 시작하면 안된다.
		 * -특수문자느 '_'와 '$'만 허용된다.
		 * 알아볼 수 있게, 가독성 좋게, 의미가 명확하게
		 */
		
		int studentAge = 20; // camelCase (띄어쓰기를 없애고 대문자로 표현)
		System.out.println(studentAge);
		
		//클래스명 PascalCase로 작성 (시작은 대문자, 띄어쓰기 때도 대문자)
		// snake_case
		// 퀘밥-case
	}

}
