package Practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {
		// 1403
		
		//k���� ���ڸ� �Է¹ް� �� ���ڵ��� �ι� ����Ͻÿ�. 
		
		/*
		 * 1.k�Է� �޾� k���� ���ڸ� ���� �� �ִ� �޸��� �غ�
		 * 2. ���� ��� �޸��忡 k�� ����
		 * 3. �޸����� i ��° ��� �б� (��, i : 0~k-1)
		 * 4. k������ �ҷ��� ���ڵ��� �� ���� ����ϱ�
		 */

		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int a[] = new int[k] ;
		
		for (int i = 0; i < k; ++i) {
			
			a[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < k; ++i) {
			
			System.out.println(a[i]);
			System.out.println(a[i]);
		
		}
		
		
		
		
		
		
	}

}
	

