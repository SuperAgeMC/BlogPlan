package com.imufe.TestClass;

import java.sql.SQLException;

import com.imufe.UTIL.DBHelper;

public class First_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("开始测试");
		String pro = "ysrgsj.checkout_login_password(?,?)";
		DBHelper dbh = new DBHelper();
		dbh.Open_PLSQL(pro);
		try {
			dbh.call.setString(1, "952622946@qq.com");
			dbh.call.registerOutParameter(2, oracle.jdbc.OracleTypes.NUMBER);
			dbh.call.execute();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		int data_res = 0;
		try {
			data_res = dbh.call.getInt(2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("调用密码校验的PLSQL ======》 " + data_res);
	}

}
