package com.nt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	
	@Bean(name = "messageSource")
	public ResourceBundleMessageSource getMessageSource() {
		ResourceBundleMessageSource rbm = new ResourceBundleMessageSource();
		rbm.setBasename("com/nt/commons/Base");
		return rbm;
	}

}
