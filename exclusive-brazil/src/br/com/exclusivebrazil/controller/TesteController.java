package br.com.exclusivebrazil.controller;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;

import br.com.exclusivebrazil.model.Hotel;
import br.com.exclusivebrazil.service.HotelService;

@ManagedBean
@ApplicationScoped
public class TesteController implements Serializable{
	
	private static final long serialVersionUID = 4665978434689891248L;
	
	@ManagedProperty(name="service", value = "#{hotelService}")
	private HotelService service;
	private Hotel hotel;
	private DataModel<Hotel> hotelList;
	
	public DataModel<Hotel> getList() {
		List<Hotel> lista = service.listHotels();
		hotelList = new ListDataModel(lista);
		return hotelList;
	}

	public HotelService getService() {
		return service;
	}

	public void setService(HotelService service) {
		this.service = service;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public DataModel<Hotel> getHotelList() {
		return hotelList;
	}

	public void setHotelList(DataModel<Hotel> hotelList) {
		this.hotelList = hotelList;
	}

	
	
}
