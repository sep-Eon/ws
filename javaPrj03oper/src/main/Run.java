package main;

public class Run {

	public static void main(String[] args) {
		
		/*
		 *  ������ (���, ��, ��)
		 *  
		 *  ��� : +, -, *, /, %
		 *  �� : ==, !=, >, <, >=, <=
		 *  �� : &&, ||, (= and, or)
		 */
		
		// 1.���
		
		int x,y;
		x = 10;
		y = 20;
		
		System.out.println(x+y); //30
		System.out.println(x-y); //-10
		System.out.println(x*y); //200
		System.out.println(x/y); // 0 �����Ⱑ �ƴ�. ���� ���ϴ� ������
		System.out.println(x%y); // 10, �������� ���ϴ� ������
		
		// 2.��
		
		// ==, !=, <, <=, >, >=
		
		//int x,y;
		//x = 10;
		//y = 20;
		
		System.out.println(x==y); // false
		System.out.println(x!=y); //true
		System.out.println(x<y); //true
		System.out.println(x<=y); //true
		System.out.println(x>y); //false
		System.out.println(x>=y); //false
		
		System.out.println(" x �� ����? " + x); 
		// String + int String ���� int�� String ���� �ٲ��� => x�� ���ڿ� 10�� ��
		
		
		System.out.println(" x == y? " + (x==y));
		//System.out.println(" x == y ? ");
		//System.out.println(x==y);
		
		System.out.println(" x != y? " + (x!=y));
		//System.out.println(" x != y ? ");
		//System.out.println(x!=y);
		
		
		// ��
		
		/*
		 * ���� ���ڴ� ? true
		 * ���� ���ڴ� ? false
		 * 
		 * ���� �ʵ��л��̴� ? false
		 * ���� �ʵ��л��� �ƴϴ� ? true
		 * 
		 * ���� ���ڸ鼭 �ʵ��л��̴� ? false
		 * ���� ���ڴ�. �Ǵ� ����̰� �ƴϴ�. true
		 */
		
		/*
		 *  T && T ? T
		 *  T && F ? F
		 *  F && T ? F
		 *  F && F ? F
		 *  
		 *  T||T ? T
		 *  T||F ? T
		 *  F||T ? T
		 *  F||F ? F
		 */
		
		
		
	}

}
