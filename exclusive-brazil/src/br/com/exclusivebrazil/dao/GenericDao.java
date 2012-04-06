package br.com.exclusivebrazil.dao;

import java.util.List;

import br.com.exclusivebrazil.model.Client;
import br.com.exclusivebrazil.model.Model;

public interface GenericDao<T extends Model> {

	public List<T> list();

	public boolean save(T t);

	public boolean delete(T t); 
}
