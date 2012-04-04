package br.com.exclusivebrazil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exclusivebrazil.dao.GenericDao;
import br.com.exclusivebrazil.model.Client;


@Service("clientService")
public class ClientService {
	
	@Autowired
	private GenericDao<Client> dao;
	
	public List<Client> clientList() {
		return this.dao.list();
	}
	
}