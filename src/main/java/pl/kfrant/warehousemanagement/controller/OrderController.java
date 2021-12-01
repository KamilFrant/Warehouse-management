package pl.kfrant.warehousemanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import pl.kfrant.warehousemanagement.model.Order;
import pl.kfrant.warehousemanagement.service.OrderService;


@Controller
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/orders")
    public String ordersList(Model model){
        model.addAttribute("listOrders",orderService.getAllOrders());
        return "order_list";
    }

    @GetMapping("/addOrder")
    public String newOrderForm(Model model){
        Order order = new Order();
        model.addAttribute("order",order);
        return "add_order";
    }

    @PostMapping("/saveOrder")
    public String saveOrder(@ModelAttribute("order") Order order) {
        orderService.saveOrder(order);
        return "redirect:/orders";
    }

    @GetMapping("/updateOrder/{id}")
    public String updateProductForm(@PathVariable(value = "id") Integer id, Model model){
        Order order = orderService.getOrderById(id);
        model.addAttribute("order", order);
        return "update_order";

    }

    @GetMapping("/deleteOrder/{id}")
    public String deleteOrder(@PathVariable(value = "id") Integer id){
        this.orderService.deleteOrderById(id);
        return "redirect:/orders";
    }
}
