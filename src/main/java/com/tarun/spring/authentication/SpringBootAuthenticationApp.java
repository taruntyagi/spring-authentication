package com.tarun.spring.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * The Class SpringBootAuthenticationApp.
 * 
 * @author taruntyagi
 */
public class SpringBootAuthenticationApp extends SpringBootServletInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.boot.web.support.SpringBootServletInitializer#
	 * configure(org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringBootAuthenticationApp.class);
	}

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 * @throws Exception
	 *             the exception
	 */
	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringBootAuthenticationApp.class, args);
	}
}
