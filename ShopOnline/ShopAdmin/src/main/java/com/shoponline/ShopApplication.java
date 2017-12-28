package com.shoponline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.vendor.HibernateJpaSessionFactoryBean;

@SpringBootApplication
public class ShopApplication {
	/**
	 * @author Priyakshi
	 * @description Main method where the execution of Spring Boot application
	 *              begins
	 * @param arg
	 */

	public static void main(String arg[]) {
		SpringApplication.run(ShopApplication.class, arg);

	}

	@Bean
	public HibernateJpaSessionFactoryBean sessionFactoryBean() {
		return new HibernateJpaSessionFactoryBean();
	}

}
