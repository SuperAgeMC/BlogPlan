package com.imufe.Bean;

import java.util.Date;

//这是博客表
public class Blog {
	private String blogId;
	private String userId;
	private String typeId;
	private String blogAbstract;
	private String blogUrl;
	private Date blogTime;
	
	//必须创建的默认构造函数
	public Blog (){
		
	}
	
	public Blog (Blog blog){
		this.blogId = blog.getBlogId();
		this.userId = blog.getUserId();
		this.typeId = blog.getTypeId();
		this.blogAbstract = blog.getBlogAbstract();
		this.blogUrl = blog.getBlogUrl();
		this.blogTime = blog.getBlogTime();
	}
	
	
	
	public String getBlogId() {
		return blogId;
	}
	public void setBlogId(String blogId) {
		this.blogId = blogId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getTypeId() {
		return typeId;
	}
	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}
	public String getBlogAbstract() {
		return blogAbstract;
	}
	public void setBlogAbstract(String blogAbstract) {
		this.blogAbstract = blogAbstract;
	}
	public String getBlogUrl() {
		return blogUrl;
	}
	public void setBlogUrl(String blogUrl) {
		this.blogUrl = blogUrl;
	}
	public Date getBlogTime() {
		return blogTime;
	}
	public void setBlogTime(Date blogTime) {
		this.blogTime = blogTime;
	}
	
	
	
	
}
