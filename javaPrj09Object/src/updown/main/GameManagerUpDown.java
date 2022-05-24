package updown.main;

import java.util.Random;
import java.util.Scanner;

public class GameManagerUpDown {
	
	public final String gameName = "업다운";
	
	//정수 하나 받고
	//업다운 얘기해주고
	//틀리면 다시하게
	//맞추면 정답입니다 해주기

	public void GameStart() {
		System.out.println(gameName + " 게임 시작");
		
		
		//랜덤숫자
		Random randomObject = new Random();
		int r = randomObject.nextInt(50);
		// == int r = new Random().nextInt(50); 객체를 변수화 하지 않아서
		// 일회용으로 쓰이고 버려짐.
		
		while(true) {
			
	    //입력
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		//업다운 판단
		if (x<r) {System.out.println("up");}
		else if (x>r) {System.out.println("down");
		}
		else {System.out.println("정답입니다."); break;}
		
		}
		
	}
	


}
