package com.imufe.Bean;

public class Login {
	private String loginId;
	//���ǵ�½��ID �� User���е�UserId��Ϊ����Ĺ�ϵ
	private String loginEmail;
	//���ǵ�½�����䣬��ǰ��ҳ�����������ʽ��У��
	private String loginPwd;
	//�����û��ĵ�½���룬��ǰ�˽���������볤�ȿ��ƣ��������׼У��
	
	
	//��Ѫ����һ��Ĭ�ϵĹ��캯��
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
