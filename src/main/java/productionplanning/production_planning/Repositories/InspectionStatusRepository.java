package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.InspectionStatus;

public interface InspectionStatusRepository extends CrudRepository<InspectionStatus, String> {
}
