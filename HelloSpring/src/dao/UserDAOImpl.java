package dao;

public class UserDAOImpl implements UserDAO{
	
	public UserDAOImpl(){}
	
	@Override
	public boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("123")){
			return true;
		}
		return false;
	}

	@Override
	public void addUser(String username, String password) {
		System.out.println(String.format("%s成功登陆，密码为%s", username,password));
	}

	@Override
	public void deleteUser(int id) {
		System.out.println(String.format("编号为%s的用户已经被删除", id));
	}

}
