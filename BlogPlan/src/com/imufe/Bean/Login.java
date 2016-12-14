package com.imufe.Bean;

public class Login {
	private String loginId;
	//这是登陆的ID 与 User表中的UserId互为外键的关系
	private String loginEmail;
	//这是登陆的邮箱，在前端页面进行正则表达式的校验
	private String loginPwd;
	//这是用户的登陆密码，在前端界面进行密码长度控制，和密码标准校验
	
	
	//鼻血创建一个默认的构造函数
	public Login (){
		
	}
	public Login (Login login){
		this.loginId = login.getLoginId();
		this.loginEmail = login.getLoginEmail();
		this.loginPwd = login.getLoginPwd();
	}
	
	
	
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getLoginEmail() {
		return loginEmail;
	}
	public void setLoginEmail(String loginEmail) {
		this.loginEmail = loginEmail;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	
	
}
