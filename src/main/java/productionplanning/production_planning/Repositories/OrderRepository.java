package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.Order;

public interface OrderRepository extends CrudRepository<Order, String> {
}
