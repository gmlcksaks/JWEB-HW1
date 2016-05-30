package service;

import dao.Dao;


public class AbstractService {
	protected Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
}
