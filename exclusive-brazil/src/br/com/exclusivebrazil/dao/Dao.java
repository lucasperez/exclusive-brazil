package br.com.exclusivebrazil.dao;

import java.io.Serializable;
import java.util.List;

import br.com.exclusivebrazil.model.Client;
import br.com.exclusivebrazil.model.Model;

public interface Dao<T> {

	public Class getObjectClass();
	
	public T save(T object);
	
	public T load(Serializable id);
	
	public T get(Serializable id);
	
	public List<T> listAll();

	public boolean delete(T t); 
}