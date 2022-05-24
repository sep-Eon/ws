package conditional_codeup;

import java.util.Scanner;

public class codeup_1154 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x>y) {System.out.println(x-y);}
		else if (x<y) {System.out.println(y-x);}
		else {System.out.println("°°À½");}
		
	}

}
