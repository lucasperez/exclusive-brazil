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
import br.com.exclusivebrazil.service.ClientService;

@ManagedBean
@SessionScoped
public class ClientController implements Serializable{
	
	private static final long serialVersionUID = 4665978434689891248L;
	
	@ManagedProperty(name="service", value = "#{clientService}")
	private ClientService service;
	private Client client;
	private DataModel<Client> clientsList;
	
	//Metodos de Negocio
	public DataModel<Client> getList() {
		List<Client> list = service.clientList();
		clientsList = new ListDataModel<Client>(list);
		return clientsList;
	}
	
	public String save() {
		if (this.service.save(client)!=null) {
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
		this.client = clientsList.getRowData();
		if (this.service.delete(client)) {
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
		this.client = new Client();
		return "form";
	}
	
	public String prepareUpdate() {
		this.client = clientsList.getRowData();
		return "form";
	}
	
	
	//Metodos de acesso
	public ClientService getService() {
		return service;
	}

	public void setService(ClientService service) {
		this.service = service;
	}

	public DataModel<Client> getClientsList() {
		return clientsList;
	}

	public void setClientsList(DataModel<Client> clientsList) {
		this.clientsList = clientsList;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
}
