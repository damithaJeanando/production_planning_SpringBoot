package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.ProductDesignItem;
import productionplanning.production_planning.Repositories.ProductDesignItemRepository;

@RestController
@RequestMapping(value = "/ProductDesignItem")
public class ProductDesignItemController {

    @Autowired
    private ProductDesignItemRepository productDesignItemRepository;

    @GetMapping(path = "/product")
    public @ResponseBody
    Iterable<ProductDesignItem> getProductDesignItems(){
        System.out.println("get product design items");
        return productDesignItemRepository.findAll();
    }

    @GetMapping(path = "/{pd_item_id}")
    public ProductDesignItem getProductDesignItem(@PathVariable String pd_item_id){

        return productDesignItemRepository.findById(pd_item_id).get();
    }

    @PostMapping(path = "/new_pd_item")
    public ProductDesignItem newProductDesign(@RequestBody ProductDesignItem productDesignItem){


        return productDesignItemRepository.save(productDesignItem);
    }

    @PutMapping
    public void updateProductDesignItem(@RequestBody ProductDesignItem productDesignItem){

        productDesignItemRepository.save(productDesignItem);

    }

    @DeleteMapping(path = "/{pd_item_id}")
    public void deleteProductDesignItem(@PathVariable String pd_item_id) {

        productDesignItemRepository.deleteById(pd_item_id);
    }
}
