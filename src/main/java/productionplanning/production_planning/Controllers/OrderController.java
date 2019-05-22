package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.OrderSales;
import productionplanning.production_planning.Repositories.OrderRepository;

@RestController
@RequestMapping(value = "/Order")
public class OrderController {

    @Autowired
    private OrderRepository orderRepository;

    @GetMapping(path = "/order")
    public @ResponseBody Iterable<OrderSales> getOrders(){
        System.out.println("get orders");
        return orderRepository.findAll();
    }

    @GetMapping(path = "/{order_id}")
    public OrderSales getOrder(@PathVariable String order_id){

        return orderRepository.findById(order_id).get();
    }

    @PostMapping(path = "/new_order")
    public OrderSales newOrder(@RequestBody OrderSales orderSales){


        return orderRepository.save(orderSales);
    }

    @PutMapping
    public void updateOrder(@RequestBody OrderSales orderSales){

        orderRepository.save(orderSales);

    }

    @DeleteMapping(path = "/{order_id}")
    public void deleteOrder(@PathVariable String order_id) {

        orderRepository.deleteById(order_id);
    }
}
