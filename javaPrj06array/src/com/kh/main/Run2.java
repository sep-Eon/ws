package com.kh.main;

public class Run2 {

	public static void main(String[] args) {
		
		//������ �迭
		
		//2���� �迭
		int[][]a = new int[3][3];
		
		//�迭�� ����
		
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		
		a[1][0] = 4;
		a[1][1] = 5;
		a[1][2] = 6;
		
		a[2][0] = 7;
		a[2][1] = 8;
		a[2][2] = 9;
		
		//�迭 ���
		
		
		for (int x = 0; x < 3; ++x) {
			for (int y = 0; y < 3; ++y) {
				System.out.println(a[x][y]);
			}
		}
//		
//	System.out.println(a[0][0]);
//	System.out.println(a[0][1]);
//	System.out.println(a[0][2]);
//	
//	System.out.println(a[1][0]);
//	System.out.println(a[1][1]);
//	System.out.println(a[1][2]);
//	
//	System.out.println(a[2][0]);
//	System.out.println(a[2][1]);
//	System.out.println(a[2][2]);
	

	}
}