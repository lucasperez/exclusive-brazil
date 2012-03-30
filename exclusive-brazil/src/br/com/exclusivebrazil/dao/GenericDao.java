package br.com.exclusivebrazil.dao;

import java.util.List;

import br.com.exclusivebrazil.model.Model;

public interface GenericDao<T extends Model> {

	public List<T> list(); 
}
