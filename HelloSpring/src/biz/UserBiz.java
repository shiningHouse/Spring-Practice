package biz;

public interface UserBiz {
	public boolean login(String username, String password);
	public void addUser(String username, String password);
	public void deleteUser(int id);
}
