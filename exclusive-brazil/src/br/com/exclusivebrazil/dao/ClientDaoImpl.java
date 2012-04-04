package br.com.exclusivebrazil.dao;

import java.util.List;

import org.hibernate.SessionFactory;
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

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
}
