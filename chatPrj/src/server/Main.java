package server;

import common.SocketInfo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
	
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);
        
        try {
        	while (true) {
                System.out.println("Ŭ���̾�Ʈ �����...");
                Socket socket = serverSocket.accept();
                System.out.println("����� ���� : " + socket.getInetAddress());
                new SocketInfo(socket);
            }
        }catch(Exception e) {
        	e.printStackTrace();
        }finally {
        	serverSocket.close();
		}

        
        
    }

}