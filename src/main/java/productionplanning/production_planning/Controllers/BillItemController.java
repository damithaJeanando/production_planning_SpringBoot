package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.BillItem;
import productionplanning.production_planning.Repositories.BillItemRepository;

@RestController
@RequestMapping(value = "/BillItem")
public class BillItemController {

    @Autowired
    private BillItemRepository billItemRepository;

    @GetMapping(path = "/billItems")
    public @ResponseBody Iterable<BillItem> getBillItems(){
        System.out.println("get Bill Items");
        return billItemRepository.findAll();
    }

    @GetMapping(path = "/{bill_item_id}")
    public BillItem getBillItem(@PathVariable String bill_item_id){

        return billItemRepository.findById(bill_item_id).get();
    }

    @PostMapping(path = "/new_bill_item")
    public BillItem newBillItem(@RequestBody BillItem billItem){


        return  billItemRepository.save(billItem);
    }

    @PutMapping
    public void updateBillItem(@RequestBody BillItem billItem){

        billItemRepository.save(billItem);

    }

    @DeleteMapping(path = "/{bill_item_id}")
    public void deleteBillItem(@PathVariable String bill_item_id) {

        billItemRepository.deleteById(bill_item_id);
    }
}
