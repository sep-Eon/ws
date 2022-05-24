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
	
	//���� ��ǲ ��Ʈ��
	
	//���� ��ü
	public void test()  {
		
	File f = new File("C:\\dev\\abc.txt"); //������ ��, ���� ���� �����������
	boolean result = f.isFile();
	System.out.println(result);
	
	//���Ͽ��� ������ �б�
	//1.����
	//2.��ǲ ��Ʈ�� (FileInputStream)
	
	FileReader fr = null;
	try {
	fr =  new FileReader(f); 
	int data;
	while((data = fr.read()) != -1) { 
	System.out.print((char)data);}
	} catch(FileNotFoundException fe) {
		System.out.println("������ ��ã�� �Ф�");
	} catch (IOException ie) {
		System.out.println("����� ���� �߻�");
	} finally {
		try {fr.close();} catch (IOException e) {System.out.println("close �� ���� �߻�");}
	}
	

	
	}
	
	public void test2() {
		
		
		String str = new Scanner(System.in).nextLine();
		//���Ͽ��� �۾� ����
		
		//1. ���� ���� ��� (���� ��ü ����)
		String path = "C:\\\\dev\\\\abc.txt";
		File f = new File(path);
		
		FileWriter fw = null;
		try {
		fw = new FileWriter(f);
		int data;
		fw.write(str);
		fw.flush();
			} catch (IOException ie) {
				System.out.println("����� ���� �߻�");
			} finally {
				try {fw.close();} catch (IOException e) {System.out.println("close �� ���� �߻�");}
			}	
	}
	
	//������Ʈ�� Ȱ���Ͽ� �Է¹ޱ�
	/*
	 * (BufferedReader) : ���ڿ� ó��=> Reader, Buffer�� ����ϰ� ����.
	 */
	public void test3() {
		
		//���� ��ü ����
		String path =  "C:\\dev\\abc.txt";
		File f = new File(path);
		BufferedReader br = null;
		
		//��Ʈ�� ����
		try {
		    br = new BufferedReader(new FileReader(f));
			String s = null;
			while((s = br.readLine()) != null) {
			System.out.println(s);
		} 
		}catch (FileNotFoundException e) {
			System.out.println("���� ��ã��!!");
		} catch (IOException e) {
			System.out.println("�дٰ� ������!!");
		} 

}
	
	//test4 BufferedWriter �ǽ��ϱ�
}
