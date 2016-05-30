package dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import bean.User;

public class UserDao extends HibernateDaoSupport implements Dao{
	private static UserDao userdao;
	
	public static UserDao getInstance(){
		if(userdao==null){
			userdao = new UserDao();
			Configuration cfg = new Configuration()
			.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			userdao.setSessionFactory(sessionFactory);
		}
		return userdao;
	}
	
	@SuppressWarnings("unchecked")
	private <T> List<T> query(String hql) {
		return this.getHibernateTemplate().find(hql);
	}
	

	@Override
	public <T> void save(T obj) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().save(obj);
		getHibernateTemplate().flush();		
	}

	@Override
	public boolean check(User user) {
		// TODO Auto-generated method stub
		List<User> users = this.query("from User usr where usr.username="+user.getUsername()+" and usr.password="+user.getPassword());
		if(users.size()==0) return false;
		return true;
	}

	
}
