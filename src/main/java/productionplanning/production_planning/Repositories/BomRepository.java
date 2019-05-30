package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.BOM;
import productionplanning.production_planning.Models.OrderItem;

import java.util.Optional;

public interface BomRepository extends CrudRepository<BOM, String> {
   Optional<BOM> findByOrderItemId(OrderItem orderItem);
}
