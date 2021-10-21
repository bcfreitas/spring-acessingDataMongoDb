package com.example.acessingdatamongodb.acessingdatamongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

//a interface extende MongoRepository<tipo_do_dado, id>
//MongoRepository possui o crud básico.
public interface CustomerRepository extends MongoRepository<Customer, String>{
	
	//o spring starter Spring Data MongoDB dispensa a implementação manual para esta iinterface.
	public Customer findByFirstName(String firstName);
	public List<Customer> findByLastName(String lastName);
	

}
