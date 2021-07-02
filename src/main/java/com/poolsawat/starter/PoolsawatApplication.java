package com.poolsawat.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PoolsawatApplication implements CommandLineRunner{
	
	private static final Logger logger = LoggerFactory.getLogger(PoolsawatApplication.class);
	
	@Value("${api.endpoint}")
	private String apiEndpointUrl;
	
	@Value("${server.port}")
	private String serverPort;

	public static void main(String[] args) {
		SpringApplication.run(PoolsawatApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("server.port ::=="+serverPort);
		logger.info("api.endpoint ::=="+apiEndpointUrl);
		logger.info("spring boot loaded");
		logger.info("git client ::==");
	}
	
}
