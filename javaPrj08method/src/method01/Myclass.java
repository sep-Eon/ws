package method01;

import java.util.Scanner;

public class Myclass {
	
	public void test() {
		System.out.println("�ȳ��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		judge(x);
		
		
	
}
	public void judge(int x) {
		
		//���� �Ǵ�
		if(x>0) {
			System.out.println("����Դϴ�");}
		else if (x<0) {
				System.out.println("�����Դϴ�.");}
				
		else {System.out.println("zero");}
		
		
	}
	
}
