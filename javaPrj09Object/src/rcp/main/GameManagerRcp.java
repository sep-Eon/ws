package rcp.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerRcp {
	
	public final String gamaname = "����������";
	
	public void gamestart() {
		System.out.println("���ӽ���");
		
		//���������� ����
		
		
		//��ǻ�� �� ����
		
		
		int comNum = new Random().nextInt(3) + 1; 
		// nextInt(3) = 0<=x<3 �̹Ƿ�, (0,1,2)+1 = 1,2,3
		String com = " ";
			
			switch(comNum) {
			
			case 1 : com = "����"; break;
			case 2 : com = "����"; break;
			case 3 : com = "��"; break;
			default : System.out.println("error!!!");
			}
			
			System.out.println("����, ����, �� �� �ϳ��� �Է��Ͻÿ�.");
		
			//����� �Է�
			Scanner sc = new Scanner(System.in);
			String user = sc.nextLine();
			
			//��ǻ��, ����� �� ���
			System.out.println("com : " + com);
			System.out.println("user : " + user);
			//�Ǵ�
			//���ڿ� ���� ���Ϸ���, ���ڿ�.equals(���ڿ�);
			if(com.equals("����")) {
				if(user.equals("����")) {
					System.out.println("draw");
				}
				else if (user.equals("����")) {
					System.out.println("����� ��");
				}
				else {System.out.println("��ǻ�� ��");}
				
			if(com.equals("����")) {
				if(user.equals("����")) {
					System.out.println("��ǻ�� ��");
				}
				else if (user.equals("����")) {
					System.out.println("draw");
				}
				else {System.out.println("����� ��");}
				
			if(com.equals("���ڱ�")) {
				if(user.equals("����")) {
					System.out.println("����� ��");
				}
				else if (user.equals("����")) {
					System.out.println("��ǻ�� ��");
				}
				else {System.out.println("draw");}
			}
			
			
			
		}
	}
	}
}
			

