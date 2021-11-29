package ar.edu.unnoba.poo2021;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ar.edu.ar.unnoba.poo2021")
@SpringBootApplication
public class Poo2021Application {

	public static void main(String[] args) {
		SpringApplication.run(Poo2021Application.class, args);
	}

}
