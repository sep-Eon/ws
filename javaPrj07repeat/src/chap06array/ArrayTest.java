package chap06array;

public class ArrayTest {
	
	//�迭
	
	/*
	 * 1. �迭 ���� ���� : int[] a; // Ÿ��[] ������; 
	 * 2. �迭 ���� : new int[3]; // new Ÿ��[�迭�� ����];
	 * 3. �迭 ���� // a[0]; // ������[�ε���];
	 * 
	 * <�迭 �ʱ�ȭ> // �迭�� �����ϴ� ���ÿ� ���� �Ҵ�
	 * new int[]{1,2,3,4,5,6} // new Ÿ��[]{}
	 * {1,2,3,4,5}; 
	 * 
	 * 
	 * -�迭�� index�� 0���� ���۵ȴ�.
	 */
	public void test() {
		
		int []a ; //1.�迭 ����
		a = new int [3]; //2. �迭 ����
	
		//3. �迭�� �� ��ҿ� �����ϱ�
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	
	}
	
	//�ٸ� �迭 Ÿ�� (double)
	public void test2() {
		
		double []doubleArray ;
		doubleArray = new double [3];
		
		doubleArray[0] = 1.111;
		doubleArray[1] = 2.222;
		doubleArray[2] = 3.333;
		
		System.out.println(doubleArray[0]);
		System.out.println(doubleArray[1]);
		System.out.println(doubleArray[2]);
	}	
	
	// �迭 (StringŸ��)
	public void test3() {
		
		String[] strArr = new String[3];
		
		strArr[0]= "ù��°";
		strArr[1]= "�ι�°";
		strArr[2]= "����°";
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
		
		
	}
	}


