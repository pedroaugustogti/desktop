package br.com.template.persistencia;

import com.google.inject.Inject;
import com.google.inject.persist.PersistService;

public class ApplicationInitializer {

	@Inject
	ApplicationInitializer(PersistService persistenceService) {
		persistenceService.start();
	}
}