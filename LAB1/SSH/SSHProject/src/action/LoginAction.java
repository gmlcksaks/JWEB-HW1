package action;

import service.UserService;

public class LoginAction extends AbstractAction{
	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String login(){
		System.out.println("username:\t"+username);
		System.out.println("password:\t"+password);
		System.out.println(this.getService()==null);
		
		int check =((UserService)this.getService()).login(username, password);
		if(check==1) return SUCCEED;
		return FAIL;
	}
}
