package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.SalesOrder;

public interface SalesOrderRepository extends CrudRepository<SalesOrder, String> {
}
