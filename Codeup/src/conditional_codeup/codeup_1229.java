package conditional_codeup;

import java.util.Scanner;

public class codeup_1229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ű�� �Է��Ͻÿ�");
		int x = sc.nextInt();
		System.out.println("�����Ը� �Է��Ͻÿ�");
		int y = sc.nextInt();
		
		double ave1 = (x-100);
		double ave2 = (((x-150)/2)+50);
		double ave3 = ((x-100)*0.9);
	
		
		if (x<150) {
			double result1 = ((y-ave1)*100)/ave1;
			
			if (result1>0 && result1<=10) {System.out.println("������ �񸸵���" + result1 + "�Դϴ�. ����, �����Դϴ�.");}
			else if (result1>10&&result1<=20) {System.out.println("������ �񸸵���" + result1 + "�Դϴ�. ����, ��ü���Դϴ�.");}
			else {System.out.println("������ �񸸵���" + result1 + "�Դϴ�. ����, ���Դϴ�.");}
			
		}
		
		else if (x>=150&&x<160) {
			double result2 = ((y-ave2)*100)/ave2;
			
			if (result2>0 && result2<=10) {System.out.println("������ �񸸵���" + result2 + "�Դϴ�. ����, �����Դϴ�.");}
			else if (result2>10&&result2<=20) {System.out.println("������ �񸸵���" + result2 + "�Դϴ�. ����, ��ü���Դϴ�.");}
			else {System.out.println("������ �񸸵���" + result2 + "�Դϴ�. ����, ���Դϴ�.");}
			
		}
		
		else  {
			double result3 = (((y-ave3)*100)/ave3);
			
			if (result3>0 && result3<=10) {System.out.println("������ �񸸵���" + result3 + "�Դϴ�. ����, �����Դϴ�.");}
			else if (result3>10&&result3<=20) {System.out.println("������ �񸸵���" + result3 + "�Դϴ�. ����, ��ü���Դϴ�.");}
			else {System.out.println("������ �񸸵���" + result3 + "�Դϴ�. ����, ���Դϴ�.");}
		}
	}

}
