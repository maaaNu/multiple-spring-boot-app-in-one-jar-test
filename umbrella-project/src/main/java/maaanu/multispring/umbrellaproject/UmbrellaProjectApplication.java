package maaanu.multispring.umbrellaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"maaanu", "nichtmanu"})
public class UmbrellaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(UmbrellaProjectApplication.class, args);
	}
}
