package bf.tdev.springbootgraphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bf.tdev.springbootgraphql.models.Salesperson;

public interface SalespersonRepository extends JpaRepository<Salesperson,Long> {

}
