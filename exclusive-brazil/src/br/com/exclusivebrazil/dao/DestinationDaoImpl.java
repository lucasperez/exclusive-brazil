package br.com.exclusivebrazil.dao;

import org.springframework.stereotype.Repository;

import br.com.exclusivebrazil.model.Destination;

@Repository
public class DestinationDaoImpl extends GenericDao<Destination>{

	public DestinationDaoImpl() {
		super(Destination.class);
	}

}
