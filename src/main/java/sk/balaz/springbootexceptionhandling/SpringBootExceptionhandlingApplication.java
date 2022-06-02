package sk.balaz.springbootexceptionhandling;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import sk.balaz.springbootexceptionhandling.customer.Customer;
import sk.balaz.springbootexceptionhandling.customer.CustomerService;

@SpringBootApplication
public class SpringBootExceptionhandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExceptionhandlingApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(CustomerService customerService) {
		return args -> {
			customerService.createCustomer(
					new Customer(null, "test1", "tes1@gmail.com"));

			customerService.createCustomer(
					new Customer(null, "test2", "tes2@gmail.com"));
		};
	}

}
