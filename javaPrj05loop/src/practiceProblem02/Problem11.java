package practiceProblem02;

import java.util.Scanner;

public class Problem11 {

	public static void main(String[] args) {
		// 1256
		
		//별(*)을 n개 만큼 출력한다.
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if (1<=x&&x<=1000) {
		for (int i = 0; i < x; i++) {
			System.out.print("*" + " ");
		}
		

	}

}
	
}
