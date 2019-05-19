package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.Product;

public interface ProductRepository extends CrudRepository<Product, String> {
}
