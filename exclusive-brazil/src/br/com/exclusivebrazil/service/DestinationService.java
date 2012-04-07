package br.com.exclusivebrazil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exclusivebrazil.dao.Dao;
import br.com.exclusivebrazil.model.Client;
import br.com.exclusivebrazil.model.Destination;

@Service("destinationService")
public class DestinationService {

	@Autowired
	private Dao<Destination> dao;
	
	public List<Destination> clientList() {
		return this.dao.listAll();
	}

	public Destination save(Destination d) {
		return this.dao.save(d);
	}

	public boolean delete(Destination d) {
		return this.dao.delete(d);
	}
}
