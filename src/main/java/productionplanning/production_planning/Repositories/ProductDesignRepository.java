package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.ProductDesign;

public interface ProductDesignRepository extends CrudRepository<ProductDesign, String> {
}
