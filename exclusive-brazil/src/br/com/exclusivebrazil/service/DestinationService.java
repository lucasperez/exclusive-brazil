package br.com.exclusivebrazil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exclusivebrazil.dao.DestinationDaoImpl;
import br.com.exclusivebrazil.model.Destination;

@Service("destinationService")
public class DestinationService {

	@Autowired
	private DestinationDaoImpl dao;
	
	public List<Destination> destinationList() {
		return this.dao.listAll();
	}

	public Destination save(Destination destination) {
		return this.dao.save(destination);
	}

	public boolean delete(Destination destination) {
		return this.dao.delete(destination);
	}
}
