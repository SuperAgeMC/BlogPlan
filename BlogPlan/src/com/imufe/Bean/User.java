package com.imufe.Bean;

import java.util.Date;

public class User {
	private String userId;
	//�����û�ID
	private String userName;
	//�����û��ǳ�
	private String userSex;
	//�����û��Ա�
	private String userAge;
	//�����û�������
	private String userEmail;
	//�����û���Email
	//���Email �� Login����Emial �ǻ�Ϊ����Ĺ�ϵ
	private String userEducation;
	//�����û���ѧ��
	private String usercharacter;
	//�����û��ĸ���ǩ��
	private String userHeadImage;
	//�����û���ͷ�������ݿ޴��һ��URL
	private Date userRegistertime;
	//�����û�ע���ʱ��
	private int userBlogage;
	//�����û��Ĳ�������
	
	
	//���봩����Ĭ�Ϲ��캯��
	//������һ��Ĭ�ϵĹ��캯��
		public User (){
			
		}
	
	
	public User (User user){
		this.userId  = user.getUserId();
		this.userName = user.getUserName();
		this.userSex = user.getUserSex();
		this.userAge = user.getUserAge();
		this.userEmail = user.getUserEmail();
		this.userEducation = user.getUserEducation();
		this.usercharacter = user.getUsercharacter();
		this.userHeadImage = user.getUserHeadImage();
		this.userRegistertime = user.getUserRegistertime();
		this.userBlogage = user.getUserBlogage();
	}
	
	
	public Date getUserRegistertime() {
		return userRegistertime;
	}

	public void setUserRegistertime(Date userRegistertime) {
		this.userRegistertime = userRegistertime;
	}

	public int getUserBlogage() {
		return userBlogage;
	}

	public void setUserBlogage(int userBlogage) {
		this.userBlogage = userBlogage;
	}

	
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserEducation() {
		return userEducation;
	}
	public void setUserEducation(String userEducation) {
		this.userEducation = userEducation;
	}
	public String getUsercharacter() {
		return usercharacter;
	}
	public void setUsercharacter(String usercharacter) {
		this.usercharacter = usercharacter;
	}
	public String getUserHeadImage() {
		return userHeadImage;
	}
	public void setUserHeadImage(String userHeadImage) {
		this.userHeadImage = userHeadImage;
	}
	
	
}
