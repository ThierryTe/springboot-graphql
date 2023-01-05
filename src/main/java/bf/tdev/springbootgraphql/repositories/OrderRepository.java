package bf.tdev.springbootgraphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bf.tdev.springbootgraphql.models.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
