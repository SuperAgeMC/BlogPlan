package com.imufe.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.imufe.Bean.Login;
import com.imufe.Bean.User;
import com.imufe.Dao.LoginDao;
import com.imufe.UTIL.DBHelper;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginDaoImpl extends ActionSupport implements LoginDao{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Login login_user;
	public String LoginUser() {
		// TODO Auto-generated method stub
		String PLSQL = "ysrgsj.checkout_login_password(?,?,?)";
		/*Login login_user = new Login ();
		login_user.setLoginEmail(this.login_email);
		login_user.setLoginPwd(this.login_password);*/
		DBHelper dbh = new DBHelper();
		dbh.Open_PLSQL(PLSQL);
		
		try {
			/*
			System.out.println(this.login_user.getLoginEmail());
			System.out.println(this.login_user.getLoginPwd());
			*/
			/*
			System.out.println("测试Login_user.email ====> " + login_user.getLoginEmail());
			System.out.println("测试Login_user.password ====> " + login_user.getLoginPwd());
			*/
			dbh.call.setString(1, login_user.getLoginEmail());
			dbh.call.setString(2, login_user.getLoginPwd());
			dbh.call.registerOutParameter(3, oracle.jdbc.OracleTypes.NUMBER);
			dbh.call.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int data_res = 0;
		try {
			data_res = dbh.call.getInt(3);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (data_res == 1){
			
			UserDaoImpl find_user = new UserDaoImpl ();
			User online_user = find_user.SelectByUserEmail(this.login_user.getLoginEmail());
			ActionContext.getContext().getSession().put("online_user_info", online_user);
			System.out.println("进行测试，在线用户的姓名:"+online_user.getUserName());
			System.out.println("进行测试，在线用户的邮箱:"+online_user.getUserEmail());
			dbh.close();
			return "login_success";
		}
		else{
			dbh.close();
			return "login_failed";
		}
		
	}

	public void ExitUser() {
		// TODO Auto-generated method stub
		
	}

	public void forgetPwd() {
		// TODO Auto-generated method stub
		
	}

	
	

	public Login getLogin_user() {
		return login_user;
	}

	public void setLogin_user(Login login_user) {
		this.login_user = login_user;
	}
	
	

	

	
	
	

}
