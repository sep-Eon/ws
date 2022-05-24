package machine;

import java.util.Random;
import java.util.Scanner;

public class Machine {
	
	//22.04.25
	
	Scanner sc = new Scanner(System.in);
	
	public Machine(String userId) {
		this.userId = userId;
		MachineslotText();
	}
	
	private String userId; //아이디
	private int cnt; //점수
	
	public String getUserId() {return this.userId;} //getter
	public void setUserId(String userId) {this.userId = userId;} //setter

	public int getCnt() {return this.cnt;} //getter
	
	public void MachineslotText() {
		
		System.out.println("슬롯머신을 실행합니다.");
		System.out.println("=================================");
		System.out.println("===="+userId+"님 반갑습니다.=====");
		System.out.println("====지금부터 슬롯머신을 시작합니다.====");
		System.out.println("=================================");
		System.out.println("컴퓨터의 난수를 생성하여 3개의 슬롯에 랜덤한 결과를 출력합니다");
		System.out.println("각각의 슬롯은 딸기, 사과, 배, 수박, 메론, 체리");
		System.out.println("총 6가지 과일과 숫자 7로 이루어져 있습니다.");
		System.out.println("변형된 룰을 적용하여, 두가지 과일이 같으면 5점");
		System.out.println("세가지 과일이 같으면 10점, 7이 세 개 나오면 30점을 드립니다.");
		System.out.println("한 게임당 최대 5번의 기회가 주어집니다. 좋은 점수를 획득하시길 바랍니다.");
		System.out.println("================================ ");
		
		Machineslot();
	}

	
	
	public void Machineslot() {
		
		this.cnt = 0;
		
		
		for (int i = 1; i<6; ++i) {
			
			
			System.out.println("게임을 계속 하시려면 아무 키나 입력하십시오.");
			System.out.println("게임을 종료하시려면 대소문자 상관없이 N을 입력하십시오.");
			
			String restart = sc.nextLine();
			if (restart.equals("N")) {
				System.out.println("종료 되었습니다. 지금까지 점수" + cnt + " 점입니다.");
				System.out.println("이용해주셔서 감사합니다.");
				break;}
			else if (restart.equals("n")) {
				System.out.println("종료 되었습니다. 지금까지 점수" + cnt + " 점입니다.");
				System.out.println("이용해주셔서 감사합니다.");
				break;}
			
			System.out.println("===============");
			System.out.println(i + "번째 도전입니다.");
			System.out.println("===============");
		
		Random randomObject = new Random();
		int first = randomObject.nextInt(1000);
		int second = randomObject.nextInt(1000);
		int third = randomObject.nextInt(1000);
		
		if(first>=0&&first<=1000) {
			
			//~150 딸기
			if(first<=150&&first>=0) {
					if(second<=150&&second>=0) {
							if(third<=150&&third>=0) {
								System.out.println("첫번째 슬롯 ::: 딸기");
								System.out.println("두번째 슬롯 ::: 딸기");
								System.out.println("세번째 슬롯 ::: 딸기");
								System.out.println("**축하드립니다! 10점 획득했습니다.");
								cnt = cnt + 10;}
							else if(third<=300&&third>150) {
								System.out.println("첫번째 슬롯 ::: 딸기");
								System.out.println("두번째 슬롯 ::: 딸기");
								System.out.println("세번째 슬롯 ::: 사과");
								System.out.println("5점 획득했습니다.");
								cnt = cnt + 5;}
							else if(third<=450&&third>300) {
								System.out.println("첫번째 슬롯 ::: 딸기");
								System.out.println("두번째 슬롯 ::: 딸기");
								System.out.println("세번째 슬롯 ::: 배");
								System.out.println("5점 획득했습니다.");
								cnt = cnt + 5;}
							else if(third<=600&&third>450) {
								System.out.println("첫번째 슬롯 ::: 딸기");
								System.out.println("두번째 슬롯 ::: 딸기");
								System.out.println("세번째 슬롯 ::: 수박");
								System.out.println("5점 획득했습니다.");
								cnt = cnt + 5;}
							else if(third<=750&&third>600) {
								System.out.println("첫번째 슬롯 ::: 딸기");
								System.out.println("두번째 슬롯 ::: 딸기");
								System.out.println("세번째 슬롯 ::: 메론");
								System.out.println("5점 획득했습니다.");
								cnt = cnt + 5;
							}
							else if(third<=900&&third>750) {
								System.out.println("첫번째 슬롯 ::: 딸기");
								System.out.println("두번째 슬롯 ::: 딸기");
								System.out.println("세번째 슬롯 ::: 체리");
								System.out.println("5점 획득했습니다.");
								cnt = cnt + 5;
							}
							else {System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 7");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;}
							}
					else if(second<=300&&second>=150) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 사과");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 사과");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 사과");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 사과");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 사과");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 사과");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 사과");
							System.out.println("세번째 슬롯 ::: 7");
							System.out.println("획득한 점수 없습니다.");
						}
					}
					else if(second<=450&&second>=300) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 배");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 배");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 배");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 배");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 배");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 배");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 배");
							System.out.println("세번째 슬롯 ::: 7");
							System.out.println("획득한 점수 없습니다.");
						}
					}
					else if(second<=600&&second>=450) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 수박");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 수박");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 수박");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 수박");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 수박");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 수박");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 수박");
							System.out.println("세번째 슬롯 ::: 7");
							System.out.println("획득한 점수 없습니다.");
						}
					}
					else if(second<=750&&second>=600) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 메론");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 메론");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 메론");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 메론");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 메론");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 메론");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 메론");
							System.out.println("세번째 슬롯 ::: 7");
							System.out.println("획득한 점수 없습니다.");
						}
					}
					else if(second<=900&&second>=750) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 체리");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 체리");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 체리");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 체리");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 체리");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 체리");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
						}
						else {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 체리");
							System.out.println("세번째 슬롯 ::: 7");
							System.out.println("획득한 점수 없습니다.");
						}
					}
					
					else { 
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 7");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 7");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 7");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 7");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 7");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 7");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {
							System.out.println("첫번째 슬롯 ::: 딸기");
							System.out.println("두번째 슬롯 ::: 7");
							System.out.println("세번째 슬롯 ::: 7");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
						}
					}
					}
			
			//~300 딸기
			
			
			else if(first<=300&&first>=150) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 사과");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 사과");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
							}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 사과");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 사과");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 사과");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 사과");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 딸기");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
						}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("**축하합니다! 10점 획득했습니다.");
						cnt = cnt + 10;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 사과");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 딸기");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
				}
				}
			
			// ~450 배
			else if(first<=450&&first>=300) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 배");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 배");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 배");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
						}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 배");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 배");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 배");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 딸기");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
						}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("**축하드립니다! 10점 획득했습니다.");
						cnt = cnt + 10;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 배");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
				}
				}
			
			//~600 수박
			
			
			else if(first<=600&&first>=450) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 수박");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
							}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 수박");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 수박");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 수박");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 수박");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 수박");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 딸기");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
						}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 딸기");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 수박");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
				}
				}
			
			//메론
			else if(first<=750&&first>=600) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 메론");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득하였습니다.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 메론");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 메론");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 메론");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 메론");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 메론");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 딸기");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("**축하드립니다! 10점 획득하였습니다.");
						cnt = cnt + 10;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 메론");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
				}
				}
			
			//~900체리
			else if(first<=900&&first>=750) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 체리");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 체리");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 체리");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 체리");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 체리");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 체리");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;
						}
						else {System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 딸기");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("획득한 점수 없습니다.");
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("** 축하드립니다! 10점 획득하였습니다.");
						cnt = cnt + 10;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 체리");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
				}
				}
			
			//777
			else {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("첫번째 슬롯 ::: 7");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 딸기");
							System.out.println("5점 획득했습니다.");
							cnt = cnt + 5;}
						else if(third<=300&&third>150) {
							System.out.println("첫번째 슬롯 ::: 7");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 사과");
							System.out.println("획득한 점수 없습니다.");}
						else if(third<=450&&third>300) {
							System.out.println("첫번째 슬롯 ::: 7");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 배");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=600&&third>450) {
							System.out.println("첫번째 슬롯 ::: 7");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 수박");
							System.out.println("획득한 점수 없습니다.");
							}
						else if(third<=750&&third>600) {
							System.out.println("첫번째 슬롯 ::: 7");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 메론");
							System.out.println("획득한 점수 없습니다.");
						}
						else if(third<=900&&third>750) {
							System.out.println("첫번째 슬롯 ::: 7");
							System.out.println("두번째 슬롯 ::: 딸기");
							System.out.println("세번째 슬롯 ::: 체리");
							System.out.println("획득한 점수 없습니다.");
						}
						else {System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 딸기");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 사과");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 배");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 수박");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("획득한 점수 없습니다.");
					}
					else {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 메론");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("획득한 점수 없습니다.");
						
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("획득한 점수 없습니다.");
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 체리");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println("5점 획득하였습니다.");
						cnt = cnt + 5;
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 딸기");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 사과");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 배");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 수박");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 메론");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 체리");
						System.out.println("5점 획득했습니다.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("첫번째 슬롯 ::: 7");
						System.out.println("두번째 슬롯 ::: 7");
						System.out.println("세번째 슬롯 ::: 7");
						System.out.println(" 777!! 축하드립니다! 30점 획득하셨습니다! ");
						cnt = cnt + 30;
						}
					}
				}
			}	
		}
		System.out.println("===================");
		System.out.println("프로그램이 종료되었습니다.");
		System.out.println("이용해주셔서 감사합니다.");
		System.out.println(userId+"님이 획득하신 총 점수는");
		System.out.println(cnt + "점 입니다.");
		System.out.println("===================");
	}
}


			

		
		
	
	
	

