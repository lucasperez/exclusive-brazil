package br.com.exclusivebrazil.util;

import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import br.com.exclusivebrazil.model.Destination;
import br.com.exclusivebrazil.model.DestinationLanguage;
import br.com.exclusivebrazil.model.Language;

public class generateDatebase {
	
	
	public static void main(String[] args) {
		
			Configuration cf = new Configuration();

			cf.addAnnotatedClass(Language.class);
			cf.addAnnotatedClass(Destination.class);
			cf.addAnnotatedClass(DestinationLanguage.class);
			
			new SchemaExport(cf).create(true, true);

	}

}
