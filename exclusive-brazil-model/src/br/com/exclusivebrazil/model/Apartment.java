package br.com.exclusivebrazil.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Apartment {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="apartment_facilities", joinColumns={@JoinColumn(name="apartment_id")}, inverseJoinColumns={@JoinColumn(name="facilities_id")})
	private List<Facilities> facilitiesList;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Facilities> getFacilitiesList() {
		return facilitiesList;
	}

	public void setFacilitiesList(List<Facilities> facilitiesList) {
		this.facilitiesList = facilitiesList;
	}
	
}
