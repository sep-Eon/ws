package chap04if;

import java.util.Scanner;

public class IfTest {
	
	// ���ǹ�
	/*
	 * if, else-if, else
	 * switch
	 */
	
	// � ������ �������, ��������, 0���� �Ǵ��ϱ�
	public void test() {
		int x = 10;
		
		if (x>0) {System.out.println("���"); }
	    else if (x<0) {System.out.println("����"); }
		else {System.out.println("0"); }
		}
	
	
	//switch
	//��(month) x�� �Է¹ް� �ش� ���� ������ ���
	//(��, x�� ���� ����)
	
	public void test2() {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		switch(x) {
		
		case 12 : 
		case 1 : 
		case 2 : System.out.println("�ܿ�"); break;
		case 3 : 
		case 4 : 
		case 5 : System.out.println("��"); break;
		case 6 : 
		case 7 : 
		case 8 : System.out.println("����"); break;
		case 9 : 
		case 10 : 
		case 11 : System.out.println("����"); break;
		default : System.out.println("�׷� ��(month)�� �����ϴ�."); break;
		}
		
		
		
	}
			
	}
	


