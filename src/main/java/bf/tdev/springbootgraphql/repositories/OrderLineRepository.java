package bf.tdev.springbootgraphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bf.tdev.springbootgraphql.models.OrderLine;

public interface OrderLineRepository extends JpaRepository<OrderLine,Long>{

}
