package practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {
		/*
		 * �� (month)�� �Է¹ް�, �ش� ���� ������ ����ϱ�
		 * 12,1,2 : winter
		 * 3,4,5 : spring
		 * 6,7,8 : summer
		 * 9,10,11 : fall
		 */
		
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if (month == 12 || month == 1 || month == 2) {System.out.println("winter");}
		else if (month == 3 || month == 4 || month == 5) {System.out.println("spring");}
		else if (month == 6 || month == 7 || month == 8) {System.out.println("summer");}
		else if (month == 9 || month == 10 || month == 11) {System.out.println("fall");}
		
		
		// switch ��� ����
		
		switch(month) {
		case 12 : 
		case 1 : 
		case 2 : System.out.println("winter");break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println("spring");break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println("summer");break;
		case 9 :
		case 10 : 
		case 11 : System.out.println("fall");break;
		default : System.out.println("�ش� ���� �������� �ʽ��ϴ�.");

		}

	}

}
