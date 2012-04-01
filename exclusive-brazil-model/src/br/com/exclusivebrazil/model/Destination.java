package br.com.exclusivebrazil.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Destination implements Model {
	
	@Id
	private Long id;
	private String name;
	@OneToMany(mappedBy="destination")
	private List<DestinationLanguage> destinationLanguageList;
	
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
	
}
