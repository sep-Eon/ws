package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerMain {

	public static void main(String[] args) throws IOException {
		
		//서버
		int port = 12345;
		// 서버 소켓은 포트번호 필요
		ServerSocket ss =  new ServerSocket(port); 
		//==> ServerSocket이라는 생산자를 호출하여 12345라는 파라미터를 통하여 객체를 만듦.
		
		System.out.println("다른 소켓의 연결을 기다리는 중");
		// accept를 통해 '클라이언트'의 '소켓' 정보 얻음-> accept가 리턴함
		Socket cs = ss.accept(); 
		//ServerSocket안의 accept라는 메소드를 객체로 만든 후 socket이라는 변수에 넣는다.
		//수신 대기가 이뤄진다.
		//accept에선 쓰레드가 블락된다. => 연결이 될 때까지 기다리기 때문이다.
		//accept는 클라이언트의 소켓정보를 socket타입으로 리턴한다.
		
		InetAddress ip = cs.getInetAddress();
		
		System.out.println("연결된 클라이언트의 ip : " + ip);
	
		//Stream 얻기
//		InputStream is = cs.getInputStream();
//		//소켓이 연결된 후에도 스트림을 통해야 데이터를 주고받을 수 있다. // 1 byte씩 처리
//		InputStreamReader isr = new InputStreamReader(is); // 2byte씩 처리 가능
//		BufferedReader br = new BufferedReader(isr); //보조스트림으로 성능 향상
		//위와 똑같음
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
	
		//메시지 읽고, 출력하기
		String msg = br.readLine();
		System.out.println(msg);
		
		
		//사용한 자원 반납
		br.close();
	
	
	}

}
