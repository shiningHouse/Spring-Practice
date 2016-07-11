package dao;

public interface UserDAO {
	public boolean login(String username, String password);
	public void addUser(String username, String password);
	public void deleteUser(int id);
}
