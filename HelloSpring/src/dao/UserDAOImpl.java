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
		System.out.println(String.format("%s�ɹ���½������Ϊ%s", username,password));
	}

	@Override
	public void deleteUser(int id) {
		System.out.println(String.format("���Ϊ%s���û��Ѿ���ɾ��", id));
	}

}
