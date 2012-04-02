package br.com.exclusivebrazil.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.exclusivebrazil.model.Hotel;

@Repository
public class HotelDaoImpl implements GenericDao<Hotel> {

	@Override
	public List<Hotel> list() {

		return new ArrayList<Hotel>();
	}
	
}
