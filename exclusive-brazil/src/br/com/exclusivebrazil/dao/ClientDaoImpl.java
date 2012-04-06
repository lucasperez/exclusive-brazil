package br.com.exclusivebrazil.dao;

import org.springframework.stereotype.Repository;

import br.com.exclusivebrazil.model.Client;

@Repository
public class ClientDaoImpl extends GenericDao<Client> {

	public ClientDaoImpl() {
		super(Client.class);
	}
	
}
