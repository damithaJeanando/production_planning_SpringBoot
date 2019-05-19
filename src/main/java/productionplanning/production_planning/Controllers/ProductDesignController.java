package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.ProductDesign;
import productionplanning.production_planning.Repositories.ProductDesignRepository;

@RestController
@RequestMapping(value = "/ProductDesign")
public class ProductDesignController {

    @Autowired
    private ProductDesignRepository productDesignRepository;

    @GetMapping(path = "/product_designs")
    public @ResponseBody Iterable<ProductDesign> getProductDesigns(){
        System.out.println("get product designs");
        return productDesignRepository.findAll();
    }

    @GetMapping(path = "/{product_design_id}")
    public ProductDesign getProductDesign(@PathVariable String product_design_id){

        return productDesignRepository.findById(product_design_id).get();
    }

    @PostMapping(path = "/new_order")
    public ProductDesign newProductDesign(@RequestBody ProductDesign productDesign){


        return productDesignRepository.save(productDesign);
    }

    @PutMapping
    public void updateProductDesign(@RequestBody ProductDesign productDesign){

        productDesignRepository.save(productDesign);

    }

    @DeleteMapping(path = "/{product_design_id}")
    public void deleteProductDesign(@PathVariable String product_design_id) {

        productDesignRepository.deleteById(product_design_id);
    }
}
