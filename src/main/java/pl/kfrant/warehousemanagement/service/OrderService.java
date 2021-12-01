package pl.kfrant.warehousemanagement.service;

import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.kfrant.warehousemanagement.model.Order;
import pl.kfrant.warehousemanagement.model.Product;
import pl.kfrant.warehousemanagement.repository.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();
    }

    public void saveOrder(Order order){
        this.orderRepository.save(order);
    }

    public Order getOrderById(Integer id){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        Order order = null;
        if(optionalOrder.isPresent()){
            order = optionalOrder.get();
        }else {
            throw new RuntimeException("Order with id: "+id+" not found ");
        }
        return order;
    }

    public void deleteOrderById(Integer id){
        this.orderRepository.deleteById(id);
    }
}
