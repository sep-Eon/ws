package chap05loop;

public class LoopTest {
	
	//�ݺ���
	
	/*
	 * for
	 * while
	 * for -while
	 *  
	 * break : ���� �ݺ��� Ż��
	 * continue : ���� �ݺ��� ó������ �̵�
	 * 
	 */
	
	// for
	// n�� "hello world" ���
	public void test() {
		
		int n = 3;
		
		for (int i = 0; i < n ; ++i) { //�ʱ��, ���ǽ�, ������
			System.out.println("Hello World");
		}
	}

	// n�� "hello world" ���
	public void test2() {
		
	int n = 5;
	int i = 0;
	
	while (i<n) {
		System.out.println("Hello World");
		++i;		
	}
	}
	
	
	//do-while
	//n�� hello world���
	public void test3() {
		
		int n = 7;
		int i = 0;
		
		do { //������
		System.out.println("Hello World");
		++i;
		}while(i<n); //���ǽ�
		
	}
	

}
