package com.github.pires.example.test;

import java.sql.SQLException;

import org.junit.Test;

import br.com.template.persistencia.ApplicationInitializer;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.persist.jpa.JpaPersistModule;

public class PersistenceTest {

	private static final String TEST_PU_NAME = "testPU";

	@Test
	public void testDb() throws SQLException {
		// inject stuff
		Injector injector = Guice
		    .createInjector(new JpaPersistModule(TEST_PU_NAME));
		injector.getInstance(ApplicationInitializer.class);
	}

}