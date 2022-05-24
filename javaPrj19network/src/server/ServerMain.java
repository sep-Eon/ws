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
		
		//����
		int port = 12345;
		// ���� ������ ��Ʈ��ȣ �ʿ�
		ServerSocket ss =  new ServerSocket(port); 
		//==> ServerSocket�̶�� �����ڸ� ȣ���Ͽ� 12345��� �Ķ���͸� ���Ͽ� ��ü�� ����.
		
		System.out.println("�ٸ� ������ ������ ��ٸ��� ��");
		// accept�� ���� 'Ŭ���̾�Ʈ'�� '����' ���� ����-> accept�� ������
		Socket cs = ss.accept(); 
		//ServerSocket���� accept��� �޼ҵ带 ��ü�� ���� �� socket�̶�� ������ �ִ´�.
		//���� ��Ⱑ �̷�����.
		//accept���� �����尡 ����ȴ�. => ������ �� ������ ��ٸ��� �����̴�.
		//accept�� Ŭ���̾�Ʈ�� ���������� socketŸ������ �����Ѵ�.
		
		InetAddress ip = cs.getInetAddress();
		
		System.out.println("����� Ŭ���̾�Ʈ�� ip : " + ip);
	
		//Stream ���
//		InputStream is = cs.getInputStream();
//		//������ ����� �Ŀ��� ��Ʈ���� ���ؾ� �����͸� �ְ���� �� �ִ�. // 1 byte�� ó��
//		InputStreamReader isr = new InputStreamReader(is); // 2byte�� ó�� ����
//		BufferedReader br = new BufferedReader(isr); //������Ʈ������ ���� ���
		//���� �Ȱ���
		BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
	
		//�޽��� �а�, ����ϱ�
		String msg = br.readLine();
		System.out.println(msg);
		
		
		//����� �ڿ� �ݳ�
		br.close();
	
	
	}

}
