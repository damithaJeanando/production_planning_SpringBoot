package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.OrderItem;
import productionplanning.production_planning.Repositories.OrderItemRepository;

@RestController
@RequestMapping(value = "/OrderItem")
public class OrderItemController {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @GetMapping(path = "/order_item")
    public @ResponseBody Iterable<OrderItem> getOrderItems(){
        System.out.println("get order items");
        return orderItemRepository.findAll();
    }

    @GetMapping(path = "/{order_item_id}")
    public OrderItem getOrderItem(@PathVariable String order_item_id){

        return orderItemRepository.findById(order_item_id).get();
    }

    @PostMapping(path = "/new_order")
    public OrderItem newOrderItem(@RequestBody OrderItem orderItem){


        return orderItemRepository.save(orderItem);
    }

    @PutMapping
    public void updateOrderItem(@RequestBody OrderItem orderItem){

        orderItemRepository.save(orderItem);

    }

    @DeleteMapping(path = "/{order_item_id}")
    public void deleteOrderItem(@PathVariable String order_item_id) {

        orderItemRepository.deleteById(order_item_id);
    }
}
