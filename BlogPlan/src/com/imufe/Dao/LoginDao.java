package com.imufe.Dao;

import com.imufe.Bean.Login;

public interface LoginDao {
	public int LoginUser (Login loginUser);
	//进行用户的登陆校验
	public void ExitUser ();
	public void forgetPwd ();
	//忘记用户密码，这是一个固定的动作，回头直接负责前端JSP页面的转跳
}
