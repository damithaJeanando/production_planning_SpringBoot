package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.Inspection;
import productionplanning.production_planning.Models.OrderItem;

public interface OrderItemRepository extends CrudRepository<OrderItem, Integer> {
    Iterable<Inspection> findAllByOrderItemStatus(String orderItemStatus);
}
