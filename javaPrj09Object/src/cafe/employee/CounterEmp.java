package cafe.employee;

public class CounterEmp {

	//카운터 직원
	/*
	     [카운터 직원] => 메뉴얼 (class) => 기능 (method) + data (variable)
		 -닉네임 =>  data(variable)
		 -시급 : 9,000 => data (variable)
		 - 주문받는 기능 (method)
		 - 계산 기능 (method)
	     - 음료 건네기 (method)
	      무한루프 (각자의 역할을 계속 수행하게 함)
	 */
	
	public String nick = "박상언";
	public int money;
	
	public void order() {
		System.out.println("주문 받기");
	}
	
	public void calc() {
		System.out.println("계산하기");
	}
}

