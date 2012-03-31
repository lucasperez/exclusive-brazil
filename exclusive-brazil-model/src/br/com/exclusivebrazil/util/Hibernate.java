package br.com.exclusivebrazil.util;

import org.hibernate.SessionFactory;
import org.hibernate.SessionFactoryObserver;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import br.com.exclusivebrazil.model.Destination;
import br.com.exclusivebrazil.model.DestinationLanguage;
import br.com.exclusivebrazil.model.Language;

public class Hibernate {

	private static final SessionFactory factory;
	private static final ServiceRegistry registry;

	static {
		Configuration cf = new Configuration();

		registry = new ServiceRegistryBuilder().applySettings(cf.getProperties()).buildServiceRegistry();

		cf.setSessionFactoryObserver(new SessionFactoryObserver() {

			private static final long serialVersionUID = 1L;

			@Override
			public void sessionFactoryCreated(SessionFactory arg0) {
			// TODO Auto-generated method stub
			
			}

			@Override
			public void sessionFactoryClosed(SessionFactory arg0) {
			// TODO Auto-generated method stub
			
			}
		});

		cf.addAnnotatedClass(Language.class);
		cf.addAnnotatedClass(Destination.class);
		cf.addAnnotatedClass(DestinationLanguage.class);

		factory = cf.buildSessionFactory(registry);
	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

}