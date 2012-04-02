package br.com.exclusivebrazil.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.exclusivebrazil.model.Apartment;
import br.com.exclusivebrazil.model.ApartmentLanguage;
import br.com.exclusivebrazil.model.City;
import br.com.exclusivebrazil.model.Client;
import br.com.exclusivebrazil.model.Country;
import br.com.exclusivebrazil.model.Destination;
import br.com.exclusivebrazil.model.DestinationLanguage;
import br.com.exclusivebrazil.model.Facilities;
import br.com.exclusivebrazil.model.FacilitiesLanguage;
import br.com.exclusivebrazil.model.Hotel;
import br.com.exclusivebrazil.model.HotelLanguage;
import br.com.exclusivebrazil.model.Language;
import br.com.exclusivebrazil.model.Neighborhood;
import br.com.exclusivebrazil.model.Service;
import br.com.exclusivebrazil.model.ServiceLanguage;
import br.com.exclusivebrazil.model.ServiceSupplier;
import br.com.exclusivebrazil.model.State;

public class generateDatebase {
	
	
	public static void main(String[] args) {
		
			Configuration cf = new Configuration();

			cf.addAnnotatedClass(Apartment.class);
			cf.addAnnotatedClass(ApartmentLanguage.class);
			cf.addAnnotatedClass(City.class);
			cf.addAnnotatedClass(Client.class);
			cf.addAnnotatedClass(Country.class);
			cf.addAnnotatedClass(Destination.class);
			cf.addAnnotatedClass(DestinationLanguage.class);
			cf.addAnnotatedClass(Facilities.class);
			cf.addAnnotatedClass(FacilitiesLanguage.class);
			cf.addAnnotatedClass(Hotel.class);
			cf.addAnnotatedClass(HotelLanguage.class);			
			cf.addAnnotatedClass(Language.class);
			cf.addAnnotatedClass(Neighborhood.class);
			cf.addAnnotatedClass(Service.class);
			cf.addAnnotatedClass(ServiceLanguage.class);
			cf.addAnnotatedClass(ServiceSupplier.class);
			cf.addAnnotatedClass(State.class);
			
			new SchemaExport(cf).create(true, true);

	}

}
