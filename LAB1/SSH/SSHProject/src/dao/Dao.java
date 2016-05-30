package dao;

import bean.User;


public interface Dao {
	public <T> void save(T obj);
	public boolean check(User user);
}
