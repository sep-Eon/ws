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
	private File f = new File(path); //���� ��ü ����
	private Scanner sc = new Scanner(System.in);
	
		public String[] inputuser() {
			
			System.out.print("ID : ");
			String id = sc.nextLine().trim(); // trim :: ���ڿ� ���� ����
			System.out.print("PWD : ");
			String pwd = sc.nextLine().trim(); // trim :: ���ڿ� ���� ����
			
			//String[] strArr = new String[2]
			//strArr[0]=id;
			//strArr[1]=pwd;
			//return;
			//�� �Ʒ��� ����.
			return new String[] {id,pwd};
		}
		
	//ȸ������
		public void join() throws JoinException {
			System.out.println("====ȸ������====");
			String[] strArr = inputuser();
			
			String id = strArr[0];
			String pwd = strArr[1];
			
			//���̵�, �н����� �߿� '/' ������ ���� �߻���Ű��
			if(id.contains("/")||pwd.contains("/")) {
				//Exception!!!
				throw new JoinException();
			}
			
			//�Է¹��� �����͸� ���Ͽ� �ֱ�
			String path = "C:\\dev\\user.txt";
			File f = new File(path);
			
			//��Ʈ�� ����
			BufferedWriter bw = null;
			try {
				bw =  new BufferedWriter(new FileWriter(f,true)); //true == append�� �����. �������� �̾�� ����
				bw.write(id);
				bw.write("/");
				bw.write(pwd);
				bw.write("\n");
				bw.flush();
			} catch (IOException e) {
				System.out.println("���� �߻�!!!");
			} finally {
				try {bw.close();} catch (IOException e) {
					System.out.println("Ŭ���� ���� �߻�!!");
				}
			}
			
			
		}
	
	public void login() {
		//���Ͽ��� ���̵�, ���, Ȯ���Ͽ�
		//�α��� ���� ���� �Ǵ��ϱ�
		
		//��Ʈ�� ����
		//try with resource ������ ����ϸ�, close ó�� ���� �ʿ����.
		//(jdk ���� Ȯ���ϰ� ����)
		
		
		System.out.println("===�α��� �� ID, PWD �Է��ϼ���===");
		String[] strArr = inputuser();
		
		String id = strArr[0];
		String pwd = strArr[1];
		
		try (BufferedReader br = new BufferedReader(new FileReader(f))){
			
			//���̵� ��� �б�
			
			boolean isLoginSuccess = false;
			
			while (true) {
			String data = br.readLine(); // id/pwd
			
			//data�� null�̶��? ���� ������ �� ��������
			if(data == null) {
				break;
			}
			//�о�� data���� '/'������ �ε��� �˾ƾ���
			int index = data.indexOf('/'); // ���������� �ڸ��� ���ؼ� ��.
			String dataId = data.substring(0, index);
			String dataPwd = data.substring(index+1);

			
			//���̵� ��� �Ǵ��ϱ�
			if(id.equals(dataId) && pwd.equals(dataPwd)) {
				System.out.println(dataId + " �� �α��� ����!");
				isLoginSuccess = true;
				break;
			}
			
			}
			//�ѹ��� �α��� ���� ���ϸ� ���
			if(!isLoginSuccess) {
				System.out.println("�α��� ����...");
			}
			}
			catch (FileNotFoundException e) {
			System.out.println("���� �߻�!!");
			} catch (IOException e1) {
			System.out.println("����� ���� �߻�!!");
			}
		
		}
	

}
