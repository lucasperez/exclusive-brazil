package br.com.exclusivebrazil.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Service {

	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="destination_id")
	private Destination destination;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="supplier_service", joinColumns={@JoinColumn(name="service_id")}, inverseJoinColumns={@JoinColumn(name="supplier_id")})
	private List<ServiceSupplier> supplierList;
	
	@OneToMany(mappedBy="service", cascade=CascadeType.ALL)
	private List<ServiceLanguage> serviceLanguageList;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public List<ServiceSupplier> getSupplierList() {
		return supplierList;
	}

	public void setSupplierList(List<ServiceSupplier> supplierList) {
		this.supplierList = supplierList;
	}

	public List<ServiceLanguage> getServiceLanguageList() {
		return serviceLanguageList;
	}

	public void setServiceLanguageList(List<ServiceLanguage> serviceLanguageList) {
		this.serviceLanguageList = serviceLanguageList;
	}
	
}
