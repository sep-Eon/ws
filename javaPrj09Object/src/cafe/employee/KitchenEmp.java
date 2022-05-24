package cafe.employee;

public class KitchenEmp {
	
	//주방 직원
	/*
	    [주방 직원] => 메뉴얼(class)
		-닉네임
		-시급 : 10,000 
	    -음료 제조
		-음료 건네기
		  무한루프
	 */
	public String nick = "상언박";
	public int money;
	
	public void cook() {
		System.out.println("음료제조");
	}
	
	public void complete() {
		System.out.println("음료완성");}
	}
