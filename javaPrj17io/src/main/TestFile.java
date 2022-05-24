package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFile  {
	
	//파일 인풋 스트림
	
	//파일 객체
	public void test()  {
		
	File f = new File("C:\\dev\\abc.txt"); //생성할 때, 파일 정보 전달해줘야함
	boolean result = f.isFile();
	System.out.println(result);
	
	//파일에서 데이터 읽기
	//1.파일
	//2.인풋 스트림 (FileInputStream)
	
	FileReader fr = null;
	try {
	fr =  new FileReader(f); 
	int data;
	while((data = fr.read()) != -1) { 
	System.out.print((char)data);}
	} catch(FileNotFoundException fe) {
		System.out.println("파일을 못찾음 ㅠㅠ");
	} catch (IOException ie) {
		System.out.println("입출력 예외 발생");
	} finally {
		try {fr.close();} catch (IOException e) {System.out.println("close 중 예외 발생");}
	}
	

	
	}
	
	public void test2() {
		
		
		String str = new Scanner(System.in).nextLine();
		//파일에다 글씨 쓰기
		
		//1. 파일 정보 얻기 (파일 객체 생성)
		String path = "C:\\\\dev\\\\abc.txt";
		File f = new File(path);
		
		FileWriter fw = null;
		try {
		fw = new FileWriter(f);
		int data;
		fw.write(str);
		fw.flush();
			} catch (IOException ie) {
				System.out.println("입출력 예외 발생");
			} finally {
				try {fw.close();} catch (IOException e) {System.out.println("close 중 예외 발생");}
			}	
	}
	
	//보조스트림 활용하여 입력받기
	/*
	 * (BufferedReader) : 문자열 처리=> Reader, Buffer를 사용하고 싶음.
	 */
	public void test3() {
		
		//파일 객체 생성
		String path =  "C:\\dev\\abc.txt";
		File f = new File(path);
		BufferedReader br = null;
		
		//스트림 생성
		try {
		    br = new BufferedReader(new FileReader(f));
			String s = null;
			while((s = br.readLine()) != null) {
			System.out.println(s);
		} 
		}catch (FileNotFoundException e) {
			System.out.println("파일 못찾음!!");
		} catch (IOException e) {
			System.out.println("읽다가 에러남!!");
		} 

}
	
	//test4 BufferedWriter 실습하기
}
