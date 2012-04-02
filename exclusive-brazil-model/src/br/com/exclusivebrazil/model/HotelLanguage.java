package br.com.exclusivebrazil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="hotel_language")
public class HotelLanguage implements Model {
	
	@Id
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="hotel_id")
	private Hotel hotel;
	
	@ManyToOne
	@JoinColumn(name="language_id")
	private Language language;
	
	@Column(columnDefinition="text")
	private String description;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
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
