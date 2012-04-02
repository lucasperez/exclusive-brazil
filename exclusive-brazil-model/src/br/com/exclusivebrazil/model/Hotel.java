package br.com.exclusivebrazil.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Hotel implements Model {
	
	@Id
	private Long id;
	
	private String name;
	
	@Column(name="star_classification", nullable=false)
	private Integer starClassification;
	
	@ManyToOne
	@JoinColumn(name="neighborhood_id")
	private Neighborhood neighborhood;
	
	@OneToMany(mappedBy="hotel", cascade=CascadeType.ALL)
	private List<HotelLanguage> hotelLanguageList;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="hotel_facilities", joinColumns={@JoinColumn(name="hotel_id")}, inverseJoinColumns={@JoinColumn(name="facilities_id")})
	private List<Facilities> facilitiesList;

	
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

	public Integer getStarClassification() {
		return starClassification;
	}

	public void setStarClassification(Integer starClassification) {
		this.starClassification = starClassification;
	}

	public Neighborhood getNeighborhood() {
		return neighborhood;
	}

	public void setNeighborhood(Neighborhood neighborhood) {
		this.neighborhood = neighborhood;
	}

	public List<HotelLanguage> getHotelLanguageList() {
		return hotelLanguageList;
	}

	public void setHotelLanguageList(List<HotelLanguage> hotelLanguageList) {
		this.hotelLanguageList = hotelLanguageList;
	}

	public List<Facilities> getFacilitiesList() {
		return facilitiesList;
	}

	public void setFacilitiesList(List<Facilities> facilitiesList) {
		this.facilitiesList = facilitiesList;
	}
	
}
