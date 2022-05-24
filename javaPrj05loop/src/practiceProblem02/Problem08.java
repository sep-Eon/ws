package practiceProblem02;

import java.util.Scanner;

public class Problem08 {

	public static void main(String[] args) {
		//1208
		
		// 세 변의 길이 입력받기
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		//어떤 삼각형인지 출력
		
//		세 변의 길이가 같은 경우 : 정삼각형
//		두 변의 ㄱ리이가 같은 경우 : 이등변삼각형
//		a2 + b2 = c2일 경우 (피타고라스의 정리) : 직각삼각형
//		위의 조건에 맞지 않는 일반 삼각형 일 경우 : 삼각형
//		삼각형이 아닐 경우 : 삼각형 아님
		
			
 		if (x==y && y==z && x==z) {System.out.println("정삼각형");}
 		else if (x==y || x==z || y==z) {System.out.println("이등변 삼각형");}
 		else if ((x*x) + (y*y) == (z*z)) {System.out.println("직각 삼각형");}
 		else if (x+y>z) {System.out.println("삼각형");}
		else {System.out.println("삼각형 아님");}
 		
		

	}

}
