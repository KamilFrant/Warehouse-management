package pl.kfrant.warehousemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.kfrant.warehousemanagement.model.Order;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
