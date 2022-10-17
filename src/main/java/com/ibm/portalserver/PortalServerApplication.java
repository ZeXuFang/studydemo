package com.ibm.portalserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@MapperScan("com.ibm.portalserver.mapper")
@SpringBootApplication
public class PortalServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortalServerApplication.class, args);
	}

}
