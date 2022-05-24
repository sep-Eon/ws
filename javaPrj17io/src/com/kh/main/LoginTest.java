package com.kh.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginTest {
	
	private String path = "C:\\dev\\user.txt";
	private File f = new File(path); //파일 객체 생성
	private Scanner sc = new Scanner(System.in);
	
		public String[] inputuser() {
			
			System.out.print("ID : ");
			String id = sc.nextLine().trim(); // trim :: 문자열 공백 제거
			System.out.print("PWD : ");
			String pwd = sc.nextLine().trim(); // trim :: 문자열 공백 제거
			
			//String[] strArr = new String[2]
			//strArr[0]=id;
			//strArr[1]=pwd;
			//return;
			//은 아래와 같다.
			return new String[] {id,pwd};
		}
		
	//회원가입
		public void join() throws JoinException {
			System.out.println("====회원가입====");
			String[] strArr = inputuser();
			
			String id = strArr[0];
			String pwd = strArr[1];
			
			//아이디, 패스워드 중에 '/' 있으면 예외 발생시키기
			if(id.contains("/")||pwd.contains("/")) {
				//Exception!!!
				throw new JoinException();
			}
			
			//입력받은 데이터를 파일에 넣기
			String path = "C:\\dev\\user.txt";
			File f = new File(path);
			
			//스트림 생성
			BufferedWriter bw = null;
			try {
				bw =  new BufferedWriter(new FileWriter(f,true)); //true == append를 허용함. 기존값에 이어쓰기 가능
				bw.write(id);
				bw.write("/");
				bw.write(pwd);
				bw.write("\n");
				bw.flush();
			} catch (IOException e) {
				System.out.println("예외 발생!!!");
			} finally {
				try {bw.close();} catch (IOException e) {
					System.out.println("클로즈 에러 발생!!");
				}
			}
			
			
		}
	
	public void login() {
		//파일에서 아이디, 비번, 확인하여
		//로그인 가능 여부 판단하기
		
		//스트림 생성
		//try with resource 구문을 사용하면, close 처리 따로 필요없다.
		//(jdk 버전 확인하고 쓰기)
		
		
		System.out.println("===로그인 할 ID, PWD 입력하세요===");
		String[] strArr = inputuser();
		
		String id = strArr[0];
		String pwd = strArr[1];
		
		try (BufferedReader br = new BufferedReader(new FileReader(f))){
			
			//아이디 비번 읽기
			
			boolean isLoginSuccess = false;
			
			while (true) {
			String data = br.readLine(); // id/pwd
			
			//data가 null이라면? 파일 끝까지 다 읽은거임
			if(data == null) {
				break;
			}
			//읽어온 data에서 '/'문자의 인덱스 알아야함
			int index = data.indexOf('/'); // 슬래쉬까지 자르기 위해서 씀.
			String dataId = data.substring(0, index);
			String dataPwd = data.substring(index+1);

			
			//아이디 비번 판단하기
			if(id.equals(dataId) && pwd.equals(dataPwd)) {
				System.out.println(dataId + " 님 로그인 성공!");
				isLoginSuccess = true;
				break;
			}
			
			}
			//한번도 로그인 성공 못하면 출력
			if(!isLoginSuccess) {
				System.out.println("로그인 실패...");
			}
			}
			catch (FileNotFoundException e) {
			System.out.println("예외 발생!!");
			} catch (IOException e1) {
			System.out.println("입출력 예외 발생!!");
			}
		
		}
	

}
