package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

   public static void main(String[] args) {
      
      System.out.println("jdbc test~~~");
      
      //DB랑 연결을 하려면 id, pwd, ip, port, sid 필요
      
      String id = "C##KH";
      String pwd = "KH";
      String ip = "127.0.0.1";
      String port = "1521";
      String sid = "xe";
      
      
      Connection conn = null;
      Statement stmt = null;
      ResultSet rs = null;
     
      try {
    	
    	  //OracleDriver 등록, 직접등록해줘야 사용 가능
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//접속 (Driver 사용하기)
	    String url = "jdbc:oracle:thin:@localhost:1522:xe";
	      conn = DriverManager.getConnection(url, id, pwd); //url, id, pwd를 통해서 Connection 획득
	    // DriverManager 통해서 Connection이라는 객체 생성, 이를 통해서 커밋,롤백 등 가능하다.
	      
	      System.out.println(conn);
	      
	      stmt = conn.createStatement(); // Statement라는 종이를 만든다.
	      rs = stmt.executeQuery("SELECT * FROM EMP"); 
	      //보낼 Query문을 적고 이를 처리 후 ResultSet으로 반환하는 ResultSet 객체에 담는다.
	      System.out.println(rs); // 객체에 대한 정보만 출력됨. 따라서 다른 방향으로 데이터를 읽어와야함
	      
	      while(rs.next()) {
	    	  int empNo = rs.getInt("EMPNO"); 
	    	  // rs에서 "EMPNO"라는 칼럼을 읽어와라. NUMBER 타입 => int타입
	          String ename = rs.getString("ENAME"); 
	          // rs에서 "ENAME"이라는 칼럼을 읽어와라. VARCHAR2 타입 => String 타입
	          System.out.println(empNo + " / " + ename);
	        }
	      
		} catch (ClassNotFoundException | SQLException e) {
		    System.out.println("클래스 못찾음");
		}finally {
				//자원 정리
			try {conn.close();} catch (SQLException e) {};
			try {stmt.close();} catch (SQLException e) {};
			try {rs.close();} catch (SQLException e) {};
		}

   }
   
}
