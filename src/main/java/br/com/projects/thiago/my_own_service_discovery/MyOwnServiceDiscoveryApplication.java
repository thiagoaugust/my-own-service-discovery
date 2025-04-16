package br.com.projects.thiago.my_own_service_discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MyOwnServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyOwnServiceDiscoveryApplication.class, args);
	}

}
