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
	
	private String userId; //���̵�
	private int cnt; //����
	
	public String getUserId() {return this.userId;} //getter
	public void setUserId(String userId) {this.userId = userId;} //setter

	public int getCnt() {return this.cnt;} //getter
	
	public void MachineslotText() {
		
		System.out.println("���Ըӽ��� �����մϴ�.");
		System.out.println("=================================");
		System.out.println("===="+userId+"�� �ݰ����ϴ�.=====");
		System.out.println("====���ݺ��� ���Ըӽ��� �����մϴ�.====");
		System.out.println("=================================");
		System.out.println("��ǻ���� ������ �����Ͽ� 3���� ���Կ� ������ ����� ����մϴ�");
		System.out.println("������ ������ ����, ���, ��, ����, �޷�, ü��");
		System.out.println("�� 6���� ���ϰ� ���� 7�� �̷���� �ֽ��ϴ�.");
		System.out.println("������ ���� �����Ͽ�, �ΰ��� ������ ������ 5��");
		System.out.println("������ ������ ������ 10��, 7�� �� �� ������ 30���� �帳�ϴ�.");
		System.out.println("�� ���Ӵ� �ִ� 5���� ��ȸ�� �־����ϴ�. ���� ������ ȹ���Ͻñ� �ٶ��ϴ�.");
		System.out.println("================================ ");
		
		Machineslot();
	}

	
	
	public void Machineslot() {
		
		this.cnt = 0;
		
		
		for (int i = 1; i<6; ++i) {
			
			
			System.out.println("������ ��� �Ͻ÷��� �ƹ� Ű�� �Է��Ͻʽÿ�.");
			System.out.println("������ �����Ͻ÷��� ��ҹ��� ������� N�� �Է��Ͻʽÿ�.");
			
			String restart = sc.nextLine();
			if (restart.equals("N")) {
				System.out.println("���� �Ǿ����ϴ�. ���ݱ��� ����" + cnt + " ���Դϴ�.");
				System.out.println("�̿����ּż� �����մϴ�.");
				break;}
			else if (restart.equals("n")) {
				System.out.println("���� �Ǿ����ϴ�. ���ݱ��� ����" + cnt + " ���Դϴ�.");
				System.out.println("�̿����ּż� �����մϴ�.");
				break;}
			
			System.out.println("===============");
			System.out.println(i + "��° �����Դϴ�.");
			System.out.println("===============");
		
		Random randomObject = new Random();
		int first = randomObject.nextInt(1000);
		int second = randomObject.nextInt(1000);
		int third = randomObject.nextInt(1000);
		
		if(first>=0&&first<=1000) {
			
			//~150 ����
			if(first<=150&&first>=0) {
					if(second<=150&&second>=0) {
							if(third<=150&&third>=0) {
								System.out.println("ù��° ���� ::: ����");
								System.out.println("�ι�° ���� ::: ����");
								System.out.println("����° ���� ::: ����");
								System.out.println("**���ϵ帳�ϴ�! 10�� ȹ���߽��ϴ�.");
								cnt = cnt + 10;}
							else if(third<=300&&third>150) {
								System.out.println("ù��° ���� ::: ����");
								System.out.println("�ι�° ���� ::: ����");
								System.out.println("����° ���� ::: ���");
								System.out.println("5�� ȹ���߽��ϴ�.");
								cnt = cnt + 5;}
							else if(third<=450&&third>300) {
								System.out.println("ù��° ���� ::: ����");
								System.out.println("�ι�° ���� ::: ����");
								System.out.println("����° ���� ::: ��");
								System.out.println("5�� ȹ���߽��ϴ�.");
								cnt = cnt + 5;}
							else if(third<=600&&third>450) {
								System.out.println("ù��° ���� ::: ����");
								System.out.println("�ι�° ���� ::: ����");
								System.out.println("����° ���� ::: ����");
								System.out.println("5�� ȹ���߽��ϴ�.");
								cnt = cnt + 5;}
							else if(third<=750&&third>600) {
								System.out.println("ù��° ���� ::: ����");
								System.out.println("�ι�° ���� ::: ����");
								System.out.println("����° ���� ::: �޷�");
								System.out.println("5�� ȹ���߽��ϴ�.");
								cnt = cnt + 5;
							}
							else if(third<=900&&third>750) {
								System.out.println("ù��° ���� ::: ����");
								System.out.println("�ι�° ���� ::: ����");
								System.out.println("����° ���� ::: ü��");
								System.out.println("5�� ȹ���߽��ϴ�.");
								cnt = cnt + 5;
							}
							else {System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: 7");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;}
							}
					else if(second<=300&&second>=150) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ���");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ���");
							System.out.println("����° ���� ::: ���");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ���");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ���");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ���");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ���");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ���");
							System.out.println("����° ���� ::: 7");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
					}
					else if(second<=450&&second>=300) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ��");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ��");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ��");
							System.out.println("����° ���� ::: ��");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ��");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ��");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ��");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ��");
							System.out.println("����° ���� ::: 7");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
					}
					else if(second<=600&&second>=450) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: 7");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
					}
					else if(second<=750&&second>=600) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: �޷�");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: �޷�");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: �޷�");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: �޷�");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: �޷�");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: �޷�");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: �޷�");
							System.out.println("����° ���� ::: 7");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
					}
					else if(second<=900&&second>=750) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ü��");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ü��");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ü��");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ü��");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ü��");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ü��");
							System.out.println("����° ���� ::: ü��");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
						}
						else {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ü��");
							System.out.println("����° ���� ::: 7");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
					}
					
					else { 
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: 7");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: 7");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: 7");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: 7");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: 7");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: 7");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: 7");
							System.out.println("����° ���� ::: 7");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
						}
					}
					}
			
			//~300 ����
			
			
			else if(first<=300&&first>=150) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ���");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ���");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ���");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
							}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ���");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ���");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ���");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ���");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
						}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ���");
						System.out.println("**�����մϴ�! 10�� ȹ���߽��ϴ�.");
						cnt = cnt + 10;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ���");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
				}
				}
			
			// ~450 ��
			else if(first<=450&&first>=300) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ��");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
						}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ��");
						System.out.println("**���ϵ帳�ϴ�! 10�� ȹ���߽��ϴ�.");
						cnt = cnt + 10;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
				}
				}
			
			//~600 ����
			
			
			else if(first<=600&&first>=450) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
							}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ����");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
						}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: ����");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
				}
				}
			
			//�޷�
			else if(first<=750&&first>=600) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: �޷�");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���Ͽ����ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: �޷�");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: �޷�");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: �޷�");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: �޷�");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: �޷�");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("**���ϵ帳�ϴ�! 10�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 10;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: �޷�");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
				}
				}
			
			//~900ü��
			else if(first<=900&&first>=750) {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: ü��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: ü��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: ü��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: ü��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: ü��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: ü��");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ü��");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;
						}
						else {System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: 7");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("** ���ϵ帳�ϴ�! 10�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 10;
					}
					else {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: ü��");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
				}
				}
			
			//777
			else {
				if(second<=150&&second>=0) {
						if(third<=150&&third>=0) {
							System.out.println("ù��° ���� ::: 7");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("5�� ȹ���߽��ϴ�.");
							cnt = cnt + 5;}
						else if(third<=300&&third>150) {
							System.out.println("ù��° ���� ::: 7");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ���");
							System.out.println("ȹ���� ���� �����ϴ�.");}
						else if(third<=450&&third>300) {
							System.out.println("ù��° ���� ::: 7");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ��");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=600&&third>450) {
							System.out.println("ù��° ���� ::: 7");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ����");
							System.out.println("ȹ���� ���� �����ϴ�.");
							}
						else if(third<=750&&third>600) {
							System.out.println("ù��° ���� ::: 7");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: �޷�");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else if(third<=900&&third>750) {
							System.out.println("ù��° ���� ::: 7");
							System.out.println("�ι�° ���� ::: ����");
							System.out.println("����° ���� ::: ü��");
							System.out.println("ȹ���� ���� �����ϴ�.");
						}
						else {System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;}
						}
				else if(second<=300&&second>=150) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ���");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
				}
				else if(second<=450&&second>=300) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ��");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
				}
				else if(second<=600&&second>=450) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ����");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
				}
				else if(second<=750&&second>=600) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: ü��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: �޷�");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
				}
				else if(second<=900&&second>=750) {
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
						
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ���");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ��");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ����");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("ȹ���� ���� �����ϴ�.");
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: ü��");
						System.out.println("����° ���� ::: 7");
						System.out.println("5�� ȹ���Ͽ����ϴ�.");
						cnt = cnt + 5;
					}
				}
				
				else { 
					if(third<=150&&third>=0) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=300&&third>150) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ���");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=450&&third>300) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=600&&third>450) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ����");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=750&&third>600) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: �޷�");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else if(third<=900&&third>750) {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: ü��");
						System.out.println("5�� ȹ���߽��ϴ�.");
						cnt = cnt + 5;
					}
					else {
						System.out.println("ù��° ���� ::: 7");
						System.out.println("�ι�° ���� ::: 7");
						System.out.println("����° ���� ::: 7");
						System.out.println(" 777!! ���ϵ帳�ϴ�! 30�� ȹ���ϼ̽��ϴ�! ");
						cnt = cnt + 30;
						}
					}
				}
			}	
		}
		System.out.println("===================");
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		System.out.println("�̿����ּż� �����մϴ�.");
		System.out.println(userId+"���� ȹ���Ͻ� �� ������");
		System.out.println(cnt + "�� �Դϴ�.");
		System.out.println("===================");
	}
}


			

		
		
	
	
	

