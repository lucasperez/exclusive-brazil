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
public class City {

	@Id
	private Long id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="state_id")
	private State state;

	@OneToMany(mappedBy="city")
	private List<Neighborhood> neighborhoodList;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="destination_city", joinColumns={@JoinColumn(name="city_id")}, inverseJoinColumns={@JoinColumn(name="destination_id")})
	private List<Destination> destinationList;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public List<Neighborhood> getNeighborhoodList() {
		return neighborhoodList;
	}

	public void setNeighborhoodList(List<Neighborhood> neighborhoodList) {
		this.neighborhoodList = neighborhoodList;
	}

	public List<Destination> getDestinationList() {
		return destinationList;
	}

	public void setDestinationList(List<Destination> destinationList) {
		this.destinationList = destinationList;
	}
	
}
