package practiceProblem02;

import java.util.Scanner;

public class Problem16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����(0), ����(1), ��(2) �߿� �ϳ��� �Է��Ͻÿ�.");
		
		int i = (int)(Math.random()*3);
		int userTryCnt = 0;
	    
	    
	    //����ġ ������ �ϴ� ����
	    //int win = 0; // ����ڰ� �¸��ϸ� 1�� �ٲ��ٰ���
		boolean isUserWin = false; //boolean�� true�� false�� ���� �� �ִ�.
		//�� ������ ! = not 
		
		while (!isUserWin) { //true�� �ٲ�, 
			
			int a = sc.nextInt();
			++userTryCnt;
			
			if (i==0) {
				
				System.out.println("��ǻ�� : ����");
				
				if (a==0) {
					System.out.println("����� : ����");
					System.out.println("���º��Դϴ�.");
					}
				else if (a==1) {
					System.out.println("����� : ����");
					System.out.println("����� �¸�");
					isUserWin = true;
					}
				else {
					System.out.println("����� : ��");
					System.out.println("��ǻ�� �¸�");
					}
			}
			
			if (i==1) {
				
				System.out.println("��ǻ�� : ����");
				
				if (a==0) {
					System.out.println("����� : ����");
					System.out.println("��ǻ�� �¸�");
					}
				else if (a==1) {
					System.out.println("����� : ����");
					System.out.println("���º��Դϴ�.");
					}
				else {
					System.out.println("����� : ��");
					System.out.println("����� �¸�");}
				    isUserWin = true;
			}
				
			if (i==2) {
				
				System.out.println("��ǻ�� : ��");
				
				if (a==0) {
					System.out.println("����� : ����");
					System.out.println("����� �¸�");
					isUserWin = true;
					}
				else if (a==1) {
					System.out.println("����� : ����");
					System.out.println("��ǻ�� �¸�");}
					
				
				else {
					System.out.println("����� : ��");
					System.out.println("���º��Դϴ�.");}
			}
			
	
			System.out.println("�����Ͻ� Ƚ���� " + userTryCnt + " ���Դϴ�. �����մϴ�.");

			}
	}
}


	


			
			
			
			
	  