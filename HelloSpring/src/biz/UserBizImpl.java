package biz;

import dao.UserDAO;

public class UserBizImpl implements UserBiz{

	// ʹ��UserDAO�ӿ���������
	private UserDAO user;

	
	public UserDAO getUser() {
		return user;
	}
	
	// Ϊ����ע�룬�ṩset����
	public void setUser(UserDAO user) {
		this.user = user;
	}

	public UserBizImpl() {
		
	}

	@Override
	public boolean login(String username, String password) {
		
		//����user��login������֤
		return user.login(username, password);
	}

}
