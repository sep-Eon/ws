package main;

import practice.MyClass01;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("Run Ŭ������ main �޼ҵ� ȣ���");
		System.out.println("===============");
		
		
		
		//��ü ���� (MyClass01 Ŭ���� ���� �̿��Ͽ� ��ü����)
		
//		MyClass01 mc01 = new MyClass01(); // ������ : ��ü ����, ���� : Ÿ���� myClass01, mc01�̶�� ������ �Ҵ�
//		// ������ Ÿ���� MyClass01�̶�� Ÿ����. int, String� ���� �� ����
//		// Ŭ����=Ÿ�� == Ŭ���� ���� = Ÿ���� ����,
//		
//		mc01.myMethod01();
//		mc01.myMethod02();
		
		//��ü�� �޼ҵ� ȣ�� (MyCalss01 Ŭ���� ������ myMethod01 ȣ��)
		
	
		//�迭�� ��� �ϳ��� ��ü��
		// new Ÿ�� => ��ü ����
		
		
		MyClass01 mc = new MyClass01();
		mc.name = " �ڻ��";
		mc.age = 27;
		mc.introduce();
		
		
		
		
		
		
		
		//��ü (== object == instance)
		// class �� instanceȭ �Ͽ� ��ü�� ������ => class�� ��ü�� ������
		
		//class : �ؾ Ʋ
		//��ü : �ؾ => Ŭ���� ���ؼ� �������
		
		//class : ���赵
		//class : ���赵�� �̿��Ͽ� ������� ��ǰ
		
		/*
		 * ī�� �Ƹ�����Ʈ
		 * 
		 * <���� ����>
		 * 1. �մ� ����
		 * 2. �ֹ� ����
		 * 2-1 (�ֹ���� ����, �Ʒ� ���� �������� ����)
		 * 3. ���
		 * 3-1 (�ܾ׺���)
		 * 4. ���� ����
		 * 5. ���� ���
		 */
		
		/*
		 * <��ü ����>
		 * [ī���� ����] => �޴��� (class) => ��� (method) + data (variable)
		 * -�г��� =>  data(variable)
		 * -�ñ� : 9,000 => data (variable)
		 * 
		 * - �ֹ��޴� ��� (method)
		 * - ��� ��� (method)
		 * - ���� �ǳױ� (method)
		 * ���ѷ��� (������ ������ ��� �����ϰ� ��)
		 * 
		 * [�ֹ� ����] => �޴���(class)
		 * -�г���
		 * -�ñ� : 10,000 
		 * 
		 * -���� ����
		 * -���� �ǳױ�
		 * ���ѷ���
		 * 
		 * ���� = ��ü
		 */
		
		
		//��ü�� �����Ϸ���
		//���� ��ü�� �ٷ����
		
		/*
		 * Scanner sc = new Scanner(System.in);
			sc.nextInt();

			= �����ʺ��� �ؼ�
			new ���ο� ����
			Scanner ��ĳ�ʶ� class�� �̿� => Scanner ��ü�� ���� 
			sc�� ��Ƶ�.
			
			sc.nextInt();
			sc�� ���ؼ� nextInt��� �޼ҵ带 ȣ��

		 */
		
		/*
		 * �������� vs ��ü����
		 * 
		 */

	}

}
