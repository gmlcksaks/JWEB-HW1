package action;

import service.UserService;

public class RegisterAction extends AbstractAction{
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
	
	
	public String register(){
		System.out.println(username);
		System.out.println(password);
		int result = ((UserService)this.getService()).register(username, password);
		if(result == 1) return SUCCEED;
		return FAIL;
	}
}
