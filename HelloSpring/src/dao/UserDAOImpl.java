package dao;

public class UserDAOImpl implements UserDAO{
	@Override
	public boolean login(String username, String password) {
		if(username.equals("admin") && password.equals("123")){
			return true;
		}
		return false;
	}

}
