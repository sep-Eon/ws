package game;

import java.util.Scanner;

import utill.InputUtill;

public class GameManager {
	
	public void gameStart() {
		
		System.out.println("1:���ٿ����");
		System.out.println("2:������");
		System.out.println("3:��Ŀ");
		System.out.print(" ���� ��ȣ ���� ");
		
//		Scanner sc = new Scanner(System.in);
//		String gameNumStr = sc.nextLine();
//		int gameNum = Integer.parseInt(gameNumStr);
//		
		
		int gameNum = InputUtill.inputInt();
		
		switch(gameNum) {
		case 1: updownGameStart(); break;
		case 2: break;
		case 3: break;
		default : //error~
		}
	}
	
	private void updownGameStart() {
		System.out.println("1~100 ������ ���ڸ� �ϳ� ���ÿ�");
		//��ǻ�� �������� ����
		//���ٿ� ��, ��� ���
		//�Է¹ޱ�
		//���� ���ѹݺ� (���� �� ����)
		
		System.out.println("���� ����");
	
	}

}
