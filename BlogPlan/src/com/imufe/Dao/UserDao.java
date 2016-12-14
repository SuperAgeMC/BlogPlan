package com.imufe.Dao;

import java.util.List;

import com.imufe.Bean.User;

public interface UserDao {
	public boolean RegisterUser ();
	public List<User> SelectAllUser ();
	public User SelectByUserName (String userName);
	public User SelectByUserEmail (String userEmail);
	public boolean UpdateUserInfo (User user);
}
