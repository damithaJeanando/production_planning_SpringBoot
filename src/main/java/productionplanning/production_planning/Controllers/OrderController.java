package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.SalesOrder;
import productionplanning.production_planning.Repositories.OrderRepository;

@RestController
@RequestMapping(value = "/Order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(path = "/order")
    public @ResponseBody Iterable<SalesOrder> getOrders(){
        System.out.println("get orders");
        return orderRepository.findAll();
    }

    @GetMapping(path = "/{order_id}")
    public SalesOrder getOrder(@PathVariable String order_id){

        return orderRepository.findById(order_id).get();
    }

    @PostMapping(path = "/new_order")
    public SalesOrder newOrder(@RequestBody SalesOrder salesOrder){


        return orderRepository.save(salesOrder);
    }

    @PutMapping
    public void updateOrder(@RequestBody SalesOrder salesOrder){

        orderRepository.save(salesOrder);

    }

    @DeleteMapping(path = "/{order_id}")
    public void deleteOrder(@PathVariable String order_id) {

        orderRepository.deleteById(order_id);
    }
}
