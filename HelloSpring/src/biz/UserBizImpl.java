package biz;

import dao.UserDAO;

public class UserBizImpl implements UserBiz{
	// ʹ��UserDAO�ӿ���������
	private UserDAO user;
	// Ϊ����ע�룬�ṩset����
	public void setUser(UserDAO user) {
		this.user = user;
	}
	
	public UserBizImpl(){}
	@Override
	public boolean login(String username, String password) {	
		//����user��login������֤
		return user.login(username, password);
	}
	@Override
	public void addUser(String username, String password) {
		user.addUser(username, password);
	}
	@Override
	public void deleteUser(int id) {
		user.deleteUser(id);
	}
}
