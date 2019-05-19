package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.OrderStatus;
import productionplanning.production_planning.Repositories.OrderStatusRepository;

@RestController
@RequestMapping(value = "/OrderStatus")
public class OrderStatusController {

    @Autowired
    private OrderStatusRepository orderStatusRepository;

    @GetMapping(path = "/all_order_Status")
    public @ResponseBody Iterable<OrderStatus> getAllOrderStatus(){
        System.out.println("get all order status");
        return orderStatusRepository.findAll();
    }

    @GetMapping(path = "/{orderStatus_id}")
    public OrderStatus getOrderStatus(@PathVariable String orderStatus_id){

        return orderStatusRepository.findById(orderStatus_id).get();
    }

    @PostMapping(path = "/new_orderStatus")
    public OrderStatus newOrderStatus(@RequestBody OrderStatus orderStatus){


        return orderStatusRepository.save(orderStatus);
    }

    @PutMapping
    public void updateOrderStatus(@RequestBody OrderStatus orderStatus){

        orderStatusRepository.save(orderStatus);

    }

    @DeleteMapping(path = "/{orderStatus_id}")
    public void deleteOrderStatus(@PathVariable String orderStatus_id) {

        orderStatusRepository.deleteById(orderStatus_id);
    }
}
