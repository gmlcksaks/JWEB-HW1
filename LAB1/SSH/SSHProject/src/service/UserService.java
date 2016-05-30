package service;

import bean.User;

public class UserService extends AbstractService{
    
	private User usr;
	public int register(String userName, String password){
		System.out.println("start register");
		usr = new User();
		usr.setUsername(userName);
		usr.setPassword(password);
		dao.save(usr);
		return 1;
	}
	
	public int login(String userName, String password){
		System.out.println("login");
		usr = new User();
		usr.setUsername(userName);
		usr.setPassword(password);
		if(dao.check(usr)) return 1;
		return 0;
	}
}
