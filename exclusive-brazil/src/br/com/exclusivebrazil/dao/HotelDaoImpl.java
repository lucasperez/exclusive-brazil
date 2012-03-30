package br.com.exclusivebrazil.dao;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Repository;

import br.com.exclusivebrazil.model.Hotel;

import com.google.common.collect.Lists;

@Repository
public class HotelDaoImpl implements GenericDao<Hotel> {

	@Override
	public List<Hotel> list() {
		List<Hotel> hotelList = Lists.newArrayList(
				new Hotel(1l, "Caesar Park Ipanema"),
				new Hotel(2l, "Copacabana Palace"),
				new Hotel(3l, "Sheraton Rio"),
				new Hotel(4l, "Byblos"),
				new Hotel(5l, "Ipanema Plaza"));
		return hotelList;
	}
	
}
