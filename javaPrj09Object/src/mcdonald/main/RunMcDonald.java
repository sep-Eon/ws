package mcdonald.main;

import mcdonald.emp.CookEmp;
import mcdonald.emp.CounterEmp;
import mcdonald.emp.RiderEmp;

public class RunMcDonald {

	public static void main(String[] args) {
		
		System.out.println("====맥도날드====");
		
		//객체들을 이용하여 프로그래밍
		// 객체 미리 생성
		CounterEmp counter01 = new CounterEmp();
		CookEmp cook01 = new CookEmp();
		RiderEmp rider01 = new RiderEmp();
		
		//주문=>요리=>배달
		
		String burger = counter01.order();
		cook01.cook(burger);
		rider01.delivery(burger);
		
		

	}

}
