package utill;

import java.util.Scanner;

public class InputUtill {
	
	private static final Scanner sc = new Scanner(System.in);
	
	public static String inputStr() {
		String str = sc.nextLine();
		return str;
	}
	
	public static int inputInt() {
		String str = sc.nextLine();
		return Integer.parseInt(str);
	}
	
	public static double inputDouble() {
		String str = sc.nextLine();
		return Double.parseDouble(str);
	}

}
