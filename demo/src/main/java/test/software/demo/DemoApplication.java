package test.software.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public String main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		return "Please Work!!!!";
	}

}
