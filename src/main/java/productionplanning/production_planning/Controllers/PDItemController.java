package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.PDItem;
import productionplanning.production_planning.Repositories.PDItemRepository;

@RestController
@RequestMapping(value = "/ProductDesignItem")
public class PDItemController {

    @Autowired
    private PDItemRepository PDItemRepository;

    @GetMapping(path = "/product")
    public @ResponseBody
    Iterable<PDItem> getProductDesignItems(){
        System.out.println("get product design items");
        return PDItemRepository.findAll();
    }

    @GetMapping(path = "/{pd_item_id}")
    public PDItem getProductDesignItem(@PathVariable String pd_item_id){

        return PDItemRepository.findById(pd_item_id).get();
    }

    @PostMapping(path = "/new_pd_item")
    public PDItem newProductDesign(@RequestBody PDItem PDItem){


        return PDItemRepository.save(PDItem);
    }

    @PutMapping
    public void updateProductDesignItem(@RequestBody PDItem PDItem){

        PDItemRepository.save(PDItem);

    }

    @DeleteMapping(path = "/{pd_item_id}")
    public void deleteProductDesignItem(@PathVariable String pd_item_id) {

        PDItemRepository.deleteById(pd_item_id);
    }
}
