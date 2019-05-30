package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.SalesOrder;
import productionplanning.production_planning.Repositories.SalesOrderRepository;

@RestController
@RequestMapping(value = "/Order")
public class SalesOrderController {

    @Autowired
    private SalesOrderRepository salesOrderRepository;

    @GetMapping(path = "/order")
    public @ResponseBody Iterable<SalesOrder> getOrders(){
        System.out.println("get orders");
        return salesOrderRepository.findAll();
    }

    @GetMapping(path = "/{order_id}")
    public SalesOrder getOrder(@PathVariable String order_id){

        return salesOrderRepository.findById(order_id).get();
    }

    @PostMapping(path = "/new_order")
    public SalesOrder newOrder(@RequestBody SalesOrder salesOrder){
        System.out.println("new sales order");

        return salesOrderRepository.save(salesOrder);
    }

    @PutMapping
    public void updateOrder(@RequestBody SalesOrder salesOrder){

        salesOrderRepository.save(salesOrder);

    }

    @DeleteMapping(path = "/{order_id}")
    public void deleteOrder(@PathVariable String order_id) {

        salesOrderRepository.deleteById(order_id);
    }
}
