package br.com.template.persistencia;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;

public class Persistence {

	public static final String PU_NAME = "template";
	
	private static Injector inject;
	
	static {
		
		if (inject == null){
			
			inject = Guice.createInjector(new JpaPersistModule(PU_NAME));
			inject.getInstance(ApplicationInitializer.class);
		}
	}
	
	public static <T> T getInstance(Class<T> type){
		return inject.getInstance(type);
	}
}