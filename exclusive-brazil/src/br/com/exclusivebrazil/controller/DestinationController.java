package br.com.exclusivebrazil.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.exclusivebrazil.model.Client;
import br.com.exclusivebrazil.model.Destination;
import br.com.exclusivebrazil.service.ClientService;
import br.com.exclusivebrazil.service.DestinationService;

@ManagedBean
@SessionScoped
public class DestinationController implements Serializable{
	
	private static final long serialVersionUID = 4665978434689891248L;
	
	@ManagedProperty(name="service", value = "#{destinationService}")
	private DestinationService service;
	private Destination destination;
	private DataModel<Destination> clientsList;
	
	//Metodos de Negocio
	public DataModel<Destination> getList() {
		List<Destination> list = service.clientList();
		clientsList = new ListDataModel(list);
		return clientsList;
	}
	
	public String save() {
		if (this.service.save(destination)!=null) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Contato salvo",  null);
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		else {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro na hora de salvar",  null);
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			FacesContext.getCurrentInstance().addMessage(null, message);

		}
		return "list";
	}

	public void delete(ActionEvent event) {
		this.destination = clientsList.getRowData();
		if (this.service.delete(destination)) {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Contato excluído",  null);
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			FacesContext.getCurrentInstance().addMessage(null, message);
		}
		else {
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR, "Erro na hora de excluir",  null);
			FacesContext.getCurrentInstance().getExternalContext().getFlash().setKeepMessages(true);
			FacesContext.getCurrentInstance().addMessage(null, message);

		}
	}

	
	public String prepareInsert() {
		this.destination = new Destination();
		return "form";
	}
	
	public String prepareUpdate() {
		this.destination = clientsList.getRowData();
		return "form";
	}

	public DestinationService getService() {
		return service;
	}

	public void setService(DestinationService service) {
		this.service = service;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public DataModel<Destination> getClientsList() {
		return clientsList;
	}

	public void setClientsList(DataModel<Destination> clientsList) {
		this.clientsList = clientsList;
	}
	
	
	
	
}
