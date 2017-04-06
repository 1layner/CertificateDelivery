package br.com.certificateDelivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.certificateDelivery.utils.AppContext;

@SpringBootApplication
public class App {
	
	public static void main(String[] args){
		SpringApplication.run(AppContext.class, args);
	}	
}