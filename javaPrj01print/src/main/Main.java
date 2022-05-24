package main;

public class Main {

	public static void main(String[] args) {
		
		//이스케이프 문자
		
		//1. 출력문을 이용하여 아래와 같이 출력하시오.
		// "안녕!"
		
//		System.out.println("\"안녕!\"");
//		System.out.println("안\n녕");
//		System.out.println("안\r녕");
//		System.out.println("안\t녕");
		
		
		// \== 이스케이프 문자
		
		//printf
		
		test();

	}
		
		//printf
		public static void test() {
			
			System.out.println("==== printf test====");
			System.out.printf("%s", "abc");
			System.out.println("");
			System.out.printf("%d", 10);
			System.out.println("");
			System.out.printf("%c", 'a');
			
		}

}
