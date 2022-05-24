package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String id = "C##KH";
		String pwd = "KH";
		String ip = "127.0.0.1";
		String port = "1522";
		String sid = "Xe";
		
		
	    Class.forName("oracle.jdbc.driver.OracleDriver");
		
	    String url = "jdbc:oracle:thin:@localhost:1522:xe";
	    
	    Connection conn = DriverManager.getConnection(url, id, pwd);
		  
	    
	    System.out.println(conn);
	    
		System.out.println();
	}

}
