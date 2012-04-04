package br.com.exclusivebrazil.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.exclusivebrazil.model.Client;
import br.com.exclusivebrazil.model.Hotel;
import br.com.exclusivebrazil.service.ClientService;

@ManagedBean
@ApplicationScoped
public class TesteController implements Serializable{
	
	private static final long serialVersionUID = 4665978434689891248L;
	
	@ManagedProperty(name="service", value = "#{clientService}")
	private ClientService service;
	private Hotel hotel;
	private DataModel<Client> clientsList;
	
	public DataModel<Client> getList() {
		List<Client> list = service.clientList();
		clientsList = new ListDataModel(list);
		return clientsList;
	}

	public ClientService getService() {
		return service;
	}

	public void setService(ClientService service) {
		this.service = service;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public DataModel<Client> getClientsList() {
		return clientsList;
	}

	public void setClientsList(DataModel<Client> clientsList) {
		this.clientsList = clientsList;
	}



	
	
}
