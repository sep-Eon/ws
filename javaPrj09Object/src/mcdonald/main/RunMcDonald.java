package mcdonald.main;

import mcdonald.emp.CookEmp;
import mcdonald.emp.CounterEmp;
import mcdonald.emp.RiderEmp;

public class RunMcDonald {

	public static void main(String[] args) {
		
		System.out.println("====�Ƶ�����====");
		
		//��ü���� �̿��Ͽ� ���α׷���
		// ��ü �̸� ����
		CounterEmp counter01 = new CounterEmp();
		CookEmp cook01 = new CookEmp();
		RiderEmp rider01 = new RiderEmp();
		
		//�ֹ�=>�丮=>���
		
		String burger = counter01.order();
		cook01.cook(burger);
		rider01.delivery(burger);
		
		

	}

}
