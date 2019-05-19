package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.ProductDesignItem;

public interface ProductDesignItemRepository extends CrudRepository<ProductDesignItem, String> {
}
