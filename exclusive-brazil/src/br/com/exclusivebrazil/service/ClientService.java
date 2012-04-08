package br.com.exclusivebrazil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exclusivebrazil.dao.ClientDaoImpl;
import br.com.exclusivebrazil.model.Client;


@Service("clientService")
public class ClientService {
	
	@Autowired
	private ClientDaoImpl dao;
	
	public List<Client> clientList() {
		return this.dao.listAll();
	}

	public Client save(Client client) {
		return this.dao.save(client);
	}

	public boolean delete(Client client) {
		return this.dao.delete(client);
	}
	
}
