package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.RNStatus;

public interface RNStatusRepository extends CrudRepository<RNStatus, String> {
}
