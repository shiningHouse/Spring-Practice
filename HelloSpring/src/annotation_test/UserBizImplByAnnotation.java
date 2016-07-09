package annotation_test;

import javax.annotation.Resource;

import biz.UserBiz;
import dao.UserDAO;

public class UserBizImplByAnnotation implements UserBiz{
	
	// ͨ��name����Ϊbean�����ֽ���Ѱ�Һͼ���
	@Resource(name="userDAO")
	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public boolean login(String username, String password) {
		return userDAO.login(username, password);
	}

}
