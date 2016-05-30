package action;

import service.AbstractService;

import com.opensymphony.xwork2.ActionSupport;

public abstract class AbstractAction extends ActionSupport{
	protected final static String SUCCEED = "SUCCEED";
	protected final static String FAIL = "FAIL";
	
	protected AbstractService service ;
	
	public AbstractService getService(){
		return service;
	}
	
	public void setService(AbstractService service){
		this.service = service;
	}
}
