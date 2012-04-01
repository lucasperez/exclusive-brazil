package br.com.exclusivebrazil.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="destination_language")
public class DestinationLanguage implements Model {
	
	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="destination_id")
	private Destination destination;
	
	@ManyToOne
	@JoinColumn(name="language_id")
	private Language language;
	
	private String description;

	
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

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
