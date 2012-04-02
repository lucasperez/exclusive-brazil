package br.com.exclusivebrazil.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Facilities {

	@Id
	private Long id;

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
}
