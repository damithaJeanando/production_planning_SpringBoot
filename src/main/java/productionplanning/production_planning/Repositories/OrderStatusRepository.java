package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.OrderStatus;

public interface OrderStatusRepository extends CrudRepository<OrderStatus, String> {
}
