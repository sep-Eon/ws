package cafe.main;

import cafe.employee.CounterEmp;
import cafe.employee.KitchenEmp;

public class Run {

	public static void main(String[] args) {

		System.out.println("cafe open~~");
		System.out.println("========");
		
		CounterEmp ce = new CounterEmp();
		KitchenEmp ke = new KitchenEmp();
		
		ce.order();
		ce.calc();
		ke.cook();
		ke.complete();
		
		System.out.println("ī�������� �г��� : " + ce.nick);
		System.out.println("�ֹ����� �г��� : " + ke.nick);
		
		/*
		 * int : 0
		    float : 0.0f
			char : '\0';
			boolean : false
			String : null // ���ڿ� == ���� �迭 // �迭 == ��ü // int[] == ��ü, char[] == ��ü
			������ : null
			String�� �˰��� Class
		 */
	}

}
