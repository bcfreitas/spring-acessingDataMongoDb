package com.example.acessingdatamongodb.acessingdatamongodb;

import org.springframework.data.annotation.Id;

//o mongoDB armazena dados em coleções, e irá mapear
//Customer para uma coleção chamada customer. Para mudar poderia
//usar a anotação @Document
public class Customer {

	@Id
	public String id;
	//atributos abaixo não estão anotados pq estão mapeados para campos com nomes iguais
	public String firstName;
	public String lastName;
	
	public Customer() {}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	@Override
	public String toString() {
		return String.format("Customer[id='%s', firstName='%s', lastName='%s'", id, firstName, lastName);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
