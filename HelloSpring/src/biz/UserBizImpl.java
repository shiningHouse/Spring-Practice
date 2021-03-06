package biz;

import dao.UserDAO;

public class UserBizImpl implements UserBiz{
	// 使用UserDAO接口声明对象
	private UserDAO user;
	// 为依赖注入，提供set方法
	public void setUser(UserDAO user) {
		this.user = user;
	}
	
	public UserBizImpl(){}
	@Override
	public boolean login(String username, String password) {	
		//调用user的login方法验证
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
