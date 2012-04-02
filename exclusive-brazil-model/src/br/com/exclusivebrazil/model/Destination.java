package br.com.exclusivebrazil.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Destination implements Model {
	
	@Id
	private Long id;
	
	private String name;
	
	@OneToMany(mappedBy="destination", cascade=CascadeType.ALL)
	private List<DestinationLanguage> destinationLanguageList;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="destination_city", joinColumns={@JoinColumn(name="destination_id")}, inverseJoinColumns={@JoinColumn(name="city_id")})
	private List<City> cityList;
	
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
	
	public List<DestinationLanguage> getDestinationLanguageList() {
		return destinationLanguageList;
	}
	
	public void setDestinationLanguageList(
			List<DestinationLanguage> destinationLanguageList) {
		this.destinationLanguageList = destinationLanguageList;
	}

	public List<City> getCityList() {
		return cityList;
	}

	public void setCityList(List<City> cityList) {
		this.cityList = cityList;
	}
	
}
