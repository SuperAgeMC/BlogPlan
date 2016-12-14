package com.imufe.Bean;

import java.util.Date;

public class User {
	private String userId;
	//这是用户ID
	private String userName;
	//这是用户昵称
	private String userSex;
	//这是用户性别
	private String userAge;
	//这是用户的年龄
	private String userEmail;
	//这是用户的Email
	//这个Email 和 Login表中Emial 是互为外键的关系
	private String userEducation;
	//这是用户的学历
	private String usercharacter;
	//这是用户的个性签名
	private String userHeadImage;
	//这是用户的头像，在数据哭存放一个URL
	private Date userRegistertime;
	//这是用户注册的时间
	private int userBlogage;
	//这是用户的博客年龄
	
	
	//必须穿件的默认构造函数
	//唏嘘有一个默认的构造函数
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
