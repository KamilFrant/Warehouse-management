package pl.kfrant.warehousemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kfrant.warehousemanagement.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
