package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.OrderSales;

public interface OrderRepository extends CrudRepository<OrderSales, String> {
}
