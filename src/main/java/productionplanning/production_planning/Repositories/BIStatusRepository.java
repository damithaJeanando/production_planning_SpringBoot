package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.BIStatus;

public interface BIStatusRepository extends CrudRepository<BIStatus, String> {
}
