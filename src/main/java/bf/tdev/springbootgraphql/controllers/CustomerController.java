package bf.tdev.springbootgraphql.controllers;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import bf.tdev.springbootgraphql.models.Customer;
import bf.tdev.springbootgraphql.models.CustomerInput;
import bf.tdev.springbootgraphql.repositories.CustomerRepository;

@Controller
public class CustomerController {
	private final CustomerRepository customerRepository;
	
	public CustomerController(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	//Liste de tous les clients
	@QueryMapping
	public Iterable<Customer>customers(){
		return this.customerRepository.findAll();
	}
	
	//Lister un client par son ID
	@QueryMapping
	public Customer customerById(@Argument Long id) {
		return this.customerRepository.findById(id).orElseThrow();
	}
	
	//Obtenir un client par son adresse email
	@QueryMapping
	public Customer customerByEmail(@Argument String email) {
		return this.customerRepository.findCustomerByEmail(email);
	}
	
	//Création d'un client
	@MutationMapping
	public Customer addCustomer(@Argument(name="input") CustomerInput customerInput) {
		return this.customerRepository.save(customerInput.getCustomerEntity());
	}
}
