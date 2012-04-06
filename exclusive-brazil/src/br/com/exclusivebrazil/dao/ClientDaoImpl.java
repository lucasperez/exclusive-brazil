package br.com.exclusivebrazil.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.context.internal.ManagedSessionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.exclusivebrazil.model.Client;

@Repository
public class ClientDaoImpl implements GenericDao<Client> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Client> list() {
		return this.sessionFactory.getCurrentSession().createCriteria(Client.class).list();

	}

	@Override
	public boolean save(Client client) {
		try {
			this.sessionFactory.getCurrentSession().saveOrUpdate(client);
			this.sessionFactory.getCurrentSession().flush();
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public boolean delete(Client client) {
		try {
			this.sessionFactory.getCurrentSession().delete(client);
			this.sessionFactory.getCurrentSession().flush();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	
	
}
