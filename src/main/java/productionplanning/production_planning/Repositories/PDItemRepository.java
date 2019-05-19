package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.PDItem;

public interface PDItemRepository extends CrudRepository<PDItem, String> {
}
