package conditional_codeup;

import java.util.Scanner;

public class codeup_1229 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하시오");
		int x = sc.nextInt();
		System.out.println("몸무게를 입력하시오");
		int y = sc.nextInt();
		
		double ave1 = (x-100);
		double ave2 = (((x-150)/2)+50);
		double ave3 = ((x-100)*0.9);
	
		
		if (x<150) {
			double result1 = ((y-ave1)*100)/ave1;
			
			if (result1>0 && result1<=10) {System.out.println("귀하의 비만도는" + result1 + "입니다. 따라서, 정상입니다.");}
			else if (result1>10&&result1<=20) {System.out.println("귀하의 비만도는" + result1 + "입니다. 따라서, 과체중입니다.");}
			else {System.out.println("귀하의 비만도는" + result1 + "입니다. 따라서, 비만입니다.");}
			
		}
		
		else if (x>=150&&x<160) {
			double result2 = ((y-ave2)*100)/ave2;
			
			if (result2>0 && result2<=10) {System.out.println("귀하의 비만도는" + result2 + "입니다. 따라서, 정상입니다.");}
			else if (result2>10&&result2<=20) {System.out.println("귀하의 비만도는" + result2 + "입니다. 따라서, 과체중입니다.");}
			else {System.out.println("귀하의 비만도는" + result2 + "입니다. 따라서, 비만입니다.");}
			
		}
		
		else  {
			double result3 = (((y-ave3)*100)/ave3);
			
			if (result3>0 && result3<=10) {System.out.println("귀하의 비만도는" + result3 + "입니다. 따라서, 정상입니다.");}
			else if (result3>10&&result3<=20) {System.out.println("귀하의 비만도는" + result3 + "입니다. 따라서, 과체중입니다.");}
			else {System.out.println("귀하의 비만도는" + result3 + "입니다. 따라서, 비만입니다.");}
		}
	}

}
