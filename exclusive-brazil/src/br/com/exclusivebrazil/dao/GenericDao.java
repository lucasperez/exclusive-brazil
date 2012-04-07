package br.com.exclusivebrazil.dao;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.exclusivebrazil.model.Client;

public class GenericDao<T> implements Dao<T> {
	
	@Autowired
	private SessionFactory sessionFactory;
	private Class persistentClass;
	
	public GenericDao(Class persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Override
	public T save(T object) {
		this.sessionFactory.getCurrentSession().saveOrUpdate(object);
		this.sessionFactory.getCurrentSession().flush();
		return object;
	}

	@Override
	public T load(Serializable id) {
		return (T) this.sessionFactory.getCurrentSession().load(persistentClass, id);
	}

	@Override
	public T get(Serializable id) {
		return (T) this.sessionFactory.getCurrentSession().get(getClass(), id);
	}

	@Override
	public List<T> listAll() {
		return this.sessionFactory.getCurrentSession().createCriteria(Client.class).list();
	}

	@Override
	public boolean delete(T t) {
		try {
			this.sessionFactory.getCurrentSession().delete(t);
			this.sessionFactory.getCurrentSession().flush();
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Class getObjectClass() {
		return persistentClass;
	}


	
}
