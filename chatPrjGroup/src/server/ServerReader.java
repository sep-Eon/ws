package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ServerReader implements Runnable {
	
	private final Socket s;

	

	public ServerReader(Socket s) {
		this.s = s;
	}



	@Override
	public void run() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			while(true) {
				String msg = br.readLine();
				Main.msgQueue.offer(msg);
				Thread.sleep(10);
			}
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

}
