package bf.tdev.springbootgraphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import bf.tdev.springbootgraphql.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long>{
	Customer findCustomerByEmail(String email);
}
