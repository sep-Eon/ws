package method02;

public class Myclass02 {
	

	//�޼ҵ�(method)
	//==���нð� �Լ�
	
	/*
	 * �޼ҵ� �ۼ� ���
	 * ���������� ����Ÿ�� �޼ҵ��(�Ű�����) {������ ����, ���ϰ� �ִٸ� ���ϰ�}
	 * public int plusOne(int number) {number++; return number;}
	 * 
	 * -���ϰ��� ������? void��� �ۼ�
	 * -�Ű������� �ȹ޾Ƶ� �ǰ�, �������� �޾Ƶ� ��
	 */
	
	
	/*
	 * �޼ҵ� ����
	 * �޼ҵ� ���(== �޼ҵ� �ñ״�ó) �޼ҵ� �ٵ�
	 * -�޼ҵ��� ��带 ����, �Է°��� ���� �� ��ȯ���� ������ �� �� �ִ�.
	 */
	public void test() { //�޼ҵ� ���(�ñ״�ó)
 		System.out.println("�׽�Ʈ �޼ҵ� ����"); //�޼ҵ� �ٵ�
//		myMethod01();
//		plusTen(10);
//		System.out.println(getAge());
		//plusOne �޼ҵ带 ȣ���Ѵ�. (���� 10�� ����)
		//ȣ�� ���ؼ� ���Ϲ��� �� ����ϱ�
		
//		int result = plusOne(10);
//		System.out.println(result);
		
		System.out.println(calcCircle(10));
		
		System.out.println("�׽�Ʈ �޼ҵ� ����");
		
	}
	
	//�Ű������� ����, ���ϰ��� ���� �޼ҵ�
	public void myMethod01() {
		System.out.println("�ȳ� ���� ��¹��̾ߤ���");
	}
	
	//���� �ϳ� ���� �޾Ƽ�, �� ���ڿ� +10�ؼ� ����ϴ� �޼ҵ�
	//�Ű����� �ְ�, ���ϰ� ���� �޼ҵ�
	public void plusTen(int x) {
		x = x+10;
		System.out.println(x);
	}
	
	//���� ���̸� ��ȯ(return)�ϴ� �޼ҵ�
	public int getAge() {
		System.out.println("getAge �޼ҵ� ȣ���");
		return 20;
	}
	
	
	//���� �ϳ��� �Է¹ް�, +1�� ���� ����
	//�Ű�����(�Է¹޴� ��)�� �ְ�, ��ȯ�ϴ� ��(==return)�� �ִ� �޼ҵ�
	public int plusOne(int x) {
		x++;
		return x;
	}
	
	//�������� ���̸� �Է¹ް�, ���� ���̸� �����ϴ� �޼ҵ�
	//�Ű����� : ������
	//����Ÿ�� : ???
	//������ ���� : �������� �̿��� ���� ���
	
	public double calcCircle(int r) {
		double result = r * r * 3.14;
		return result;
	}

}
