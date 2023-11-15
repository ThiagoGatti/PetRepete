package br.com.PetRepete;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class PetRepeteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetRepeteApplication.class, args);
	}

}
