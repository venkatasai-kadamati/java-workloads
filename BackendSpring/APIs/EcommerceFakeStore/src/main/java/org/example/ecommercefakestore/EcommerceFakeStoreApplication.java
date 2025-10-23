package org.example.ecommercefakestore;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceFakeStoreApplication {

	public static void main(String[] args) {
		// if we want to load something, we should do it before the springboot server
        // load env variables from .env file
        Dotenv dotenv = Dotenv.configure().load();

        // set system properties: simply take those dotenv defined variable into os.
        dotenv.entries().forEach(entry -> {
            System.setProperty(entry.getKey(), entry.getValue());
        });
        SpringApplication.run(EcommerceFakeStoreApplication.class, args);
	}

}
