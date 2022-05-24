package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

   public static void main(String[] args) {
      
      System.out.println("jdbc test~~~");
      
      //DB�� ������ �Ϸ��� id, pwd, ip, port, sid �ʿ�
      
      String id = "C##KH";
      String pwd = "KH";
      String ip = "127.0.0.1";
      String port = "1521";
      String sid = "xe";
      
      
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
     
      try {
    	
    	  //OracleDriver ���, ������������ ��� ����
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//���� (Driver ����ϱ�)
	    String url = "jdbc:oracle:thin:@localhost:1522:xe";
	      conn = DriverManager.getConnection(url, id, pwd); //url, id, pwd�� ���ؼ� Connection ȹ��
	    // DriverManager ���ؼ� Connection�̶�� ��ü ����, �̸� ���ؼ� Ŀ��,�ѹ� �� �����ϴ�.
	      
	      System.out.println(conn);
	      
	      stmt = conn.createStatement(); // Statement��� ���̸� �����.
	      rs = stmt.executeQuery("SELECT * FROM EMP"); 
	      //���� Query���� ���� �̸� ó�� �� ResultSet���� ��ȯ�ϴ� ResultSet ��ü�� ��´�.
	      System.out.println(rs); // ��ü�� ���� ������ ��µ�. ���� �ٸ� �������� �����͸� �о�;���
	      
	      while(rs.next()) {
	    	  int empNo = rs.getInt("EMPNO"); 
	    	  // rs���� "EMPNO"��� Į���� �о�Ͷ�. NUMBER Ÿ�� => intŸ��
	          String ename = rs.getString("ENAME"); 
	          // rs���� "ENAME"�̶�� Į���� �о�Ͷ�. VARCHAR2 Ÿ�� => String Ÿ��
	          System.out.println(empNo + " / " + ename);
	        }
	      
		} catch (ClassNotFoundException | SQLException e) {
		    System.out.println("Ŭ���� ��ã��");
		}finally {
				//�ڿ� ����
			try {conn.close();} catch (SQLException e) {};
			try {stmt.close();} catch (SQLException e) {};
			try {rs.close();} catch (SQLException e) {};
		}

   }
   
}
