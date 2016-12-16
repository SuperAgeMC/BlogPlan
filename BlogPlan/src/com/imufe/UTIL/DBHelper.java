package com.imufe.UTIL;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBHelper {
	
	private static String url = "jdbc:oracle:thin:@211.82.169.249:1521:orcl";
	private static String Oracle_name = "oracle.jdbc.driver.OracleDriver";
	private static String username = "ysrgsj";
	private static String password = "123456";
	public Connection conn;
	public PreparedStatement pst;
	public CallableStatement call;
	
	public void Open_PLSQL (String pro){
		try {
			Class.forName(Oracle_name);
			try {
				conn =(Connection) DriverManager.getConnection(url,username,password);
				System.out.println("打开PLSQL——Connection时，传入的PLSQL语句 =======>  " + pro);
				call = (CallableStatement)conn.prepareCall("{call " +pro+"}");
				//call.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void Open_SQL (String sql){
		try {
			Class.forName(Oracle_name);
			try {
				conn =(Connection) DriverManager.getConnection(url,username,password);
				System.out.println("打开SQL——Connection时，传入的SQL语句 =======>  " + sql);
				pst = conn.prepareStatement(sql);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public void close (){
		if (pst != null && call == null)
		{
			try {
				pst.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else if (pst == null && call != null)
		{
			try {
				call.close();
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			try {
				pst.close();
				call.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
