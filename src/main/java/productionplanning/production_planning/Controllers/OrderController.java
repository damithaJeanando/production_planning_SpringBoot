package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.Order;
import productionplanning.production_planning.Repositories.OrderRepository;

@RestController
@RequestMapping(value = "/Order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(path = "/order")
    public @ResponseBody Iterable<Order> getOrders(){
        System.out.println("get orders");
        return orderRepository.findAll();
    }

    @GetMapping(path = "/{order_id}")
    public Order getOrder(@PathVariable String order_id){

        return orderRepository.findById(order_id).get();
    }

    @PostMapping(path = "/new_order")
    public Order newOrder(@RequestBody Order order){


        return orderRepository.save(order);
    }

    @PutMapping
    public void updateOrder(@RequestBody Order order){

        orderRepository.save(order);

    }

    @DeleteMapping(path = "/{order_id}")
    public void deleteOrder(@PathVariable String order_id) {

        orderRepository.deleteById(order_id);
    }
}
