package bf.tdev.springbootgraphql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import bf.tdev.springbootgraphql.models.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
