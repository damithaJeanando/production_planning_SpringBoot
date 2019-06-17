package productionplanning.production_planning.Repositories;

import org.springframework.data.repository.CrudRepository;
import productionplanning.production_planning.Models.Inspection;

public interface InspectionRepository extends CrudRepository<Inspection, String> {

}
