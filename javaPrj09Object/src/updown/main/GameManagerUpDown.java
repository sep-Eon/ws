package updown.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerUpDown {
	
	public final String gameName = "���ٿ�";
	
	//���� �ϳ� �ް�
	//���ٿ� ������ְ�
	//Ʋ���� �ٽ��ϰ�
	//���߸� �����Դϴ� ���ֱ�

	public void GameStart() {
		System.out.println(gameName + " ���� ����");
		
		
		//��������
		Random randomObject = new Random();
		int r = randomObject.nextInt(50);
		// == int r = new Random().nextInt(50); ��ü�� ����ȭ ���� �ʾƼ�
		// ��ȸ������ ���̰� ������.
		
		while(true) {
			
	    //�Է�
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		//���ٿ� �Ǵ�
		if (x<r) {System.out.println("up");}
		else if (x>r) {System.out.println("down");
		}
		else {System.out.println("�����Դϴ�."); break;}
		
		}
		
	}
	


}
