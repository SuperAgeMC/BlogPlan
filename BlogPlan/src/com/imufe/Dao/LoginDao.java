package com.imufe.Dao;

import com.imufe.Bean.Login;

public interface LoginDao {
	public String LoginUser ();
	//进行用户的登陆校验
	public void ExitUser ();
	//注销当前的登录用户
	public void forgetPwd ();
	//忘记用户密码，这是一个固定的动作，回头直接负责前端JSP页面的转跳
}
