package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		/*
		 * ���
		 * 
		 * 1. ���ǹ� ( if, switch )
		 * 2. �ݺ���
		 */
		
		// ���ǹ� (if, else, else~if) , (switch, case-break, default)
		// ���ǿ� ������ ���� �ϰ� ����
		/*
		 * if
		 * 
		 * ǥ���� :
		 * if(���ǽ�){������ ����}
		 * 
		 * ���ǽĿ� �� ������??
		 * > true / false�� ���� �� �ֵ��� �ۼ�
		 * 
		 */
		
		int userInput = 1;
		if(userInput == 1) {//������ǲ�� 1�̶� ���ٸ�
			System.out.println("«�� �ֹ� �Ϸ�");
		}
		
		if(userInput == 2) {//������ǲ�� 2�̶� ���ٸ�
			System.out.println("¥��� �ֹ� �Ϸ�");
		}
		
		
		// num�̶�� ������ �����
		// num ���� ������? ����Դϴ�. ���
		//num ���� 0 �̶��? zero �ⷰ
		// num ���� �������? �����Դϴ�. ���
		
		/*int num = 1;
		if(num > 0) {
			System.out.println("����Դϴ�.");
		}
		
		else { System.out.println("�����Դϴ�.");
			}
		
		//if(num < 0) {
		//System.out.println("�����Դϴ�.");
		
		
		/* 
		 * else : �� �ۿ�
		 * 
		 * ǥ����
		 * if (���ǽ�) {������ ����}
		 * else {������ ����}
		 * 
		 * else�� �տ��� if�� ����� ��쿡�� �� �� ����
		 */
		
//		int num = 1;
//	    if(num > 0) {
//			System.out.println("����Դϴ�.");
//		}
//		
//		else if(num < 0) {
//			System.out.println("�����Դϴ�.");
//		}
//		
//		else if(num == 0) {
//			System.out.println("0�Դϴ�.");
//		}
		
		/*
		 * else ~if
		 * 
		 * ǥ����
		 * if(���ǽ�) {������ ����}
		 * else if(���ǽ�) {������ ����}
		 * else if(���ǽ�) {������ ����} 
		 * *
		 * *
		 * (������ ��� ����)
		 * ���� if�ڵ尡 ������� ������ ��쿡�� else if �ڵ尡 ȿ���� ������.
		 * if�θ� �̷���� �ڵ�鿡 ���ؼ� ���� ȿ������.
		 * if (***)
		 * else if (&&&) <<���
		 * else if (aaa) <<���� else if�� ����Ͽ� �ڵ� �ߵ� x
		 * 
		 * ������ ������ ������.
		 * 
		 */
		
		
		/*
		 * switch(?) {
		 *   case ? : ���౸��;
		 *   case ? : ���౸��;
		 *   .
		 *   .
		 *   .
		 *   default : ���౸��;
		 * }
		 * 
		 */
		
		int x = 2;
		switch(x) {
		case 1 : System.out.println("��"); break; //�극��ũ �ʼ�!
		case 2 : System.out.println("��"); break;
		case 3 : System.out.println("��"); break;
		default : System.out.println("������ ����"); // else ���� ģ��, ���������� ����
		}
		
	}

}
