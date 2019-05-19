package productionplanning.production_planning.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import productionplanning.production_planning.Models.Product;
import productionplanning.production_planning.Repositories.ProductRepository;

@RestController
@RequestMapping(value = "/Product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/product")
    public @ResponseBody Iterable<Product> getProducts(){
        System.out.println("get products");
        return productRepository.findAll();
    }

    @GetMapping(path = "/{product_id}")
    public Product getProduct(@PathVariable String product_id){

        return productRepository.findById(product_id).get();
    }

    @PostMapping(path = "/new_order")
    public Product newProduct(@RequestBody Product product){


        return productRepository.save(product);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product){

        productRepository.save(product);

    }

    @DeleteMapping(path = "/{product_id}")
    public void deleteProduct(@PathVariable String product_id) {

        productRepository.deleteById(product_id);
    }
}
