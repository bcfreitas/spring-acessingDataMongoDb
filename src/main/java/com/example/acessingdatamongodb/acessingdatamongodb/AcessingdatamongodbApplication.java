package com.example.acessingdatamongodb.acessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//A anotação SpringBootApplication adicoina as seguintes:
//@Configuration - marca a classe como origen de definição de beans para o contexto da aplicação
//@EnableAutoConfiguration - usa algumas configurações padrão 
//@ComponentScan - varre componentes, configurações, serviços, controladores
@SpringBootApplication
public class AcessingdatamongodbApplication implements
	CommandLineRunner {
	
	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AcessingdatamongodbApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));
		
		System.out.println("clientes encontrados com findAll():");
		System.out.println("-----------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		
		System.out.println();
		
		System.out.println("cliente encontrado com findByFirstName('Alice')):");
		System.out.println("-----------------");
		System.out.println(repository.findByFirstName("Alice"));
		
		System.out.println("cliente encontrado com findByLastName('Smith'):");
		System.out.println("-----------------");
		for(Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
		}
		
		
	}

}
