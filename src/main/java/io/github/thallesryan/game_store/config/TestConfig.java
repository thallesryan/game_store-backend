package io.github.thallesryan.game_store.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.github.thallesryan.game_store.service.DBService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbservice;
	
	@Bean
	public void instantiate() {
		this.dbservice.instantiateDB();
	}
}
