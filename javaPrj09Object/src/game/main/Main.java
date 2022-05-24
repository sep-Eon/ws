package game.main;

import java.util.Scanner;

import rcp.main.GameManagerRcp;
import updown.main.GameManagerUpDown;

public class Main {

	public static void main(String[] args) {

		

		//��ĳ�� Class ���� �̿��Ͽ� ��ü ���� �� sc��� ������ �Ҵ�
		Scanner sc = new Scanner(System.in);
		
		
		// ����(���ӸŴ���) ä�� (��ü �غ� == ��ü �̸� �����س���)
		
		GameManagerUpDown gmUpDown = new GameManagerUpDown();
		GameManagerRcp gmRcp = new GameManagerRcp();
		
		
		System.out.println("1: updown");
		System.out.println("2: rcp ");
	
	
		int input = sc.nextInt();
		
		if (input==1) {
			gmUpDown.GameStart();
		}
		
		else if(input==2) {
			gmRcp.gamestart();
		}
		else { System.out.println("�����Դϴ�. 1,2 �� �ٽ� �Է��ϼ���."); }

}
}
