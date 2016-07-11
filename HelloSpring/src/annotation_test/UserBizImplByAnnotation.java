package annotation_test;

import javax.annotation.Resource;

import biz.UserBiz;
import dao.UserDAO;

public class UserBizImplByAnnotation implements UserBiz{
	
	// 通过name，作为bean的名字进行寻找和加载
	@Resource(name="userDAO")
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public boolean login(String username, String password) {
		return userDAO.login(username, password);
	}
	@Override
	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

}
