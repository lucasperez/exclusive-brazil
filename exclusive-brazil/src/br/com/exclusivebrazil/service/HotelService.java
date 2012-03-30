package br.com.exclusivebrazil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.exclusivebrazil.dao.GenericDao;
import br.com.exclusivebrazil.model.Hotel;


@Service("hotelService")
public class HotelService {
	
	@Autowired
	private GenericDao<Hotel> dao;
	
	public List<Hotel> listHotels() {
		return this.dao.list();
	}
	
}
