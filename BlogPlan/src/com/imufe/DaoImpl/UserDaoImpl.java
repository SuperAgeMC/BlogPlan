package com.imufe.DaoImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import com.imufe.Bean.User;
import com.imufe.Dao.UserDao;
import com.imufe.UTIL.DBHelper;

public class UserDaoImpl implements UserDao {
	
	private User online_user;

	public boolean RegisterUser() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> SelectAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	public User SelectByUserName(String userName) {
		// TODO Auto-generated method stub
		String sql = "select * from SJ_BLOGPLAN_USER where user_name = '"+this.online_user.getUserName()+"'";
		DBHelper dbh = new DBHelper();
		dbh.Open_SQL(sql);
		ResultSet res_sql = null;
		try {
			res_sql = dbh.pst.executeQuery();
			while (res_sql.next()!=false){
				this.online_user = new User ();
				if (res_sql.getString(2)!=null){
					online_user.setUserName(res_sql.getString(2).toString());
				}
				else{
					online_user.setUserName("无");
				}
				if (res_sql.getString(3) != null){
					online_user.setUserEmail(res_sql.getString(3).toString());
				}
				else{
					online_user.setUserEmail("无");
				}
				if (res_sql.getString(4) != null){
					online_user.setUserSex(res_sql.getString(4).toString());
				}
				else{
					online_user.setUserSex("男");
				}
				if (res_sql.getString(5) != null){
					online_user.setUserAge(res_sql.getString(5).toString());
				}
				else{
					online_user.setUserAge("0");
				}
				if (res_sql.getString(6)!=null){
					online_user.setUserEducation(res_sql.getString(6).toString());
				}
				else{
					online_user.setUserEducation("无");
				}
				if (res_sql.getString(7)!=null){
					online_user.setUsercharacter(res_sql.getString(7).toString());
				}
				else{
					online_user.setUsercharacter("无");
				}
				if (res_sql.getString(8)!=null){
					online_user.setUserPower(res_sql.getString(8).toString());
				}
				else{
					online_user.setUserPower("无");
				}
				if (res_sql.getString(9)!=null){
					online_user.setUserHeadImage(res_sql.getString(9).toString());
				}
				if (res_sql.getString(10)!=null){
					Date resgistertime = new Date (res_sql.getString(10).toString());
					online_user.setUserRegistertime(resgistertime);
				}
				else{
					online_user.setUserRegistertime(null);
				}
				if (res_sql.getString(11)!=null){
					Integer blogage = new Integer(res_sql.getString(11).toString());
					online_user.setUserBlogage(blogage);
				}
				else{
					online_user.setUserBlogage(0);
				}
			}
			dbh.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.online_user;
	}

	public User SelectByUserEmail(String userEmail) {
		// TODO Auto-generated method stub
		String sql = "select * from SJ_BLOGPLAN_USER where user_email = '"+userEmail+"'";
		DBHelper dbh = new DBHelper();
		dbh.Open_SQL(sql);
		ResultSet res_sql = null;
		try {
			res_sql = dbh.pst.executeQuery();
			while (res_sql.next()!=false){
				this.online_user = new User ();
				if (res_sql.getString(2)!=null){
					online_user.setUserName(res_sql.getString(2).toString());
				}
				else{
					online_user.setUserName("无");
				}
				if (res_sql.getString(3) != null){
					online_user.setUserEmail(res_sql.getString(3).toString());
				}
				else{
					online_user.setUserEmail("无");
				}
				if (res_sql.getString(4) != null){
					online_user.setUserSex(res_sql.getString(4).toString());
				}
				else{
					online_user.setUserSex("男");
				}
				if (res_sql.getString(5) != null){
					online_user.setUserAge(res_sql.getString(5).toString());
				}
				else{
					online_user.setUserAge("0");
				}
				if (res_sql.getString(6)!=null){
					online_user.setUserEducation(res_sql.getString(6).toString());
				}
				else{
					online_user.setUserEducation("无");
				}
				if (res_sql.getString(7)!=null){
					online_user.setUsercharacter(res_sql.getString(7).toString());
				}
				else{
					online_user.setUsercharacter("无");
				}
				if (res_sql.getString(8)!=null){
					online_user.setUserPower(res_sql.getString(8).toString());
				}
				else{
					online_user.setUserPower("无");
				}
				if (res_sql.getString(9)!=null){
					online_user.setUserHeadImage(res_sql.getString(9).toString());
				}
				if (res_sql.getString(10)!=null){
					Date resgistertime = new Date (res_sql.getString(10).toString());
					online_user.setUserRegistertime(resgistertime);
				}
				else{
					online_user.setUserRegistertime(null);
				}
				if (res_sql.getString(11)!=null){
					Integer blogage = new Integer(res_sql.getString(11).toString());
					online_user.setUserBlogage(blogage);
				}
				else{
					online_user.setUserBlogage(0);
				}
			}
			dbh.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.online_user;
	}

	public boolean UpdateUserInfo(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
