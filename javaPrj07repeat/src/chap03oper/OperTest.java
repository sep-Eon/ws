package chap03oper;

public class OperTest {
	
	//������
	
	/*
	 * 1.���
	 * 2.��
	 * 3.��
	 */
	
	public void test() {
		//��� ������
		// +,-,*, /, %, =
		// ���� ���� => ����
		// 1+1 => 2
		
		System.out.println(1+1);
	}
	
	public void test2() {
		//�� ������
		// >, <, >=, <=, ==, !=
		// ���� ���� => ���� (T/F)
		// 1<9 => true
		
		System.out.println(1<2); // true
	}
	
	public void test3() {
		//�� ������
		// &&, ||, !(not, ���� ������)
		// �� �� => ���� (T/F)
		// true && false => false
		
		System.out.println(true&&false);
		
	}
	
	public void test4() {
		//���� ������
		// ? ;  (2����)
		int x;
		x = 1 < 2 ? 100 : -99;
		// ?�� ���� true��� �ݷ�(:) ���� �� ����
		// ?�� ���� false ��� �ݷ�(:) ������ �� ����
		System.out.println(x);
		
		
	}
		
	
	}


