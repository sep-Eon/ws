package com.kh.main;

public class Run {

	public static void main(String[] args) {
		
		
		/* 
		 * �ݺ��� (for, while, do-while)
		 *  + continue, break
		 *  continue : �ݺ����� ó������ ���ư�
		 *  break : �ݺ����� ��Ʈ��.
		 
		 * while ����
		 * while(���ǽ�) {������ ����}
		 * ���ǽ��� true�� ��쿡��, �߰�ȣ ��� ���� ���� ����
		 * ������ ���� �� ������ ������, ó������ ���ư�
		 
		 */
		
		//���ѹݺ�
		
//		while (true) {
//			System.out.println("hi");
//		}
//		
		int cnt = 0; // �ʱ��
 	    while (cnt<10) { //���ǽ�
			System.out.println("hi"); 
			cnt = cnt+1; //������
			}
		
		/*
		 *  for ����
		 *  for(�ʱ��;���ǽ�;������) {������ ����}
		 *  
		 */
		
		//for
		
		for(int i = 0; i < 10; i=i+1) {
			System.out.println("hi");
		}
		
		/*
		 * do-while ����
		 * 
		 * do{������ ����} while(���ǽ�);
		 * 
		 * �ϴ� ����, �� ���� �˻�
		 * (�� ���� ������ ����)
		 * 
		 */
		
		int x = 3; //�ʱ��
		do {
			System.out.println("bye");
			x = x+1; // ������
		}while(x<10); //���ǽ�
		
}
	
}
