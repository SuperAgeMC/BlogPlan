package com.imufe.Dao;

import com.imufe.Bean.Login;

public interface LoginDao {
	public int LoginUser (Login loginUser);
	//�����û��ĵ�½У��
	public void ExitUser ();
	public void forgetPwd ();
	//�����û����룬����һ���̶��Ķ�������ͷֱ�Ӹ���ǰ��JSPҳ���ת��
}
