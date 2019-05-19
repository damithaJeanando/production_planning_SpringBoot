package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.BillItem;

public interface BillItemRepository extends CrudRepository<BillItem, String> {
}
